import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.nextLine();
            char[] b = a.toCharArray();
            for(int i = 0;i< b.length;i++){
                char c = b[i];
                if(c-'A'>=0){
                    c =(char)( c >'E'? (c-5 ): (c+21));
                    b[i] = c;
                }
            }
            System.out.println(new String(b));
        }
    }
}
