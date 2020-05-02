class Base{

    public Base(String s){

        System.out.print("B");

    }

    public Base() {

    }
}

public class Test0502 extends Base{

    public Test0502 (String s) {
        super();

        System.out.print("D");

    }

    public static void main(String[] args){

        new Test0502("C");

    }

}