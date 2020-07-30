import java.util.Scanner;

public class Main {
    //将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0

    public static int StrToInt(String str) {
        if(str.equals("") || str.length() == 0) {
            return 0;
        }
        char[] ch = str.toCharArray();
        int flag = 0;
        if(ch[0] == '-') {
            flag = 1;
        }
        int sum = 0;
        for (int i = flag; i < ch.length; i++) {
            if(ch[i] == '+') {
                continue;
            }
            if(ch[i] > '9' || ch[i] < '0') {
                return 0;
            }
            sum = sum * 10 + ch[i] - '0';
        }
        return flag == 0 ? sum : sum * -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int ret = StrToInt(sc.nextLine());
            System.out.println(ret);
        }
    }
}
