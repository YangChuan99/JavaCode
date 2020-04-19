import java.util.Arrays;

public class MyArrayList {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量
    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    private void checkPos(int pos) {
        if(pos < 0 || pos > usedSize) {
            throw new RuntimeException("顺序表为空！");
        }
    }

    public void add(int pos, int data) {
        if(isFull()) {
            this.elem =
                    Arrays.copyOf(this.elem,2 * this.elem.length);
        }

        if(pos < 0 || pos > usedSize) {
            return;
        }

        for (int i = usedSize - 1; i >= pos ; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            if(i == this.usedSize - 1) {
                System.out.println(this.elem[i]);
                return;
            }
            System.out.print(this.elem[i] + ",");
        }
        System.out.println();
    }

    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean isEmpty() {
        return this.elem == null;
    }

    public int getPos(int pos) {
        if(isEmpty()) {
            return -1;
        }
        if(pos >= 0 && pos < usedSize) {
            return this.elem[pos];
        }
        return -1;
    }

    public int size() {
        return usedSize;
    }

    public void remove(int toRemove) {
        int pos = this.search(toRemove);
        if(pos == -1) {
            System.out.println("没有需要删除的数字!");
            return;
        }
        for (int i = pos; i < usedSize - 1 ; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    public void clear() {
        this.usedSize = 0;
    }
}