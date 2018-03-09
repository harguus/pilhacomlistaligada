public class PilhaComListaLigada {

    private ListaLigada lista_ligada;
    private int tamanho = 0;

    public PilhaComListaLigada() {
      this.lista_ligada = new ListaLigada();
    }

    public void push(int value){
      No novoNo = new No(value);
      if (this.lista_ligada.head == null) {
        this.lista_ligada.head = novoNo;
      }else {
        No aux = this.lista_ligada.head;
        novoNo.setProximo(aux);
        this.lista_ligada.head = novoNo;
      }
      tamanho++;
    }

    public int pop() throws EPilhaVazia{
      if (this.isEmpty()) {
        throw new EPilhaVazia("A pilha está vazia");
      }else {
        int retorno = this.lista_ligada.head.getNumero();
        if (this.size() > 1) {
          this.lista_ligada.head = this.lista_ligada.head.getProximo();
          tamanho--;
          return retorno;
        }else {
          this.lista_ligada.head = null;
          tamanho--;
          return retorno;
        }
      }
    }

    public int top() throws EPilhaVazia{
      if (this.isEmpty()) {
        throw new EPilhaVazia("A pilha está vazia");
      }else {
        return this.lista_ligada.head.getNumero();
      }
    }

    public void imprimirPilha(){
      if (this.isEmpty()) {
        System.out.println("A pilha está vazia");
      }else {
        No atual = this.lista_ligada.head;
        while (atual != null) {
          System.out.println("Número: " + atual.getNumero());
          atual = atual.getProximo();
        }
      }
    }

    public int size() {
      return tamanho;
    }

    public boolean isEmpty() {
      return tamanho == 0;
    }

}
