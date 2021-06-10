package pratice01;

public class PrintDiamond {
    public static void main(String[] args){
            printDiamond(3);
          }

          static void printDiamond(int n){
            int space=n-1;
        for(int i=0;i<n;i++){
            //System.out.print(" ");
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
            space--;
        }
              space=0;
              for(int i=n;i>0;i--){
                  //System.out.print(" ");
                  for(int j=0;j<space;j++){
                      System.out.print(" ");
                  }
                  for (int j=0;j<i;j++){
                      System.out.print("* ");
                  }
                  System.out.print("\n");
                  space++;
              }


          }
}
