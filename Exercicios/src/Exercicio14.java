import java.util.ArrayList;

public class Exercicio14 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(13);
        numeros.add(15);
        numeros.add(12);
        numeros.add(2);
        numeros.add(222);

        ArrayList<Integer> numerosPares = new ArrayList<>();

        for(int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) % 2 == 0) {
                numerosPares.add(numeros.get(i));
            }
        }

        System.out.println("Os números pares presentes na lista são: " + numerosPares);

    }
}
