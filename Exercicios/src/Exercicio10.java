import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para iniciar a contagem regressiva: ");
        int numero = sc.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
