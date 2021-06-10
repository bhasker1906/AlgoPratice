package pratice01;

import java.util.Arrays;

public class SeletionSort {
public static void main(String args[])
{
    //int[] Array={20,35,-15,7,55,1,-22};
    int[] Array={1,2,3,-4,5};
    Boolean Swapped=false;
    for (int index=0;index<Array.length-1;index++)
    {
        int largest=index;
        for (int i=index+1;i<Array.length;i++){
            if(Array[i]<Array[largest]){
               // Swapped=true;
                largest=i;

            }
        }
        swap(Array,largest,index);
        //if(!Swapped) {break;}
    }
    System.out.println(Arrays.toString(Array));
  /*  for (int i=0;i<Array.length;i++){
        System.out.println(Array[i]);
    }*/

}

public static void swap(int[] array,int i,int j){

    if(i==j){
        return ;
    }
    int temp=array[i];
    array[i]=array[j];
    array[j]=temp;

}
}
