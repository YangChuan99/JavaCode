import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()){
            int n = sn.nextInt();
            int ret = n * n;
            String str1 = String.valueOf(n);
            String str2 = String.valueOf(ret);
            String s = str2.substring(str2.length() - str1.length(),str2.length());
            if (s.equals(str1))
                System.out.println("Yes!");
            else
                System.out.println("No!");
        }

    }
}
