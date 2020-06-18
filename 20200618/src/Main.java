import java.util.*;

public class Main {

    public static int func(int N,int[] array,int k) {
        int ret = 0;
        for (int i = 0; i < N; i++) {
            if(array[i] == k) {
                ret++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            if(N == 0) {
                System.exit(0);
            }
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            int k = scanner.nextInt();
            list.add(func(N,array,k));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
