package aulaInterfaceList.map.mapApp.pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L,"Produto A", 10.0,10);
        estoque.adicionarProduto(2L,"Produto B", 2.0,50);
        estoque.adicionarProduto(3L,"Produto C", 15.0,2);

        System.out.println("PRODUTOS DISPONIVEIS: ");
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$ " + estoque.obterValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoque.obterProdutoMaisBarato());
    }
}
