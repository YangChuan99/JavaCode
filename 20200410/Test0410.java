import java.util.Scanner;

public class Test0410 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(a <= 18) {
			System.out.println("少年");
		} else if(a <= 28) {
		    System.out.println("青年");              
		} else if(a <= 55) {
            System.out.println("中年");     
		} else if(a > 55) {
			System.out.println("老年");
		}
	}
}