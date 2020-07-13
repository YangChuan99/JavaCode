import java.util.Scanner;

public class Main {

    public static String replaceSpace(String iniString, int length) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < length; i++) {
            if(iniString.charAt(i) == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(iniString.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str = sn.nextLine();
        System.out.println(replaceSpace(str,str.length()));
    }
}
