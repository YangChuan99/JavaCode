import java.util.Scanner;

public class Test0412 {
    public static int func(int n) {
        if(n < 10) {
            return n;
        }
        return n % 10 + func(n / 10);
    }
//    public static int sum(int n1, int n2) {
//        return n1 + n2;
//    }
//    public static int sum(int n1, int n2, int n3) {
//        return n1 + n2 + n3;
//    }
//    public static int sum(int n1, int n2,int n3, int n4) {
//        return n1 + n2 + n3 + n4;
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
        System.out.println(func(a));
    }
}
