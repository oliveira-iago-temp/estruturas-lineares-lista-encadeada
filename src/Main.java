public class Main {
    public static void main(String[] args) {

        /***************************************************
            PARTE 1: INICIALIZANDO LISTA
         ***************************************************/
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        System.out.println("\n[INICIALIZANDO LISTA]");

        System.out.println("\nIniciando lista com 'elemento1'");
        listaEncadeada.adicionarInicio("elemento1");

        System.out.print("Resultado: ");
        listaEncadeada.exibirElementos();



        /***************************************************
         PARTE 2: ADICIONANDO ELEMENTOS
         ***************************************************/
        System.out.println("\n\n[ADICIONANDO ELEMENTOS]");

        System.out.println("\nAdicionando 'elemento2' na posição 0");
        listaEncadeada.adicionar("elemento2", 0);

        System.out.print("Resultado: ");
        listaEncadeada.exibirElementos();

        System.out.println("\nAdicionando 'elemento3' na posição 1");
        listaEncadeada.adicionar("elemento3", 1);

        System.out.print("Resultado: ");
        listaEncadeada.exibirElementos();

        System.out.println("\nAdicionando 'elemento4' na posição 1");
        listaEncadeada.adicionar("elemento4", 1);

        System.out.print("Resultado: ");
        listaEncadeada.exibirElementos();

        System.out.println("Tamanho lista: "+ listaEncadeada.getTamanho());



        /***************************************************
         PARTE 3: BUSCANDO ELEMENTOS
         ***************************************************/
        System.out.println("\n\n[BUSCANDO ELEMENTOS]");

        System.out.println("\nBuscando elemento da posição 0");
        System.out.print("Resultado: ");
        listaEncadeada.buscar(0).imprimir();

        System.out.println("\n\nBuscando elemento da posição 1");
        System.out.print("Resultado: ");
        listaEncadeada.buscar(1).imprimir();

        System.out.println("\n\nBuscando elemento da posição 2");
        System.out.print("Resultado: ");
        listaEncadeada.buscar(2).imprimir();

        System.out.println("\n\nBuscando elemento da posição 3");
        System.out.print("Resultado: ");
        listaEncadeada.buscar(3).imprimir();



        /***************************************************
         PARTE 4: REMOVENDO ELEMENTOS
         ***************************************************/
        System.out.println("\n\n\n[REMOVENDO ELEMENTOS]");

        System.out.println("\nRemovendo elemento da posição 2");
        listaEncadeada.remover(2);

        System.out.print("Resultado: ");
        listaEncadeada.exibirElementos();



        /***************************************************
         PARTE 5: REMOVENDO AS EXTREMIDADES
         ***************************************************/
        System.out.println("\nRemovendo elemento da primeira posição");
        listaEncadeada.removerPrimeiraPosicao();

        System.out.print("Resultado: ");
        listaEncadeada.exibirElementos();

        System.out.println("\nRemovendo elemento da ultima posição");
        listaEncadeada.removerUltimaPosicao();

        System.out.print("Resultado: ");
        listaEncadeada.exibirElementos();

        System.out.println("\nTamanho lista: "+ listaEncadeada.getTamanho());
    }
}