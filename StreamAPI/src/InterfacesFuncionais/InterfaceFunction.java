package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class InterfaceFunction {

    public static void main(String[] args) {

        // Criacao de um lista de numeros
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> dobrarNumeros = (num) -> num * 2;

        var listaNumerosDobro = listaNumeros.stream()
                .map(dobrarNumeros)
                .toList();

        listaNumerosDobro.forEach(System.out::println);

        // Forma simplificada (com expressao lambda) utilizando FUNCTION para reaproveitar INTEGERS em STRINGS

        var listaMensagensRecepcao = listaNumeros.stream()
                .map(cod -> String.format("User%d, seja bem vindo", cod))
                .toList();

        listaMensagensRecepcao.forEach(System.out::println);

    }
}
