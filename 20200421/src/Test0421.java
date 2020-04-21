public class Test0421 {
    public static int findOne(int [] arr) {
        int ret= 0;
        for (int i = 0; i < arr.length; i++) {
            ret = ret ^ arr[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,5,5};
        System.out.println(findOne(array));
    }
}

