public class PilhaComListaLigada {

    private ListaLigada lista_ligada;

    public PilhaComListaLigada() {
      this.lista_ligada = new ListaLigada();
    }

    public void push(int value){
      System.out.println("push" + value);
    }

    public int size() {
      return 0;
    }

    public boolean isEmpty() {
      return true;
    }

}
