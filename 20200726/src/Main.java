public class Main {

    public static String change (String s) {
        // write code here
        StringBuffer str = new StringBuffer("");
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a') {
                count++;
            } else {
                str.append(s.charAt(i));
            }
        }
        for (int i = 0; i < count; i++) {
            str.append('a');
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "abcavv";
        System.out.println(change(s));
    }
}
