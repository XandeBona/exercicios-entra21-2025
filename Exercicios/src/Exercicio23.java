import java.util.ArrayList;

public class Exercicio23 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.0);
        numeros.add(12.0);
        numeros.add(15.0);
        numeros.add(21.0);
        numeros.add(33.0);
        numeros.add(8.0);

        double resultado = 0;
        double media = 0;

        ArrayList<Double> numerosPares = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numerosPares.add(numeros.get(i));
            }
        }
        for (int i = 0; i < numerosPares.size(); i++) {
            resultado += numerosPares.get(i);
        }

        media = resultado / numerosPares.size();

        System.out.println("A media dos números pares armazenados no Array é: " + media);
    }
}
