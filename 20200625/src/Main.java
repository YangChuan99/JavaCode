
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Main {

    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a == null) {
            return b;
        }
        if(b == null) {
            return a;
        }
        int flag = 0;
        int temp = 0;
        ListNode node = null;
        ListNode pnode = null;
        while(a != null && b != null) {
            temp = a.val + b.val + flag;
            flag = 0;
            if(temp >= 10) {
                temp %= 10;
                flag = 1;
            }
            ListNode root = new ListNode(temp);
            if(node == null) {
                node = root;
                pnode = root;
            }else {
                node.next = root;
                node = root;
            }
            a = a.next;
            b = b.next;
        }
        while(a != null) {
            temp = a.val + flag;
            flag = 0;
            if(temp >= 10) {
                temp %= 10;
                flag = 1;
            }
            ListNode root = new ListNode(temp);
            node.next = root;
            node = root;
            a = a.next;
        }
        while(b != null) {
            temp = b.val + flag;
            flag = 0;
            if(temp >= 10) {
                temp %= 10;
                flag = 1;
            }
            ListNode root = new ListNode(temp);
            node.next = root;
            node = root;
            b = b.next;
        }
        if(flag == 1) {
            ListNode root = new ListNode(1);
            node.next = root;
            node = root;
        }
        return pnode;
    }

    public static void main(String[] args) {

    }
}
