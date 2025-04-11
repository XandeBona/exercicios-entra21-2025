import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        int soma = 0;

        for(int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.printf("A soma é " + soma);
    }
}
