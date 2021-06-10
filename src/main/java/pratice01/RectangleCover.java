package pratice01;

import java.util.Arrays;

public class RectangleCover {

    public static void main(String[] args)
    {
        System.out.println(solution(new int[]{3, 1, 4}));
        System.out.println(solution(new int[]{5,3, 2, 4}));
        System.out.println(solution(new int[]{5, 3, 5, 2, 1}));
        System.out.println(solution(new int[]{7, 7, 3, 7, 7}));
        System.out.println(solution(new int[]{1, 1, 7, 6, 6, 6}));
    }

    static int solution(int[] H){
        System.out.println(Arrays.toString(H));
        int len=H.length;
        int[] left=new int[len];
        int[] right=new int[len];
        int max=0;
        for(int i=0;i<len;i++){
            max=max>=H[i]?max:H[i];
            left[i]=max;
        }
        max=0;
        for(int i=len-1;i>=0;i--){
            max=max>=H[i]?max:H[i];
            right[i]=max;
        }
        int result=Integer.MAX_VALUE;
        for(int j=1;j<len;j++){

            result= Math.min(result,left[j-1]*j+right[j]*(len-j));
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return result;
    }
}
