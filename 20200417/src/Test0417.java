import java.util.Scanner;
public class Test0417 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(numSum(n));
    }
    public static int numSum(int n){
        if(n / 10 == 0) {
            return n % 10;
        } else {
            return n % 10 + numSum(n / 10);
        }
    }
}