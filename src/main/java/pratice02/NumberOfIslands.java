package pratice02;

public class NumberOfIslands {
    public static void main(String[] args) {

        int M[][] = new int[][] {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0 } };

        int rows=M.length;
        int cols=M[0].length;

        System.out.println(rows +" " +cols);
        int icount=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                if(M[i][j]==1){

                    DFSCheck(M,i,j,rows,cols);
                    icount++;

                }

            }

            }
        System.out.println(icount);
        }

        public static void DFSCheck(int sol[][],int curr_i,int curr_j,int rows,int cols){

        if(curr_i<0 || curr_j<0 || curr_i>=rows || curr_j >=cols|| sol[curr_i][curr_j]==0 ||sol[curr_i][curr_j]==2) return;

           // if(sol[curr_i][curr_i]==1){
                sol[curr_i][curr_j]=2;
            //}
            DFSCheck(sol,curr_i+1,curr_j,rows,cols);
            DFSCheck(sol,curr_i-1,curr_j,rows,cols);
            DFSCheck(sol,curr_i,curr_j+1,rows,cols);
            DFSCheck(sol,curr_i,curr_j-1,rows,cols);
        }




    }

