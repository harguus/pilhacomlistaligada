public class No {
  private int numero;
  private No proximo;

  public No (int numero){
    this.numero = numero;
    this.proximo = null;
  }

  public int getNumero(){
    return this.numero;
  }

  public No getProximo(){
    return this.proximo;
  }

  public void setProximo(No no){
    this.proximo = no;
  }
}
