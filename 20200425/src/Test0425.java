public class Test0425 {

    public static void createCut(Node headA, Node headB) {
        headA.next = headB.next.next;
    }

    public static Node getIntersectionNode(Node headA, Node headB) {
        int lenA = 0;
        int lenB = 0;
        Node pl = headA;
        Node ps = headB;
        while (pl != null) {
            lenA++;
            pl = pl.next;
        }
        while (ps != null) {
            lenB++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        for (int i = 0; i < len; i++) {
            pl = pl.next;
        }
        while (ps != pl && pl != null && ps != null) {
            ps = ps.next;
            pl = pl.next;
        }
        if(pl == ps && pl != null) {
            return pl;
        }
        return null;
    }

    public static Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(0);
        Node tmp = newHead;
        while (headA != null && headB != null) {
            if(headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            } else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if(headA == null) {
            tmp.next = headB;
        }
        if(headB == null) {
            tmp.next = headA;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedListA = new MyLinkedList();
        myLinkedListA.addLast(10);
        myLinkedListA.addLast(11);
        myLinkedListA.addLast(12);
        myLinkedListA.addLast(14);
        myLinkedListA.addLast(15);
        myLinkedListA.addLast(16);
        MyLinkedList myLinkedListB = new MyLinkedList();
        myLinkedListB.addLast(13);
        myLinkedListB.addLast(24);
        myLinkedListB.addLast(25);
        myLinkedListB.addLast(26);
        myLinkedListB.addLast(29);
        myLinkedListB.addLast(30);
        Node ret = mergeTwoLists(myLinkedListA.head,myLinkedListB.head);
        myLinkedListA.display2(ret);
    }
}
