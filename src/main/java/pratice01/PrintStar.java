package pratice01;

public class PrintStar {

    public static void main(String[] args) {
        for (int i =0;i<=2;i++){
            for (int j=0;j<=i;j++) {
                System.out.print("--");
            }
                for (int j=i;j<=2;j++){
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
