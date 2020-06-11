import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String n = sn.nextLine();
        char[] ch = n.toCharArray();
        int[][] array = {{0,0,0,0,0,0,0,0,0,0}};
        for (char c:ch) {
            array[0][c - '0'] += 1;
        }
        for (int i = 0; i < array[0].length; i++) {
            if(array[0][i] != 0) {
                System.out.println(i + ":" + array[0][i]);
            }
        }
    }
}
