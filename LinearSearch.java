import java.util.*;
public class LinearSearch{
    public static void linsearch(int array[]){
        int larg=array[0];
        for (int i= 1; i < array.length; i++){
            if (array[i]>larg){ 
                larg=array[i];
                
               // System.out.println("the number is in " +i+"position"); 
                //return i;//Next, the return i; statement is executed, which terminates the function and returns the index i to the calling function.
            }
            
        }
        // System.out.println(+array[0]);
        // return array[0];
        System.out.println(+larg);
        //return larg;
                              
            
    }
public static void main (String args[]){
    int arr[]={1,2,3,4,5,66,7,8,56};
    //int num= 0;
     linsearch(arr);
   
}
    
}
