import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int rich = 10 * 30;
        int people = 0;
        for (int i = 0; i < 30; i++) {
            people += Math.pow(2,i);
        }
        System.out.print(rich + " " + people);
    }
}
