import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número para validar se ele é primo: ");
        int numero = sc.nextInt();

        if ((numero > 1 && numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0) ||
                numero == 2 || numero == 3 || numero == 5 || numero == 7) {
            System.out.println("O número " + numero + " é primo");
        } else {
            System.out.println("O número não é primo!!");
        }
        sc.close();
    }
}
