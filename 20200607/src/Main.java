import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

public class Main {

    public static String func(String[] array) {
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]) {
                    flag++;
                }
            }
            if(flag >= array.length) {
                return array[i];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String str = "";
        str = sn.nextLine();
        String[] strings = str.split(" ");
        System.out.println(func(strings));
    }
}