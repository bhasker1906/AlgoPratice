package pratice03;

public class Array04 {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };
        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);
    }

    public static void printUnion(int[] arr1,int[] arr2,int m,int n){
        int j=0;
        for (int i =0;i<m;i++){
            if(arr1[i]>arr2[j] && j<n){
                System.out.println(arr2[j]+ " ");
                System.out.println(arr1[i] +" ");
                j++;
            }
            else if(arr1[i]<arr2[j] && j<n){
                System.out.println(arr1[i] +" ");

            }else{
                System.out.println("Duplicate :: "+arr2[j]);
                j++;
            }

        }

        while(j<=n-1){
            System.out.println(" " +arr2[j]);
            j++;
        }



    }
}
