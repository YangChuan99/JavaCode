public class Test0506 {

    public static boolean func(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > '9' || arr[i] < '0') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "1234a56";
        boolean flg = func(str);
        System.out.println(flg);
    }

    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);
        String str3 = "hello";
        String str4 = "hel"+"lo";
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        String str5 = new String("hel" + "lo");
        System.out.println(str1 == str5);
    }
}
