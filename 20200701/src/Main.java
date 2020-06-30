import java.util.Scanner;

public class Main {

    public static int func(int[] array,int x) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            int n = sn.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sn.nextInt();
            }
            int x = sn.nextInt();
            System.out.println(func(array,x));
        }
    }
}
