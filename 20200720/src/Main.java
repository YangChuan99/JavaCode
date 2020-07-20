import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] ss = str.split("_");
            String s = ss[0];
            for (int i = 1; i < ss.length; i++) {
                s += ss[i].toUpperCase().substring(0,1) + ss[i].substring(1);
            }
            System.out.println(s);
        }

    }
}
