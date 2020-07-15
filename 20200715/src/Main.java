import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }
        for (int i = 0; i < s1.length(); i++) {
            if(!set.contains(s1.charAt(i))) {
                str.append(s1.charAt(i));
            }
        }
        System.out.println(str.toString());
    }
}
