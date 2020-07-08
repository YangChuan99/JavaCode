import java.util.Scanner;
public class Main {

    public static int countWays(int n) {
        int n1=1;
        int n2=2;
        int n3=4;
        int sum=0;
        if(n<3){
            return n;
        }
        if(n==3){
            return n3;
        }
        for(int i=4;i<=n;i++){
            sum=((n1+n2)%1000000007+n3)%1000000007;
            n1=n2;
            n2=n3;
            n3=sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        System.out.println(countWays(n));
    }
}
