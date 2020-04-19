
public class Test0419 {
    public static void main(String[] args) {
        MyArrayList myArrayList1 = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myArrayList1.add(i,i);
        }
        myArrayList1.display();
        myArrayList1.add(10,112);
        myArrayList1.display();
        System.out.println(myArrayList1.contains(3));
        System.out.println(myArrayList1.search(3));
        System.out.println(myArrayList1.getPos(4));
        System.out.println(myArrayList1.size());
        myArrayList1.remove(5);
        myArrayList1.display();
        myArrayList1.clear();
        myArrayList1.display();
    }
}
