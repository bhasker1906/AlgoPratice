package pratice01;

public class BoatsProblem {
    public static void main(String[] args){
        int[] num={3,2,2,1};
        int k=3;
        int cnt=0;
      for (int i=0;i<num.length;i++){
            for(int j=0;j<i;j++) {
                System.out.println("*");
            }
        }
        int i=0;
        int j=num.length-1;

        while(i<j){
            if(num[i]+num[j]<=3){
                cnt++;
                i++;
                //j--;
            }else{
                //j--;
                i++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
