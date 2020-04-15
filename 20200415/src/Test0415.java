import java.util.Scanner;
public class Test0415{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(jump(n));
    }
    public static int jump(int n) {
        if (n == 1)
        {
            return 1;
        } else if (n == 2)
        {
            return 2;
        } else
        {
            return jump(n - 1) + jump(n - 2);
        }
    }
}