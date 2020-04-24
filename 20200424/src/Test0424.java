public class Test0424 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(11);
        myLinkedList.addLast(12);
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        myLinkedList.addLast(14);
        myLinkedList.display();
        myLinkedList.partition(20);
        myLinkedList.display();
        myLinkedList.deleteDuplication();
        myLinkedList.display();
    }
}
