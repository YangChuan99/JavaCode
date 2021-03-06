import java.util.Scanner;

public class Test0508 {
    public static String reverse(String str,int begin,int end) {
        char[] value = str.toCharArray();
        while (begin < end) {
            char tmp = value[begin];
            value[begin] = value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
        //return new String(value);
        return String.copyValueOf(value);
    }

    public static String func(String str, int n) {
        if(str == null || n <= 0 || n > str.length() - 1) {
            return null;
        }
        str = reverse(str,0,n-1);
        str = reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(func(str,3));
    }
}