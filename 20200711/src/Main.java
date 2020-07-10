import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str = sn.next().substring(2);
        System.out.println(Integer.parseInt(str,16));
    }
}
