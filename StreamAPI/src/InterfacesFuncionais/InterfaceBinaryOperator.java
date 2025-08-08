package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class InterfaceBinaryOperator {

    public static void main(String[] args) {

        // Lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Uso do BinaryOperator para somar todos os elementos da lista
        BinaryOperator<Integer> somar = Integer::sum;

        int resultadoMultiplicacao = numeros.stream()
                .reduce(0,somar);

        System.out.println(resultadoMultiplicacao);



        int resultadSoma = numeros.stream()
                .reduce(1, (n1, n2) -> n1*n2);

        System.out.println(resultadoMultiplicacao);
    }

}
