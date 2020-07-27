
public class Main {
    public static void main(String[] args) {
        System.out.println(cutRope(8));
    }
    public static int cutRope(int target){
        if(target < 2)
            return 0;
        if(target == 2)
            return 1;
        if(target == 3)
            return 2;
        int[] f = new int[target + 1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        f[3] = 3;
        int result = 0;
        for(int i = 4;i <= target; i++){
            int max = 0;
            for(int j = 1;j <= i / 2;j++){
                int num = f[j] * f[i - j];
                if(max < num)
                    max = num;
            }
            f[i] = max;
        }
        result = f[target];
        return result;
    }
}
