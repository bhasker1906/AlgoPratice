package pratice01;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){
        int numary[]={4,6,8,12,33};
        //System.out.println(Arrays.toString(Arrays.sort(numary)));
        int key=33;
       System.out.println(search(numary,0,numary.length,key));
       System.out.println(Palidrom("ABBA"));
       Hanoi(2,'A','B','C');
    }

    static void Hanoi(int n,char from_node,char to_node,char source){

        if(n==1){
            System.out.println("Move disk 1 from rod " +  from_node + " to rod " + to_node);
            return;
            }
        Hanoi(n-1,from_node,source,to_node);
        System.out.println("Move disk " + n + " from rod " +  from_node + " to rod " + to_node);
        Hanoi(n-1,source,to_node,from_node);


    }
    static int Palidrom(String str){
        if(str.length()==1 || str.length()==0){
            return 1;
        }

        if(str.charAt(0)==str.charAt(str.length()-1))
            return Palidrom(str.substring(1,str.length()-1));
        return -1;
    }

    static int search(int arry[],int left,int right,int key){


        if(left<right){
            int mid=(left+right)/2;

            if(arry[mid]==key){
                return mid;
            }
            if(arry[mid]<key){
             return search(arry,mid+1,right,key);
            }
            return search(arry,0,mid-1,key);

        }
        return -1;

    }
}
