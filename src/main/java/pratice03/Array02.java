package pratice03;

public class Array02 {
    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        reverseArray(nums,0,nums.length-1);
        for (int i:nums) System.out.println(i);

    }

    public static void reverseArray(int[] num,int start,int end){
        if (start>=end ) return ;
        int temp;
        temp=num[start];
        num[start]=num[end];
        num[end]=temp;
        reverseArray(num,start+1,end-1);

       // return  num;
    }
}
