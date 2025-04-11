import java.util.ArrayList;

public class Exercicio13 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(0);
        numeros.add(200);
        numeros.add(1);
        numeros.add(45);
        int numeroMaior = numeros.get(0);
        int numeroMenor = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeroMaior < numeros.get(i)) {
                numeroMaior = numeros.get(i);
            }
            if (numeroMenor > numeros.get(i)) {
                numeroMenor = numeros.get(i);
            }
        }

        System.out.println("O maior número é: " + numeroMaior);
        System.out.println("O menor número é: " + numeroMenor);

    }
}
