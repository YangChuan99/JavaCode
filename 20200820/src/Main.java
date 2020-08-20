public class Main {
    //有一个NxN整数矩阵，请编写一个算法，将矩阵顺时针旋转90度。
    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        int[][] temp=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp[j][n-1-i]=mat[i][j];
            }
        }
        return temp;
    }

}
