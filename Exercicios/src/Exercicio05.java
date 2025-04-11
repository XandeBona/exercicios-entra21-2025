import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número para validar os números ímpares: ");
        int numero = sc.nextInt();
        int validador = 1;

        while (validador <= numero) {
            if (validador % 2 != 0) {
                System.out.println(validador);
            }
            validador++;
        }
        sc.close();
    }
}
