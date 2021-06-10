package pratice01;

import java.util.Arrays;

public class DivideByFive {
    public static void main(String[] args) {

        int[] nums = {2, 4, 8
                , 5, 10,12, 15,6,50,7,30,25,43,46,45,21};

        int len = nums.length - 1;
        int temp = Integer.MAX_VALUE;
        int totalfive=0;
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i]%5==0) {
                totalfive=totalfive+1;
            }
    }
        System.out.println(Arrays.toString(nums));



        for(int i=0;i<totalfive;i++) {
            //System.out.println(i);
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] % 5 == 0) {
                    /*temp = nums[j];
                    nums[j] = nums[len];
                    nums[len] = temp;
                    len = len - 1;*/
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                   //break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
