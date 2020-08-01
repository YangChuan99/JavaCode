import java.util.Scanner;

public class Main {
    public static int Sum_Solution(int n) {
        int ret = (int)(Math.pow(n,2) + n);
        return ret >> 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum_Solution(n));
    }
}