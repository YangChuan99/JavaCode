import java.util.Scanner;

public class Main {

    public static int addAB(int a, int b) {
        if(b==0)

            return a;

        int sum=a^b;

        int carry=(a&b)<<1;

        return addAB(sum,carry);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(addAB(a,b));
    }
}
