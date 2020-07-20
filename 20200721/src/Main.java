
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] s = str.split(" ");
            StringBuffer sb = new StringBuffer("");
            for(int i = s.length - 1; i >= 0; i--) {
                if(i == 0) {
                    sb.append(s[i]);
                } else {
                    sb.append(s[i] + " ");
                }
            }
            System.out.println(sb.toString());
        }
    }
}