package aulaInterfaceList.ordenacao.pessoas;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 23, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 35, 1.46);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 18, 1.57);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 26, 1.92);

        System.out.println("Lista de pessoas sem ordenacao : ");
        System.out.println(ordenacaoPessoa.getPessoaList());
        System.out.println("\nOrdenacao por idade : ");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("\nOrdenacao por altura : ");
        System.out.println(ordenacaoPessoa.ordernarPorAltura());
    }
}
