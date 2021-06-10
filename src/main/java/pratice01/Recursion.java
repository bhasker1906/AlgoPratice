package pratice01;

public class Recursion {

    public static void main(String[] args){
        System.out.println(fact(5));
        //System.out.println(fibo(5));
       // System.out.println(fibomemo(5));
       // printfibo(5);
        printReverse("Hello");
    }

    static void printReverse(String str){

        if(str==null || str.length()<=1){
            System.out.print(str);
        }
        else {
            System.out.print(str.charAt(str.length() - 1));
            printReverse(str.substring(0, str.length()- 1));
        }
        }
    static long fact(int n){
        if (n<=1){return n;}
        return n*fact(n-1);
    }

    static int fibo(int n){
        if(n<=1){return 1;}
        //System.out.println("number ::"+n);
        return fibo(n-1)+fibo(n-2);
    }
    static int n1=0,n2=1,n3=0;
    static void printfibo(int n){

        if(n>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println("number ::"+n3);
            printfibo(n-1);
        }


    }
    static int fibomemo(int n){
        int f[]=new int[n+2];
        f[0]=1;
        f[1]=1;
        for (int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
    return f[n];
    }
}
