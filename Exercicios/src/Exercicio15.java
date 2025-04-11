import java.util.ArrayList;

public class Exercicio15 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.0);
        numeros.add(15.0);
        numeros.add(5.0);
        double resultado = 0;
        double media = 0;

        for (int i = 0; i < numeros.size(); i++) {
            resultado += numeros.get(i);
        }

        media = resultado / numeros.size();

        System.out.println("A media dos números existentes no Array é: " + media);

    }
}
