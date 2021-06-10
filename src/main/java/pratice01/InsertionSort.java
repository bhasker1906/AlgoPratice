package pratice01;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){

        int[] num={5,3,7,2};
        insertionsort(num);

    }

    static void insertionsort(int[] num){
        int element;
        int value;
        for (int i=1;i<num.length;i++){
            element=i;
            value=num[i];

            while(element>0 && num[element-1]>value){
                num[element]=num[element-1];
                element--;
            }
            num[element]=value;
        }
        System.out.println(Arrays.toString(num));
    }
}
