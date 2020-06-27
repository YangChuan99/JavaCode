import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int[] data=new int[2];
        do {
            data[0]=sn.nextInt();
            data[1]=sn.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<data[0];i++) {
                list.add(sn.nextInt());
            }
            int num=0;
            char c;
            int a,b;
            while(num < data[1]) {
                c = sn.next().charAt(0);
                a = sn.nextInt();
                b = sn.nextInt();
                if(c == 'Q') {
                    int start,end;
                    if(a < b)	{
                        start = a - 1;
                        end = b - 1;
                    } else {
                        start = b - 1;
                        end = a - 1;
                    }
                    int max = list.get(start);
                    for(int i = start;i <= end;i++)	{
                        if(list.get(i) >= max)
                            max = list.get(i);
                    }
                    System.out.println(max);
                }
                if(c == 'U') {
                    int index = a - 1;
                    int newScore = b;
                    list.set(index, newScore);
                }
                sn.nextLine();
                num++;
            }
        } while(sn.hasNext());
        sn.close();
    }
}
