package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InterfaceConsumer {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3 , 4, 5);

        //utilizando a interface Consumer para manipular dados da lista
        //impressao de numeros impares
        Consumer<Integer> imprimirNumerosImpares = new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            }
        };

        //outra opção mas utilizando expressoes lambda
        //forma simplificada para numeros pares
        Consumer<Integer> imprimirNumerosPares = num -> {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        };

        // Impressao de Numeros PARES
        numeros.stream().forEach(imprimirNumerosImpares);
    }
}