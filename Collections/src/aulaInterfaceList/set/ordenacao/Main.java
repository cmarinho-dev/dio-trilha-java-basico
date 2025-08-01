package aulaInterfaceList.set.ordenacao;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(3L, "Produto 3", 20d, 10);
        cadastroProdutos.adicionarProduto(5L, "Produto 7", 11d, 10);
        cadastroProdutos.adicionarProduto(5L, "Produto 10", 1d, 9);
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);

        System.out.println("\nProdutos com ordernacao Default : \n" + cadastroProdutos.getProdutoSet());
        System.out.println("\nProdutos ordernados por nome : \n" + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("\nProdutos ordernados por preco : \n" + cadastroProdutos.exibirProdutosPorPreco());

    }
}
