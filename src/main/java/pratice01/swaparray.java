package pratice01;

import java.util.Scanner;

public class swaparray {

    public static void main(String[] args)
    {
   // System.out.println(swapArray(12345,0,2));

        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num=new int[n];
        for(int i=0;i<num.length;i++){
           num[i]=scanner.nextInt();
        }
        for(int i=num.length-1;i>=0;i--){
          System.out.println(num[i]);
        }
      //  scanner.close();
    }
    static int swapArray(int a,int b, int c){

       String s=Integer.toString(a);
       StringBuilder sb= new StringBuilder();
       char st=s.charAt(b);
       char ed=s.charAt(c);
       // System.out.println(st);

       for(int i=0;i<s.length();i++){
           if(i==b){
               sb.append(ed);
           }else if (i==c){
               sb.append(st);
           }else{
               sb.append(s.charAt(i));
           }


       }

    return Integer.parseInt(sb.toString());
    }

}

