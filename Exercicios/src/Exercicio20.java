import java.util.ArrayList;
import java.util.Collections;

public class Exercicio20 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(5);
        numeros.add(1);
        numeros.add(15);

        Collections.sort(numeros);

        System.out.println(numeros);
    }
}
