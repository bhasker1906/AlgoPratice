package pratice01;

import java.util.ArrayList;

public class PrintUnique {
    public static  void main(String[] args){

       /* for (int i=1;i<14;i++){
            if(i%10==i/10){  System.out.println(i%10+"  " +i/10); continue;}
           // System.out.println(i);
            System.out.println(i%10+"  " +i/10);
        }*/
       String IP="2542540123";
       ArrayList<String> al= new ArrayList<String>();
        combination(IP,3,"",al);
        System.out.println(al.toString());
    }

    static void combination(String s,int pos,String ips,ArrayList al){

        if(pos==0){
            ips+=s;
            if(s.charAt(0)=='0' && s.length()>1) {
                return;
            }
            long val=Integer.parseInt(s);
            if(val>255) return;
            al.add(ips);
        }


        for(int i=1;i<=3&& i<s.length();i++){
            String s1=s.substring(0,i);
            String s2=s.substring(i);
           long val =Integer.parseInt(s1);

            if(s1.charAt(0)=='0' && s1.length()>1) {
                continue;
            }
            if(val<255){
                combination(s2,pos-1,ips+s1+".",al);
            }

        }

    }
}
