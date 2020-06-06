import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int y1,y2,y3,y4;
        double A,B,C;
        while (sn.hasNextInt()) {
            y1 = sn.nextInt();
            y2 = sn.nextInt();
            y3 = sn.nextInt();
            y4 = sn.nextInt();
            A = (y1 + y3) / 2;
            B = (y2 + y4) / 2;
            C = (y4 - y2) / 2;
            if((A - ((y1 + y3) / 2) != 0)) {
                System.out.println("No");
                return;
            }
            if((B - (y2 + y4) / 2) != 0 || (B - (y3 - y1) / 2) != 0) {
                System.out.println("No");
                return;
            }
            if((C - (y4 -y2) / 2) != 0) {
                System.out.println("No");
                return;
            }
            System.out.println((int) A + " " + (int)B + " " + (int)C);
        }
    }
}
