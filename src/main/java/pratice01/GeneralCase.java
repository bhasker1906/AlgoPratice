package pratice01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GeneralCase {
    public static void main(String[] args){

        int x=3,y=5,z=10;
        int re=++z+y-y+z+x++;

       System.out.println(++z+y-y+z+x++);

       String s="(())]";


       // Hashtable<Character,Integer> li= new Hashtable<Character,Integer>();
        HashMap<Character, Integer> li =
                new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){

            if(li.containsKey(s.charAt(i))){
               li.put(s.charAt(i),li.get(s.charAt(i))+1);
            }
            else{
                li.put(s.charAt(i),1);
            }
        }

        Iterator hmIterator = li.entrySet().iterator();
        int sum=0;
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
          //  int marks = Integer.parseInt((String) mapElement.getValue());
            int marks = ((Integer)mapElement.getValue());
            sum+=marks;
           // System.out.println(mapElement.getKey() + " : " +marks +sum );
        }
        System.out.println(sum%2);
        if(sum%2==0){
            System.out.println("Expression OK");
        }
        else{
            System.out.println("Not Matched");
        }
        //li.put("K",1);
        //li.put("J",2);
        System.out.println(li.toString());
        GeneralCase obj=new GeneralCase();
        //System.out.println(obj.repeatedStringMatch("abcd","cdabcdab"));
        System.out.println(obj.repeatedStringMatch("ab","abab"));
        System.out.println(obj.repeatedStringMatch("geeks","geeksgeeks"));

    }
    int Cnt=0;
    StringBuilder sb=new StringBuilder();
   /* int repeatedStringMatch(String A, String B)
    {
        // Your code goes here

        //sb.append(A);
        // sb.append(A);
        //sb.append(A);
        if(A.contains(B)) return 1;
        if(sb.toString().contains(B)){return Cnt;} else{ Cnt++;repeatedStringMatch(sb.append(A).toString(),B);}
        return Cnt;
    }*/

    int repeatedStringMatch(String a, String b)
    {
        // Your code goes here

        //sb.append(A);
        // sb.append(A);
        //sb.append(A);
        System.out.println(b.length() +":::"+a.length() +"   "+b.length()%a.length());

        if(b.length()%a.length()!=0) return -1;
        int count = b.length() / a.length();

        // Repeat a count number of times
        String str = "";
        for(int i = 0; i < count; i++)
        {
            str = str + a;
        }

        if(str.contains(b))
            return count;
        return -1;
    }
}
