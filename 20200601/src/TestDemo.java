import java.util.*;

public class TestDemo {
    public static int findKth(int[] a, int n, int K) {
        // write code here
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        return a[n - K];
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        int k = findKth(a,5,3);
        System.out.println(Arrays.toString(a));
        System.out.println(k);
    }
}