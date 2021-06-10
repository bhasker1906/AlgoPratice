package pratice02;

import java.util.Stack;

public class FindKminimumElements {
    public static void main(String[] args) {
         String num = "1432219";
       // num = "10200", k = 1;
        //Input: num = "10", k = 2
       // System.out.println(minimumKDigit("1432219",3));
       // System.out.println(minimumKDigit("10200",1));
        System.out.println(minimumKDigit("10",2));
        /*if(i==len)
            return "0";*/
        //System.out.println(sb.toString().substring(i));
      //  return sb.toString().substring(i);

    }
    public static String minimumKDigit_Test(String num,int k){

        Stack<Integer> stack= new Stack<Integer>();
        int n=num.length();

        for (int i=0;i<n;i++) {
            int s = num.charAt(i)-'0';
            while (k > 0 && !stack.isEmpty() && stack.peek() > s) {
                stack.pop();
                k--;
            }
            stack.push(s);
        }

        while(!stack.isEmpty() && k>0) {
            stack.pop();
            k--;
        }


        return "1";
    }
    public static String minimumKDigit(String num,int k){
        int n=num.length();
        Stack<Integer> stack=new Stack<Integer>();
        for (int i=0;i<n;i++){
            int s=num.charAt(i)-'0';
            while(k>0 && !stack.isEmpty() && stack.peek()>s){
                stack.pop();
                k--;
            }
            stack.push(s);
        }
        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.insert(0,stack.pop());


        int i=0;
        int len=sb.length();
        while(i<len && sb.charAt(i)=='0')
            i++;
        if(i==len)
            return "0";
        return sb.toString().substring(i);
    }
}
