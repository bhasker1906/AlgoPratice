package pratice01;

public class BubbleSort2 {
public static void main(String args[])
{
    //int[] Array={20,35,-15,7,55,1,-22};
    int[] Array={1,2,3,-4,5};
    Boolean Swapped=false;
    for (int index=0;index<Array.length-1;index++)
    {
        for (int i=0;i<Array.length-1-index;i++){
            if(Array[i]>Array[i+1]){
                Swapped=true;
                swap(Array,i,i+1);
            }

        }
        if(!Swapped) {break;}
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
