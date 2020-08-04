import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add((Integer)input[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(a,4));
    }
}