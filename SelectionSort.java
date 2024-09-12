import java.util.*;
public class SelectionSort{
    public static void print (int arr[]){
        for (int  i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void selectionsort (int arr[]){
        for (int i=0; i<arr.length; i++){
            int minnum = i;// initialixe the 1st element as the samallest no
            for (int j=i+1; j<arr.length; j++){
                if(arr[minnum]>arr[j]){ //compares the 1st element with the 2nd element..if found it initialze that no with the smallest no.
                    minnum=j;// initialze the smallest no from the array to minnum.
                }
                
            }
            // after finding the smallest no then we swap that no with the 1st then to 2nd and goes on as the outer loop increases..
            //swap
            int temp = arr[minnum];
            arr[minnum]= arr[i];
            arr[i]=temp;
        }
       
    }
public static void main(String args[]) {
    int arr[]={5,4,3,2,1};
    selectionsort(arr);
    print (arr);
    
}
}