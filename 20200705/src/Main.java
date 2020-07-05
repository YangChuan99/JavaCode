import java.util.Scanner;

public class Main {

    public static void func(String[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            String temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();
        String[] s = str.split(" ");
        func(s);
    }
}
