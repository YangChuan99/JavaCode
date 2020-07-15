import java.util.Scanner;

public class Main {

    public static String reverse(String str) {
        String[] strings = str.split(" ");
        int left = 0;
        int right = strings.length - 1;
        while (left < right) {
            String tmp = strings[left];
            strings[left] = strings[right];
            strings[right] = tmp;
            left++;
            right--;
        }
        StringBuffer s = new StringBuffer("");
        for (int i = 0; i < strings.length; i++) {
            if(i == strings.length - 1) {
                s.append(strings[i]);
            } else {
                s.append(strings[i] + " ");
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}
