public class Main {

    public static String LeftRotateString(String str,int n) {
        StringBuffer sb = new StringBuffer();
        if(str.length() == 0) {
            return str;
        }
        for (int i = n; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        System.out.println(LeftRotateString(str,3));
    }
}
