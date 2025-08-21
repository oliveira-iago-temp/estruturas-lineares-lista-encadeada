public class Main {
    public static void main(String[] args) {

        ListaEncadeada listaEncadeada = new ListaEncadeada();

        //Adiciona o primeiro elemento da listagem
        listaEncadeada.adicionarInicio("elemento1");

        //Adiciona um elemento na listagem
        listaEncadeada.adicionar("elemento2", 1);

        System.out.println("\nTamanho lista: "+ listaEncadeada.getTamanho());

        System.out.println("\nPercorrer elementos:");
        listaEncadeada.exibirElementos();
    }
}