package pratice01;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class ArrayGane {
    public static void main(String[] args){

       // String s="cdeo";
        //int[] a={3,2,0,1};
        String s="bytdag";
        int[] a={4,3,0,1,2,5};
        char temp=s.charAt(0);
        int idx=a[0];
        StringBuilder sb=new StringBuilder();
        sb.append(temp);
        for(int i=1;i<a.length;i++){
            char chr=s.charAt(idx);
            idx=a[idx];
            sb.append(chr);
            if(idx==0) break;
            //  System.out.println(chr);
        }
        System.out.println(sb.toString());

        String sre="999";
        //char c=sre.charAt(0);
        String ex="[a-z]*";
        String up="[A-Z]*";
        String digi="[0-9]*";
        if (sre.matches(ex)){
            System.out.println("Small");
        }
        else if (sre.matches(up)){
            System.out.println("Upper");
        }
        else if (sre.matches(digi)){
            System.out.println("Digit");
        }
        else {
            System.out.println("Other");
        }


    }




}
