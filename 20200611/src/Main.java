import java.util.Scanner;

public class Main {

    public static int func(int x,int y) {
        if(x <= 0 || y <= 0) return 0;
        if(x == 1 || y == 1) return 1;
        return func(x - 1,y) + func(x,y - 1);
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int x = sn.nextInt();
        int y = sn.nextInt();
        System.out.println(func(x,y));
    }
}
