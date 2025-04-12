import java.util.ArrayList;
import java.util.Collections;

public class Exercicio21 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(5);
        numeros.add(1);
        numeros.add(15);

        Collections.sort(numeros);

        ArrayList<Integer> listaInvertida = new ArrayList<>();

        for (int i = numeros.size() - 1; i >= 0; i--) {
            listaInvertida.add(numeros.get(i));
        }

        System.out.println(listaInvertida);
    }
}
