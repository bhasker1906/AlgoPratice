package pratice01;

public class beautifulArray {
    public static void main(String[] args){
        int n=3;
        beautifulArray obj= new beautifulArray();
        obj.arrange(n);
        System.out.println(obj.count);
    }
    int count=0;
    private int arrange(int n){

        int[] num=new int[n+1];
        for(int i=0;i<=n;i++) num[i]=i;
        //checkarray(num,1,n);
        checkarrayswap(num,n);
        return count;
    }
    private void checkarray(int[] num,int pos,int n){
            if(pos>n){
                count++;
                return;
            }
        for(int i=1;i<=n;i++){
            if(num[i]==0 &&(pos%i==0 || i%pos==0)){
                num[i]=pos;
                checkarray(num,pos+1,n);
                num[i]=0;
            }

        }

    }

    private void checkarrayswap(int[] num,int n){
        if(n==0){
            count++;
            return;
        }
        for (int i=n;i>0;i--) {
            swaparray(num, i, n);
            if ((num[n] % n == 0 || n % num[n] == 0))
            {
                checkarrayswap(num,n-1);
            }
            swaparray(num, i, n);


        }


    }

    private void swaparray(int[] num,int i, int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
}
