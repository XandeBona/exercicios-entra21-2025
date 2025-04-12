import java.util.ArrayList;

public class Exercicio25 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int numeroMultiplicador = 10;

        ArrayList<Integer> numerosMultiplicados = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            numerosMultiplicados.add(numeros.get(i) * numeroMultiplicador);
        }

        System.out.println(numerosMultiplicados);
    }
}
