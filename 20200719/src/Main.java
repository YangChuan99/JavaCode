import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            findSum(n, 1, m);
        }
    }

    public static void findSum(int sum, int start, int end) {
        if (sum < 0 || start > end + 1)
            return;
        else if (sum == 0){
            list.forEach(x ->System.out.print(x + " "));
            System.out.println();
            return;
        }
        if (sum >= start) {
            list.push(start);
            findSum(sum - start, start + 1, end);
            list.pop();
            findSum(sum, start+1, end);
        }
    }
}