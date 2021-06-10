package pratice03;

public class Array01 {
    public static void main(String[] args) {

        int num[]={3, 5, 2, 4, 9, 3, 1, 7, 3,3};
        int k=3;
        int n=3;
       System.out.println("len :"+num.length+"  "+(num.length/n));
  //System.out.println(check_Array_Key(num,k,n));
        System.out.println(check_Array_Key_bool(num,k,n));

    }

    public static boolean check_Array_Key_bool(int num[],int n,int k){
        int N=num.length;
        int i;
        boolean isFind;
        for( i=0;i<N;i=i+n) {
            for (int j = 0; j < n; j++) {
                if (i + j < N && num[i + j] == k) break;
                if (j == n) return false;
                if (i + j >= N) return false;
            }
        }
            if(i>=N) return true;
            else return false;


        }






    public static String check_Array_Key(int num[],int n,int k){

        if(num.length<n) return "No";
        int cnt=0;
        int match=0;
        int[] temp=new int[n];
        for(int i=0;i<num.length;i++){
            temp[cnt]=num[i];
            cnt++;
            if(cnt==n){
                for(int j=0;j<temp.length;j++){
                    if(temp[j]==k) match+=1;
                }
                 cnt=0;
                temp=new int[n];
            } else if(cnt!=0 && i==num.length-1)
            {
                for(int j=0;j<temp.length;j++){
                    if(temp[j]==k) match+=1;
                }
            }

        }


        if(match!=(num.length%n+n)) { return "No"; }
        else { return "Yes";}
    }
}
