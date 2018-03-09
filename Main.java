public class Main{
  public static void main(String[] args) {

    PilhaComListaLigada pilha = new PilhaComListaLigada();

    try {
      pilha.push(1);
      System.out.println("Tamanho: " + pilha.size());
      pilha.push(2);
      System.out.println("Tamanho: " + pilha.size());
      pilha.push(5);
      System.out.println("Tamanho: " + pilha.size());
      System.out.println("Numero: " + pilha.top());
      pilha.imprimirPilha();
      pilha.pop();
      System.out.println("Tamanho: " + pilha.size());
      pilha.pop();
      System.out.println("Tamanho: " + pilha.size());
      pilha.pop();
      System.out.println("Tamanho: " + pilha.size());
      pilha.pop();
      System.out.println("Tamanho: " + pilha.size());
      pilha.imprimirPilha();
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}
