
public class OptimusNumber {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 5, 10, 4, 3};
        int Maximum = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] > Maximum) {
                Maximum = a[i];
            }

        }
        System.out.println(Maximum);

    }
}
