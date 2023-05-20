import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[18];
        int k = 3;
        for (int i = 0; i < a.length; i++) {
            a[i] = k;
            k = k + 1;
        }
        double[] x = new double[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = new Random().nextDouble(-10.0, 8.0);
        }
        double[][] ar = new double[18][20];
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 20; j++) {
                if (a[i] == 10) {
                    ar[i][j] = Math.pow(Math.atan(Math.sin(x[j])) * (Math.pow(Math.log10(Math.abs(x[j])), 2 * Math.cos(x[j])) - 2), 1 / (2 * Math.tan(x[j])));
                } else if (a[i] == 6 || a[i] == 7 || a[i] == 8 || a[i] == 11 || a[i] == 12 || a[i] == 17 || a[i] == 18 || a[i] == 19 || a[i] == 20) {
                    ar[i][j] = Math.pow(Math.E, (Math.sin(Math.pow(x[j], x[j] * (x[j] + 3)))));
                } else {
                    ar[i][j] = Math.pow(Math.asin((x[i] - 1) / 18), (1 / 9));
                }
            }
        }
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%15.5f", ar[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
