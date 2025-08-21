public class Main {
    public static void main(String[] args) {

        ListaEncadeada listaEncadeada = new ListaEncadeada();


        System.out.println("\nIniciando lista com 'elemento1'");
        listaEncadeada.adicionarInicio("elemento1");

        System.out.println("Percorrer elementos 1:");
        listaEncadeada.exibirElementos();

        System.out.println("\nAdicionando 'elemento2' na posição 1");
        listaEncadeada.adicionar("elemento2", 1);

        System.out.println("Percorrer elementos 2:");
        listaEncadeada.exibirElementos();

        System.out.println("\nAdicionando 'elemento3' na posição 1");
        listaEncadeada.adicionar("elemento3", 1);

        System.out.println("Percorrer elementos 3:");
        listaEncadeada.exibirElementos();

        System.out.println("\nAdicionando 'elemento4' na posição 1");
        listaEncadeada.adicionar("elemento4", 1);

        System.out.println("Percorrer elementos fim:");
        listaEncadeada.exibirElementos();

        System.out.println("\nTamanho lista: "+ listaEncadeada.getTamanho());
    }
}