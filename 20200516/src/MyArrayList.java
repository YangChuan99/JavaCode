public class MyArrayList<T> {
    public T[] elem;
    public int usedSize;

    public MyArrayList() {
        //this.elem =  new T[10];
        this.elem =  (T[])new Object[10];
        this.usedSize = 0;
    }
    //默认放到数组最后
    public void add(T val) {
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    public T getVal(int pos) {
        return this.elem[pos];
    }

}
