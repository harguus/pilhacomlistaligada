public class No {
  public int numero;
  public No proximo;

  public No (int numero){
    this.numero = numero;
    this.proximo = null;
  }

  public int getNumero(){
    return this.numero;
  }
}
