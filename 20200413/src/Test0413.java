
public class Test0413 {
    public static String myToString(int[] array) {
        String ret = "[";
        for(int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.print(myToString(array));
    }

}