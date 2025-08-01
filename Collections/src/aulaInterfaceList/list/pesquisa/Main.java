package aulaInterfaceList.list.pesquisa;

public class Main {

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();
        catalagoLivros.adicionarLivro("Livro 1", "Autor 1", 2021);
        catalagoLivros.adicionarLivro("Livro 2", "Autor 4", 2022);
        catalagoLivros.adicionarLivro("Livro 3", "Autor 2", 2023);
        catalagoLivros.adicionarLivro("Livro 4", "Autor 1", 1994);
        catalagoLivros.adicionarLivro("Livro 5", "Autor 3", 2020);

        System.out.println("Pesquisa por autor :");
        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalagoLivros.pesquisarPorAutor("Autor 4"));

        System.out.println("\nPesquisa por periodo :");
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2021, 2022));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(1900, 2021));

        System.out.println("\nPesquisa por titulo :");
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 1"));
        System.out.println(catalagoLivros.pesquisarPorTitulo("Livro 4"));
    }

}
