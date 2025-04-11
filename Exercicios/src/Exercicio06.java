import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para validar o fatorial: ");
        int numero = sc.nextInt();
        int resultado = 1;

        for (int i = numero; i >= 1; i--) {
            resultado *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + resultado);

        sc.close();
    }
}
