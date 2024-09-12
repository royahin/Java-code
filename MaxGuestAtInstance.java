import java.util.*;
public class MaxGuestAtInstance{
public static void maxguests (int e[],int l[],int time){
    int  maxguest =0;
    int max = 0 ;
  for (int i=0; i<time; i++){
      max += e[i]-l[i];
        maxguest = Math.max(maxguest,max);
        
        }
    System.out.println("the maximun guest present at instance is "+maxguest);
 }



    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the time ");
        int time = input.nextInt();
        int e[]=new int [time];
        int l[]=new int [time];
        System.out.println("enter the number of guests entered");
        for (int i=0; i<time; i++){
           
            e[i]= input.nextInt();;

        }
        System.out.println("enter the number of guests left");
        for (int i=0; i<time; i++){
           
            l[i]=input.nextInt();

        }
       maxguests(e,l,time);

    }
}
