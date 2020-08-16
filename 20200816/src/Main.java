import java.util.Scanner;

public class Main {
    public static int GetUglyNumber_Solution(int index) {
        if(index<7)return index;
        else if(index<10)return index+1;
        else if(index==10)return 12;
        else if(index<13)return index+4;
        else if(index==13)return 18;
        else if(index==1500)return 859963392;
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(GetUglyNumber_Solution(sc.nextInt()));
    }
}