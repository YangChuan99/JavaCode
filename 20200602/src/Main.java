import java.util.Scanner;

public class Main {

    public static int num(int num) {
        int ret = 0;
        while (num > 2) {
            ret += num / 3;
            num = num % 3 + num / 3;
        }
        if(num == 2) {
            ret++;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (scan.hasNextInt()) {
            n = scan.nextInt();
            if(n == 0) {
                System.exit(0);
            }
            System.out.println(num(n));
        }
    }
}