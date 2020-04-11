import java.util.Random;
import java.util.Scanner;
public class Test0411 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);	
        Random random = new Random();
        int randNum = random.nextInt(100);        
        while (true) {
        	System.out.println("请输入你要猜的数字：");
            int num = scan.nextInt();
        	if(num > randNum) {
    	         System.out.println("猜大了");
            } else if(num == randNum) {
    	         System.out.println("猜对了");
    	         break;
            } else {
    	         System.out.println("猜小了");
            }
        }
	}
}