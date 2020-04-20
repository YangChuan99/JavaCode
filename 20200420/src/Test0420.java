
public class Test0420 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addLast(13);
        myLinkedList.addLast(14);
        myLinkedList.addLast(15);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(10));
        System.out.println(myLinkedList.size());
        myLinkedList.addIndex(3,6);
        myLinkedList.display();
    }
}
