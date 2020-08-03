import java.util.Scanner;

public class Main {
    public static String func(String s) {
        String ret = "";
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                tmp += s.charAt(i);
            } else {
                if(tmp.length() > ret.length()) {
                    ret = tmp;
                }
                tmp = "";
            }
        }
        if(ret.length() > tmp.length()) {
            return ret;
        } else {
            return tmp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(func(str));
    }
}
