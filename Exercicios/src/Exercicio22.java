import java.util.ArrayList;

public class Exercicio22 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(20);
        numeros.add(20);
        numeros.add(20);
        numeros.add(5);
        numeros.add(1);
        numeros.add(1);
        numeros.add(15);
        numeros.add(30);
        
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = 0; j < numeros.size(); j++) {
                if (numeros.get(i) == numeros.get(j) && i != j) {
                    numeros.remove(numeros.get(i));
                }
            }
        }
        System.out.println(numeros);
    }
}
