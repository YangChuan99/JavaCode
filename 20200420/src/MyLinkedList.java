
class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    public Node head;
    public void addFirst(int data) {
        Node node = new Node(data);
        if(head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null) {
            this.head = node;
            return;
        }
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    private Node searchIndex(int index) {
        if(index < 0 || index > this.size()) {
            throw new RuntimeException("index位置不合理！ ");
        }
        Node cur = this.head;
        while(index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    public void addIndex(int index, int data) {
        if(index == 0) {
            this.addFirst(data);
        }
        if(index == this.size()) {
            this.addLast(data);
        }
        Node node = new Node(data);
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;
    }
}
