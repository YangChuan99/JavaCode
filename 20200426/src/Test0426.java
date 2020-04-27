public class Test0426 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.addLast(14);
        myLinkedList.addLast(15);
        myLinkedList.display();
        myLinkedList.addIndex(4,55);
        myLinkedList.display();
        myLinkedList.addIndex(5,56);
        myLinkedList.display();
        myLinkedList.remove(14);
        myLinkedList.display();
        myLinkedList.clear();
    }
}
