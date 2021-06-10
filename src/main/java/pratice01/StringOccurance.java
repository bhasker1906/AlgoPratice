package pratice01;

import java.util.Hashtable;

public class StringOccurance {
    public static void main(String[] args){

        String str="javabbabcb";
       // hashFun(str);
        //arrayFun(str);
        indexFun(str);
        Hashtable<Character,Integer> li= new Hashtable<Character,Integer>();
        for(int i=0;i<str.length();i++){
            boolean isduplicate=false;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    isduplicate=true;
                   break;
                 /* if(li.containsKey(str.charAt(i))){
                        li.put(str.charAt(i),li.get(str.charAt(i))+1);
                    }else {
                        li.put(str.charAt(i),1);
                    }*/
                }
                }
           // if(!isduplicate) System.out.println(str.charAt(i));

        }

    }

    public static void indexFun(String str) {

        for(int i=0;i<str.length();i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
        }

    }

    public static void arrayFun(String str) {
        int[] arr=new int[26];
        for(char c:str.toCharArray()) arr[c-'a']++;
        for(char c:str.toCharArray()) {
            if(arr[c-'a']==1) System.out.println(c);
        }
        }
    public static void hashFun(String str){
        Hashtable<Character,Integer> li= new Hashtable<Character,Integer>();
        for(int i=0;i<str.length();i++) {
            if(li.containsKey(str.charAt(i))){
                li.put(str.charAt(i),li.get(str.charAt(i))+1);
            }else {
                li.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(li.get(c)==1) System.out.println("HHH"+c);
        }
        System.out.println(li);
        }


}
