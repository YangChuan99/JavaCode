import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        String ret = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            ret += ch[i];
        }
        System.out.println(ret);
    }
}
