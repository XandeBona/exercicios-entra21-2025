import java.util.ArrayList;

public class Exercicio18 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(-10);
        numeros.add(-1);
        numeros.add(200);
        numeros.add(-300);
        numeros.add(55);
        numeros.add(-55);

        ArrayList<Integer> numerosPositivos = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) >= 0) {
                numerosPositivos.add(numeros.get(i));
            }
        }

        System.out.println(numerosPositivos);

    }
}
