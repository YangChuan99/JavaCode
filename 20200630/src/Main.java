import java.util.Scanner;

public class Main {
    public static int func(int n) {
        int ret = 0;
        while (n > 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            int n = sn.nextInt();
            System.out.print(func(n) + " ");
            System.out.println(func(n * n));
        }
    }
}
