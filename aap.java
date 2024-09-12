import java.util.*;
public class aap{
    public static void pairnum (int thearr[]){
        int i=0;
        int sum =0;

       int max=0;
        int n= thearr.length;
        for (i=0;i<n;i++){    //i=0
            for(int j=0;j<n-1;j++){   //j=0;
               // for (int k = i; k<j;k++){     //k=0 ; k<0  false prints nothing  
                                               // k=o ; k<1 true prints 2
                                               // k=0 ; K< 2 true prints 2,4

                    sum =thearr[i] + thearr[j];
                   
                    System.out.println("the sum of "+thearr[j]+" and " +thearr[j+1]+" is "+sum);

                    if (sum>max){ // compares the max value
                    max =Math.max(max, sum);
                }
            }
            sum =0;
          //  max=0;
            //   sum=0; //resets the sum to initial value
             

            
            
             //prints the maximum value at the end of a complete sub array
            // max =0; //resets the max to 0
            
            //System.out.print(" ");
            
        }

       System.out.print(max );
        
        //return sum;
        
    }
    public static void main (String args[]){
        int arr[]= {2,4,6,8,10};
       pairnum(arr) ;

    }
}

