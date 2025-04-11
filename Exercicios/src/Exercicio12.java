import java.util.ArrayList;

public class Exercicio12 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(10);
        numeros.add(10);
        numeros.add(10);
        int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        System.out.println(soma);
    }
}
