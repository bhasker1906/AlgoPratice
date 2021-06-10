package pratice01;

public class Pallindram {

    public static void main(String[] args) {
        //System.out.println("Hello");
        String str="cabag";

        int i=0;
        int j=str.length()-1;
        String result=null;
        while (i<j){

            System.out.println("i "+i +" j "+j +" "+str.charAt(i) +"  " +str.charAt(j));
            if(str.charAt(i)==(str.charAt(j))){
                result=str.substring(i,j+1);
                i++;
                j--;
            }
            else{
                str=str.substring(i,str.length()-1);
                i++;
                j=str.length()-1;
                }

        }
        System.out.println(result);

    }
}
