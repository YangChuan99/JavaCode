import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] a  = s.split(";");
            int x=0;
            int y=0;
            for(int i = 0;i<a.length;i++){
                if(a[i].charAt(0)=='A'&&a[i].substring(1).matches("[0-9]{1,2}")){
                    x-= Integer.parseInt(a[i].substring(1));
                }
                if(a[i].charAt(0)=='S'&&a[i].substring(1).matches("[0-9]{1,2}")){
                    y-=Integer.parseInt(a[i].substring(1));
                }
                if(a[i].charAt(0)=='W'&&a[i].substring(1).matches("[0-9]{1,2}")){
                    y+=Integer.parseInt(a[i].substring(1));
                }
                if(a[i].charAt(0)=='D'&&a[i].substring(1).matches("[0-9]{1,2}")){
                    x+=Integer.parseInt(a[i].substring(1));
                }
            }
            System.out.println(x+","+y);
        }
    }
}