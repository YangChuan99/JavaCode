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

    public Node searchPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            } else {
                prev = prev.next;
            }
        }
        return null;
    }

    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }

    public void clear() {
        this.head = null;
    }

    public Node reversalList() {
        Node newHead = null;
        Node prev = null;
        Node cur = this.head;
        while(cur != null) {
            Node curNext = cur.next;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }

    public void display2(Node newHead) {
        Node cur = newHead;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
