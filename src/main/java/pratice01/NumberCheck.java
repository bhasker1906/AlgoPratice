package pratice01;

public class NumberCheck {

    public static void main(String[] args){

        String str="123A";
        //isValidString(str);
        String rgx="[0-9]*";
        long[] a1={3,4,5};
        long[] a2=fix(a1);
System.out.println(a1[0]+a1[1]+a1[2]);
        System.out.println(a2[0]+a2[1]+a2[2]);
        System.out.println(str.matches(rgx));
        for(int i=0;i<str.length();i++){
            if(str.contains(rgx)){
                System.out.println("In valid");
            }
        }


    }
    static long[] fix(long[] a3){
        a3[1]=7;
        return a3;
    }
}
