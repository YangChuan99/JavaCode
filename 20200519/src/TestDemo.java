import java.util.PriorityQueue;

public class TestDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.offer(2);
        priorityQueue.offer(30);
        priorityQueue.offer(4);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}
