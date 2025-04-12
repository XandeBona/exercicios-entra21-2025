import java.util.ArrayList;

public class Exercicio17 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(1);
        numeros.add(200);
        numeros.add(35);
        numeros.add(50);
        numeros.add(61);

        for(int i = numeros.size() - 1; i >= 0; i--) {
            System.out.println(numeros.get(i));
        }
    }
}
