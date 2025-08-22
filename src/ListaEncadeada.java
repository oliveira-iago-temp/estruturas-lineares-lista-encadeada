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

            //Se o elemento adicionado deve ficar na primeira posição
            if(posicao == 0) {
                No<T> primeiroNo = this.inicio;
                novoNo.setProximo(primeiroNo);
                this.inicio = novoNo;
            }
            else {
                No<T> noAnterior = this.inicio;
                for(int i=0; i <= this.tamanho; i++){
                    No<T> noProximo = noAnterior.getProximo();

                    //Se chegou na posição anterior a que vai adicionar
                    if(i == posicao-1) {
                        if(noProximo != null) {
                            novoNo.setProximo(noProximo);
                        }
                        noAnterior.setProximo(novoNo);

                        //Se for o ultimo item da lista
                        if(posicao==this.tamanho-1) {
                            this.ultimo = novoNo;
                        }
                        break;
                    }
                    noAnterior = noAnterior.getProximo();
                }
            }
            this.tamanho++;
        }
    }

    public void remover(int posicao) {
        //Lista vazia
        if(this.tamanho == 0){
            System.out.println("\nA lista está vazia");
        }
        //Posicao fora do limite
        else if (posicao > this.tamanho) {
            System.out.println("\nA posição não pode ser maior que a quantidade de itens na lista");
        }
        //Remove o elemento
        else {
            //Se o elemento a ser removido é da primeira posição
            if(posicao == 0) {
                No<T> primeiroNo = this.inicio;
                this.inicio = primeiroNo.getProximo();
            }
            else {
                No<T> noAnterior = this.inicio;
                for(int i=0; i <= this.tamanho; i++){
                    No<T> noProximo = noAnterior.getProximo();

                    //Se chegou na posição anterior a que vai remover
                    if(i == posicao-1) {
                        if(noProximo != null) {
                            noAnterior.setProximo(noProximo.getProximo());
                        }

                        //Se for o ultimo item da lista
                        if(posicao==this.tamanho-1) {
                            this.ultimo = noAnterior;
                        }
                        break;
                    }
                    noAnterior = noAnterior.getProximo();
                }
            }
            this.tamanho--;
        }
    }

    public void removerPrimeiraPosicao() {
        remover(0);
    }

    public void removerUltimaPosicao() {
        remover(this.tamanho-1);
    }

    public No<T> buscar(int posicao) {
        if(this.tamanho == 0){
            System.out.println("Lista vazia");
            return null;
        }
        else {
            No<T> no = this.inicio;
            for (int i = 0; i < this.tamanho; i++) {
                if(i == posicao) {
                    return no;
                }
                no = no.getProximo();
            }
            System.out.println("Não encontrado");
            return null;
        }
    }

    public void exibirElementos() {
        if(this.tamanho == 0){
            System.out.println("Lista vazia");
        }
        else {
            No<T> no = this.inicio;
            for (int i = 0; i < this.tamanho; i++) {
                //Exibe o elemento e o proximo
                no.imprimir();
                no = no.getProximo();
            }
            System.out.println();
        }
    }

    //  NOVAS FUNÇÕES:
    //    [OK] Adicionar na posição ok
    //    [OK] Exibir elementos ok
    //    [OK] Busca No
    //    [OK] Remover primeiro elemento
    //    [OK] Remover último elemento
    //    [OK] Remover algum elemento em outra posição
}
