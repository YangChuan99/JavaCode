import java.util.Scanner;

public class Main {

    public static int func(int n,int[] arr) {
        int i = 0;
        int count = 0;
        int countDel = 0;
        while (true) {
            if (countDel == n) {
                return i - 1;
            }
            if (i == n) {
                i = i % n;
            }
            if (arr[i] != -1) {
                count++;
            }
            if (count == 3) {
                count = 0;
                countDel++;
                arr[i % n] = -1;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        while (scanner.hasNextInt()) {
            length = scanner.nextInt();
            int[] index = new int[length];
            System.out.println(func(length, index));
        }
    }
}
