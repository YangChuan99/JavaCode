class List {
    int var;
    List next;
    public List(int var) {
        this.var = var;
    }
}
public class Main {

    public static List reverseList(List list) {
        List cur = list;
        List result = null;
        while (cur != null) {
            List next = cur.next;
            cur.next = result;
            result = cur;
            cur = next;
        }
        return result;
    }

    public static void main(String[] args) {
        List list = new List(0);
        List list1 = new List(1);
        List list2 = new List(2);
        List list3 = new List(3);
        List list4 = new List(4);
        list.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = null;
        List tmp = list;
        while (tmp != null) {
            System.out.println(tmp.var);
            tmp = tmp.next;
        }
        List reverseList = reverseList(list);
        List tmp2 = reverseList;
        while (tmp2 != null) {
            System.out.println(tmp2.var);
            tmp2 = tmp2.next;
        }
    }
}
