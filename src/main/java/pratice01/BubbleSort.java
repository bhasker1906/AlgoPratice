package pratice01;

public class BubbleSort {
public static void main(String args[])
{
    int[] Array={20,35,-15,7,55,1,-22};
    for (int index=Array.length-1;index>0;index--)
    {
        for (int i=0;i<index;i++){
            if(Array[i]>Array[i+1]){
                swap(Array,i,i+1);
            }

        }
    }
    for (int i=0;i<Array.length;i++){
        System.out.println(Array[i]);
    }

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
