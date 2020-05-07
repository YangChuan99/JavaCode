interface A {
    void func1();
}
interface B {
    void func2();
}
//extends扩展
interface C extends A,B {
    void func3();
}
class TestB implements C{
    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }
    public void func3(){

    }
}

class Test implements A,B {

    @Override
    public void func1() {

    }

    @Override
    public void func2() {

    }
}
public class Test0507 {
    public static void main(String[] args) {

    }
}