import java.util.Scanner;

public class Main {

    public static double func(int x) {
        double ret = 0;
        if(x >= 90) {
            ret = 4.0;
        } else if(x >= 85) {
            ret = 3.7;
        } else if(x >= 82) {
            ret = 3.3;
        } else if(x >= 78) {
            ret = 3.0;
        } else if(x >= 75) {
            ret = 2.7;
        } else if(x >= 72) {
            ret = 2.3;
        } else if(x >= 68) {
            ret = 2.0;
        } else if(x >= 64) {
            ret = 1.5;
        } else if(x >= 60) {
            ret = 1.0;
        } else {
            ret = 0.0;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sn.nextInt();
        }
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array2[i] = sn.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array1[i] * func(array2[i]);
        }
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += array1[i];
        }
        System.out.println(String.format("%.2f", sum / sum2));
    }
}
