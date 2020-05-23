import java.util.Arrays;

public class TestDemo {

    public static void sort(int[] arr) {
        if(arr.length >= 2) {
            for (int i = 1; i < arr.length; i++) {
                int x = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > x) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = x;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {3,2,6,12,5};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
