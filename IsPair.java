
public class IsPair {

    public IsPair() {
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int testNumber = 5;
        if (isEven(testNumber)) {
            System.err.println("Numero pari");
        } else {
            System.err.println("Numero dispari");
        }

    }

}
