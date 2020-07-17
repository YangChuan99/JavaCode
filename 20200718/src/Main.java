import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int year,month,day;
            year = sc.nextInt();
            month = sc.nextInt();
            day = sc.nextInt();
            switch (month - 1) {
                case 11:
                    day += 30;
                case 10:
                    day += 31;
                case 9:
                    day += 30;
                case 8:
                    day += 31;
                case 7:
                    day += 31;
                case 6:
                    day += 30;
                case 5:
                    day += 31;
                case 4:
                    day += 30;
                case 3:
                    day += 31;
                case 2:
                    if(year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0)) {
                        day += 29;
                    } else {
                        day += 28;
                    }
                case 1:
                    day += 31;
            }
            System.out.println(day);
        }
    }
}
