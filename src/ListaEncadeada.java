public class ListaEncadeada<T>{

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarInicio(T elemento ) {

        if(this.tamanho == 0){
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;

        }else {
            No<T> novoNo = new No<>(elemento, this.inicio);
        }
        this.tamanho++;
    }
}
