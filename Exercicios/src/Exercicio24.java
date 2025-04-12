import java.util.ArrayList;

public class Exercicio24 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.0);
        numeros.add(12.0);
        numeros.add(15.0);
        numeros.add(17.0);
        numeros.add(13.0);
        numeros.add(8.0);

        double resultado = 0;
        double media = 0;

        ArrayList<Double> numerosImpares = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 != 0) {
                numerosImpares.add(numeros.get(i));
            }
        }
        for (int i = 0; i < numerosImpares.size(); i++) {
            resultado += numerosImpares.get(i);
        }

        media = resultado / numerosImpares.size();

        System.out.println("A media dos números impares armazenados no Array é: " + media);
    }
}
