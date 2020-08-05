public class Main {
    public static int func(int n) {
        int ret = 0;
        while (n > 0) {
            String str = String.valueOf(n);
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if(ch[i] == '1') {
                    ret++;
                }
            }
            n--;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(func(13));
    }
}
