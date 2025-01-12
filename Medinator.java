
public class Medinator {

    public static void main(String[] args) {

// Variabili di calcolo
        int w = 7;
        int x = 10;
        int y = 5;
        int z = 4;

// ! variabili di appoggio
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int pair = 0;
        int unpair= 0;

        int sum = w + x + y + z;
        float mediasum = sum / 4;

        if (w % 2 == 0) {
            a = w;
            pair ++;
        } else {
            f = w;
            unpair++;
        }

        if (x % 2 == 0) {
            b = x;
            pair ++;
        } else {
            g = x;
            unpair++;
        }

        if (y % 2 == 0) {
            c = y;
            pair ++;
        } else {
            h = y;
            unpair++;
        }

        if (z % 2 == 0) {
            d = z;
            pair ++;
        } else {
            i = z;
            unpair++;
        }

        int sumpair = a + b + c + d;

        float mediapair = sumpair / pair;

        int sumunpair = f + g + h + i;
        float mediaunpair = sumunpair / unpair;

        System.out.println(mediasum);
        System.out.println(mediapair);
        System.out.println(mediaunpair);

    }

}
