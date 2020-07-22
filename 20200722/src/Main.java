import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] array = new int[n];
            for(int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            Map<Integer,Integer> map =new HashMap();
            int a = 0;
            int b = 0;
            for(int i = 0; i < n; i++) {
                if(map.containsKey(array[i])) {
                    map.put(array[i],2);
                } else {
                    map.put(array[i],1);
                }
            }
            for (int i = 0; i < n; i++) {
                if(map.get(array[i]) == 1) {
                    if(a == 0) {
                        a = array[i];
                    } else {
                        b = array[i];
                    }
                }
            }
            if( a > b) {
                System.out.println(b + " " + a);
            } else {
                System.out.println(a + " " + b);
            }
        }
    }
}