import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList list = new ArrayList<>();
        if(input == null || input.length == 0 || input.length < k) return list;
        Arrays.sort(input);
        for(int i = 0; i < k; i++){
            list.add(input[i]);
        }
        return list;
    }
}
