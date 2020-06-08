import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int A = sn.nextInt();
        int B = sn.nextInt();
        if(A % 4 == 0 || B % 4 == 0){
            System.out.println(A * B / 2);
        }else {
            System.out.println(A * B / 2 + 1);
        }
    }
}
