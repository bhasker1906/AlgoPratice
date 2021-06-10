package pratice01;

public class Recurrsion {
    public static void main(String[] args){

        //System.out.println(recussion(4));
        //System.out.println(recussion1(4,1));
        System.out.println(fibo(0));
        System.out.println(fibo(1));
        System.out.println(fibo(2));
        System.out.println(fibo(3));
        System.out.println(fibo(4));
        System.out.println("New 4 :"+fibo1(4,1,1));
    }

    public static int recussion(int n){
        if(n==0) return 1;
        return recussion(n-1)*n;
    }

    public static int recussion1(int n,int res){
        if(n==0) return res;
        return recussion1(n-1,res*n);
    }

    public static int fibo(int n){
        if(n==0||n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }

    public static int fibo1(int n,int a,int b){
        if(n==0||n==1) return b;
        return fibo1(n-1,b,a+b);
    }
}
