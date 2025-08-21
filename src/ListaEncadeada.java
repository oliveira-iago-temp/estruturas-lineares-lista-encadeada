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

            No<T> noAnterior = this.inicio;
            for(int i=0; i <= this.tamanho; i++){
                No<T> noProximo = noAnterior.getProximo();
                //Se chegou na posição anterior a que vai adicionar
                if(i == posicao-1) {
                    if(noProximo != null) {
                        novoNo.setProximo(noProximo);
                    }
                    noAnterior.setProximo(novoNo);
                    break;
                }
                noAnterior = noAnterior.getProximo();
            }
            this.tamanho++;
        }
    }

    public void remover(T elemento, int posicao) {
        //Lista vazia
        if(this.tamanho == 0){
            System.out.println("\nA lista está vazia!");
        }
        //Posicao fora do limite
        else if (posicao > this.tamanho) {
            System.out.println("\nA posição não pode ser maior que a quantidade de itens na lista");
        }
        //Adiciona o elemento
        else {
            No<T> novoNo = new No<>(elemento);

            No<T> noAnterior = this.inicio;
            for(int i=0; i <= this.tamanho; i++){
                No<T> noProximo = noAnterior.getProximo();
                //Se chegou na posição anterior a que vai adicionar
                if(i == posicao-1) {
                    if(noProximo != null) {
                        novoNo.setProximo(noProximo);
                    }
                    noAnterior.setProximo(novoNo);
                    break;
                }
                noAnterior = noAnterior.getProximo();
            }
            this.tamanho++;
        }
    }

    public void exibirElementos() {
        No<T> no = this.inicio;
        for(int i=0; i < this.tamanho; i++){
            //Exibe o elemento e o proximo
            System.out.print("[" + no.getElemento() + ",");

            no = no.getProximo();

            if(no != null) {
                System.out.print(no.getElemento());
            }
            else {
                System.out.print("~vazio~");
            }

            System.out.print("] - ");
        }
        System.out.println();
    }

    //  NOVAS FUNÇÕES:
    //    Adicionar na posição
    //    Exibir elementos
    //    Busca No
    //    Remover primeiro elemento
    //    Remover último elemento
    //    Remover algum elemento em outra posição

}
