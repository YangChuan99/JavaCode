class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode result;
        ListNode temp = pHead;
        ListNode index = new ListNode(1);
        index.next=pHead;
        result = index;
        while(temp != null){
            if(temp.next != null && temp.next.val == temp.val){
                while(temp.next != null && temp.next.val == temp.val){
                    temp = temp.next;
                }
                temp = temp.next;
                index.next = temp;
            }
            else{
                index = index.next;
                temp = temp.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {

    }
}
