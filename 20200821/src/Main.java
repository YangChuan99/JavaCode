public class Main {
    //变态跳台阶
    public int JumpFloorII(int target) {
        if(target == 1){
            return 1;
        }
        int[] a = new int[target + 1];
        int sum = 2;
        for(int i = 2; i <= target; i++){
            a[i] = sum;
            sum *= 2;
        }
        return a[target];
    }
}
