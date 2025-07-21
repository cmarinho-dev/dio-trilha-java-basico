package Ex02ProductsTaxes;

import java.util.Scanner;

public class Main {
//  TODO:
//  2 - Escreva um código que calcule o valor de tributos de produtos, os produtos disponíveis devem ser dos seguintes tipos: Alimentação,
//      Saúde e bem estar, Vestuário e Cultura. todos os produtos devem ter um método para retornar o seu valor de imposto, de acordo com seu
//      tipo:
//         • Alimentação 1%;
//         • Saúde e bem estar 1.5%;
//         • Vestuário 2.5%;
//         • Cultura 4%.

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        while (true) {
            System.out.println("Escolha o tipo de produto para calcular seu preço final: ");
            System.out.print("""
                            1 - Alimentação
                            2 - Saúde e bem estar
                            3 - Vestuário
                            4 - Cultura
                            0 - Encerrar programa
                            :\s"""
            );
            choice = scanner.nextInt();
            double productFinalPrice;


            if (choice == 1) {
                System.out.print("Insira o valor base do produto: ");
                productFinalPrice = getFinalPrice(new FoodProduct(scanner.nextDouble()));
            }
            else if (choice == 2)  {
                System.out.print("Insira o valor base do produto: ");
                productFinalPrice = getFinalPrice(new HealthProduct(scanner.nextDouble()));
            }
            else if (choice == 3) {
                System.out.print("Insira o valor base do produto: ");
                productFinalPrice = getFinalPrice(new ClothingProduct(scanner.nextDouble()));
            }
            else if (choice == 4) {
                System.out.print("Insira o valor base do produto: ");
                productFinalPrice = getFinalPrice(new CultureProduct(scanner.nextDouble()));
            }
            else if (choice == 0) {
                System.out.println("Encerrando programa...");
                break;
            }
            else {
                System.out.println("Insira uma opção válida! \n");
                continue;
            }
            System.out.printf("Valor Final do Produto: %.2f%n%n", productFinalPrice);
        }
    }

    private static double getFinalPrice(Product product) {
        return product.getFinalPrice();
    }
}
