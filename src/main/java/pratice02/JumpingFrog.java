package pratice02;

public class JumpingFrog {
    public static void main(String[] args) {
        int[] steps={0,1,0,0,0,1,0};
        int[] steps1={0, 0, 1, 0, 0, 1, 0};
        minimumSteps(steps);
        minimumSteps(steps1);

    }

    public static void  minimumSteps(int[] steps){
        int cnt=0;
        int i=0;

        while(i<steps.length-1){
            if(steps[i+2]==1){
                cnt++;
                i++;
            }
            else{
                cnt++;
                i+=2;
            }
            }
        System.out.println(cnt);

        int count = 0;
        for (int j = 0; j < steps.length - 1; j++) {
            if (steps[j] == 0) j++;
            count++;
        }
        System.out.println(" Method 2   "+count);
    }
}
