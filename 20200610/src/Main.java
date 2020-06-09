import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        String str = String.valueOf(n);
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
    }
}
