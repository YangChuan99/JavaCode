public class Main {
    public static void main(String[] args) {
        int million = 10 * 30;
        int stranger = 0;
        int[] array = new int[30];
        array[0] = 1;
        for (int i = 1; i < 30; i++) {
            array[i] = array[i -1] * 2;
        }
        for (int i = 0; i < 30; i++) {
            stranger += array[i];
        }
        System.out.print(million + " ");
        System.out.println(stranger);
    }
}
