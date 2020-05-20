import java.util.PriorityQueue;

class Student {
    public String name;
}
//优先级序列添加的元素需要可以比较大小
public class TestDemo {
    public static void main(String[] args) {
        PriorityQueue<Student> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.offer(new Student());
        priorityQueue1.offer(new Student());
        // System.out.println(priorityQueue1);
        /*PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>();
        priorityQueue2.offer(10);*/

    }
}