import java.util.Scanner;

public class Main {
//青蛙跳台阶问题
    public static int JumpFloor(int target) {
        int a = 1;
        int b = 2;
        int c = 0;
        if(target == 1) {
            return a;
        } else if (target == 2) {
            return b;
        } else {
            for (int i = 3; i < target; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(JumpFloor(sc.nextInt()));
    }
}
