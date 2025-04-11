import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = sc.nextInt();
        int soma = 0;

        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;

        }

        System.out.println("A soma dos números é: " + soma);
    }
}
