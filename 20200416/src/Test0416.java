import java.util.Arrays;
public class Test0416 {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag == true) {
                break;
            }

        }
    }

    public static boolean isUp(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int find(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right) >>> 1;
            if(arr[mid] < key) {
                left = mid + 1;
            } else if(arr[mid] > key) {
                right = mid - 1;
            } else if(arr[mid] == key) {
                return mid;
            }
        }
        return -1;
    }

    public static int[] copyOf(int[] arr) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }

    public static void toString(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        toString(array);
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] arr = new int[array.length];
        arr = copyOf(array);
        System.out.println(Arrays.toString(arr));
    }

    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println("要寻找的数字的下表是：" + find(array,6));
    }

    public static void main2(String[] args) {
        int[] array = {2,5,34,7,6,89};
        System.out.println(isUp(array));
    }

    public static void main1(String[] args) {
        int[] array = {2,5,34,7,6,89};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}