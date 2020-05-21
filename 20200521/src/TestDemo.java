import java.util.Arrays;
import java.util.PriorityQueue;
public class TestDemo {
    public static void main(String[] args) {

        TestHeap testHeap = new TestHeap();
        int[] array = {27,15,19,18,28,34,65,49,25,37};
        testHeap.createHeap(array);
        testHeap.show();
        testHeap.push(80);
        testHeap.show();
        testHeap.pop();
        testHeap.show();
        System.out.println("排序：");
        testHeap.heapSort();
        testHeap.show();
    }
}
