package pratice02;

public class MinimumAraayTreversal {
    public static void main(String[] args) {
        int M[][] = new int[][] {
                { 1, 2, 1 },
                { 3, 4, 2 },
                { 2, 1, 3 }};
        //int sum=0;
        int rows=M.length;
        int cols=M[0].length;
        int dp[][]=new int[rows][cols];
        dp[0][0]=M[0][0];
        for(int i=1;i<cols;i++){
            dp[0][i]=dp[0][i-1]+M[0][i];
        }
        for(int i=1;i<rows;i++){
            dp[i][0]=dp[i-1][0]+M[i][0];
        }


        for(int i=1;i<rows;i++){
            for(int j=1;j<cols;j++){
             dp[i][j]=M[i][j]+ Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }

        System.out.println(dp[rows-1][cols-1]);
    }

   /* public static int MinimumLength(int M[][],int i,int j){
        if(i<0||j<0|| i>=M.length ||j>=M[0].length) return 0;

        return M[i][j]+Math.min(M[i+1][j],M[i][j+1]);
    }*/
}
