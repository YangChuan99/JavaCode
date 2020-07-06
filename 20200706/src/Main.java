import java.util.Scanner;

public class Main {

    public static int func(int n) {
        int div=1;
        int count=0;
        while(n/div != 0)
        {
            //div=1代表最低位，div=10代表次低位...
            int num=n/div;
            int cur=num%10;
            int high=num/10;
            int low=n%div;
            if(cur<2)
            {
                count+=high*div;
            }
            else if(cur==2)
            {
                count+=high*div+(low+1);
            }
            else
            {
                count+=(high+1)*div;
            }
            if(n/div<20)
                break;
            div=10*div;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.println(func(n));
    }
}
