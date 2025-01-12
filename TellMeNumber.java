
import java.util.Arrays;
import java.util.Scanner;

public class TellMeNumber {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Quanto deve essere grande L'array?");
            int num = scan.nextInt();
            System.out.println("Hai inserito " + num);

            int[] arrays = new int[num];
            System.out.println(Arrays.toString(arrays));
            System.out.println("Inserisci i valori degli elementi dell'array");

            for (int i = 0; i < arrays.length; i++) {
                arrays[i] = scan.nextInt();
            }

            System.out.println(Arrays.toString(arrays));
            System.out.println("Adesso sommerò i valori che hai dato all'array...");
            System.out.println("Consulto le stelle...");

            System.out.println("I pianeti si stanno allineando...");
            int sum = 0;
            for (int i = 0; i < arrays.length; i++) {
                sum = arrays[i] + sum;

            }
            System.out.println("Il risultato è " + sum);
        }
    }
}
