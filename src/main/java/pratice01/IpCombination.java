package pratice01;

import java.util.ArrayList;
import java.util.List;

public class IpCombination {
    public static void main(String[] args)
    {
        String s="25011255255";
       // ArrayList<String> al=new ArrayList<String>();
       // IpValidation();
     /*   if(s.length()<4 || s.length()>12){
           // return new ArrayList<>();
        }*/
        List<String> al = restoreIpAddresses(s);
        /*List<String> al = new ArrayList<String>();
        ip(s,3,"",al);
        //return al;*/
       // for(String i :al)
       // {
            System.out.println(al.toString());
        //}
    }

    static List<String> restoreIpAddresses(String s) {
        if(s.length()<4 || s.length()>12){
            return new ArrayList<String>();
        }

        List<String> al = new ArrayList<String>();
        ip(s,3,"",al);
        return al;
    }
    static void ip(String s, int parts, String ips, List<String> al){
        if(s.length() == 0 && parts!=0){
            return;
        }

        if(parts==0){
            ips += s;
            if((s.charAt(0) == '0' && s.length()>1)){
                return;
            }
            long val = Integer.parseInt(s);
           if(val > 255){
                return;
            }

                al.add(ips);
                return;

        }
        for(int i=1;i<=3 && i<s.length();i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i);
            int val = Integer.parseInt(s1);
            //System.out.println("Hello");
            if((s1.charAt(0) == '0' && s1.length()>1)){
                continue;
            }
            if(val <= 255){
                ip(s2,parts-1,ips+s1+".",al);
            }
        }

    }
}
