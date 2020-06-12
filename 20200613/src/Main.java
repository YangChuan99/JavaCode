import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static  String[] getGray(int n) {
        if(n == 1) {
            String[] str = {"0","1"};
            return str;
        }
        String[] str1 = getGray(n - 1);
        String[] str2 = new String[2 * str1.length];
        for (int i = 0; i < str1.length; i++) {
            str2[i] = "0" + str1[i];
            str2[i + str1.length] = "1" + str1[str1.length - 1 - i];
        }
        return str2;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGray(1)));
    }
}
