package Ex01FormArea;

import java.util.Scanner;

//  TODO
//  1 - Escreva um código onde seja possível calcular a área de uma figura geométrica, todas devem ter um método que retorne esse valor, as
//      formas geométricas disponiveis devem ser as seguintes:
//         • Quadrado: possui o valor dos seus lados;
//         • Retângulo: possui os valores de base a altura;
//         • Circulor: possui o atributo raio.
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            int choice;
            System.out.println("Escolha a forma geométrica para calcular a área: ");
            System.out.print("""
                            1 - Quadrado
                            2 - Retângulo
                            3 - Círculo
                            0 - Sair do programa
                            :\s"""
            );
            choice = scanner.nextInt();
            GeometricForm geometricForm;
            if (choice == 1) geometricForm = createSquare();
            else if (choice == 2) geometricForm = createRectangle();
            else if (choice == 3) geometricForm = createCircle();
            else if (choice == 0) break;
            else {
                System.out.println("Insira uma opção válida! \n");
                continue;
            }

            System.out.printf("O resultado do cálculo da área foi de %.2f %n%n", geometricForm.getArea());
        }
    }

    private static GeometricForm createSquare(){
        System.out.print("Informe o tamanho dos lados: ");
        return new Square(scanner.nextDouble());
    }

    private static GeometricForm createCircle(){
        System.out.print("Informe o tamanho da raio: ");
        return  new Circle(scanner.nextDouble());
    }

    private static GeometricForm createRectangle(){
        System.out.print("Informe o tamanho da largura: ");
        var width = scanner.nextDouble();
        System.out.print("Informe o tamanho da altura: ");
        var height = scanner.nextDouble();
        return new Rectangle(width, height);
    }
}
