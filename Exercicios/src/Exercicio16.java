import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(50);
        numeros.add(10);
        numeros.add(30);
        numeros.add(4);
        numeros.add(12);
        numeros.add(18);

        System.out.print("Número para validar: ");
        int numeroValidar = sc.nextInt();

        boolean numeroValidador = false;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeroValidar == numeros.get(i)) {
                numeroValidador = true;
            }
        }
        if (numeroValidador == true) {
            System.out.println("O número " + numeroValidar + " está na lista");
        } else {
            System.out.println("O número " + numeroValidar + " não está na lista");
        }
    }
}
