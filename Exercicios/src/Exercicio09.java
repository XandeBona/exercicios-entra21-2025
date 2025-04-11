import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número limite: ");
        int numeroLimite = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        while (num1 <= numeroLimite) {
            System.out.println(num1);
            int proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;
        }

        sc.close();
    }
}
