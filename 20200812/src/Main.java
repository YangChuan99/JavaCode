import java.util.*;


public class Main {
    /**
     * 计算有多少个人最终不在自己原来的位置上
     * @param n int整型 队伍总长
     * @param cutIn int整型一维数组 依次会插队到最前方的人的编号
     * @return int整型
     */
    public int countDislocation (int n, int[] cutIn) {
        // write code here
        if(cutIn.length == 0){
            return 0;
        }

        // 使用 set 来委会曾经插队的人的最终位置
        // 越晚插队，位置越靠前

        Map<Integer, Integer> app = new HashMap<>();
        int index = 0;
        int count = 0; // 不变的人的数量
        int countnum = cutIn.length;
        int maxm = 0;

        for(int i = cutIn.length - 1; i >= 0; i--){
            int id = cutIn[i];
            if(!app.containsKey(id)){
                app.put(id, index++);
                if(countnum - i == cutIn[i]){
                    count++; // buban
                }
            }else{
                countnum --;
            }
            if(cutIn[i] > maxm){
                maxm = cutIn[i];
            }
        }
        return maxm - count;

    }
}