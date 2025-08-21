public class ListaEncadeada<T>{

    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarInicio(T elemento) {

        if(this.tamanho == 0){
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;

            this.tamanho++;
        }
        else {
            System.out.println("\nLista encadeada já possui itens");
        }
    }

    public void adicionar(T elemento, int posicao) {
        //Lista vazia
        if(this.tamanho == 0){
            adicionarInicio(elemento);
        }
        //Posicao fora do limite
        else if (posicao > this.tamanho) {
            System.out.println("\nA posição não pode ser maior que a quantidade de itens na lista");
        }
        //Adiciona o elemento
        else {
            No<T> novoNo = new No<>(elemento);

            No<T> no = this.inicio;
            for(int i=0; i <= this.tamanho; i++){
                //Se chegou na posição anterior a que vai adicionar
                if(i == posicao-1) {
                    no.setProximo(novoNo);
                    break;
                }
                no = no.getProximo();
            }
            this.tamanho++;
        }
    }

    public void exibirElementos() {
        No<T> no = this.inicio;
        for(int i=0; i < this.tamanho; i++){
            System.out.print(no.getElemento());
            System.out.print(" - ");
            no = no.getProximo();
        }
    }

    //  NOVAS FUNÇÕES:
    //    Adicionar na posição
    //    Exibir elementos
    //    Busca No
    //    Remover primeiro elemento
    //    Remover último elemento
    //    Remover algum elemento em outra posição

}
