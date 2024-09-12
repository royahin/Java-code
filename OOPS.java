// import java.util.*;
// public class array{
//     public static void linsearch(int array[]){
//         int larg=array[0];
//         for (int i= 1; i < array.length; i++){
//             if (array[i]>larg){ 
//                 larg=array[i];
                
//                // System.out.println("the number is in " +i+"position"); 
//                 //return i;//Next, the return i; statement is executed, which terminates the function and returns the index i to the calling function.
//             }
            
//         }
//         // System.out.println(+array[0]);
//         // return array[0];
//         System.out.println(+larg);
//         //return larg;
                              
            
//     }
// public static void main (String args[]){
//     int arr[]={1,2,3,4,5,66,7,8,56};
//     //int num= 0;
//      linsearch(arr);
   
// }
    
// }

// import java.util.io.*;
// class array {
//     public static int removeElement(int[] nums, int val) {
//         for (int i=0; i<=nums.length; i++){
//             if (nums[i]!=val){
//                 System.out.print(+i);
                
//             }
//         }
//         return i;
//     }
//     public static void main(String args[]){
//         int arr[]={3,2,2,3};
//         int the_num =3;
//         removeElement(arr,the_num);
//     }
// }

// class Solution {
//     public static int removeElement(int[] nums, int val) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if (nums[i]!=val){
//                 //System.out.print(" "+nums[i]);
//                  //count +=1;
//                 num[i]=num[i];
//             }
//             else{
//                 count+=1;
//             }

//         }
//        // for (i=0;i<nums.length;i++){
//         System.out.print(+nums[i]);
        
//         return count;
        
//     }
//     public static void main(String args[]){
//         int array[]={3,2,2,3};
//         int num = 3;
//         int output = removeElement(array,num);
//         System.out.println("the value of k is"+output);

//     }

// }

//import java.util.Arrays;
// import java.util.*;

// public class OOPS {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("How many strings do you want to store?");
//         int n = scanner.nextInt();
//         scanner.nextLine(); 
//         String[] stringArray = new String[n];
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter string " + (i + 1) + ":");
//             stringArray[i] = scanner.nextLine();
//             check ( stringArray[i]);
//         }
//     }
        
//         public static void check(String new_arr){
//             int i=0;
//             int start=0;
//            int end= (new_arr.length-1);
//        for (i=0; i<new_arr.legth ; i++){
//         if (new_arr[i]=="0"&&new_arr[i+1]=="0"){
//             stringArray1[i]=new_arr[i-1];

//         }
//        }
        


    
// }}



// public class OOPS
// {
// Run | Debug
// public static void main(String argsil) E
// Pen p1 = new Pen(): //created a pen object called pl
// Pen pl
// }
// class Pen {
// String color; int tip;
// void setColor (String newColor) {
// color = newColor;
// ｝
// void setTip (int newTip){
// tip = newTip;
// ｝



// import java.util.*;
// public class OOPS{



//     public static void pairnum (int thearr[]){
//         int i=0;
//         int sum =0;

//        int max=0;
//         int n= thearr.length;
//         for (i=0;i<n;i++){    //i=0
//             for(int j=i;j<=n;j++){   //j=0;
//                 for (int k = i; k<j;k++){     //k=0 ; k<0  false prints nothing  
//                                                // k=o ; k<1 true prints 2
//                                                // k=0 ; K< 2 true prints 2,4

//                     sum =sum + thearr[k];
                   
//                     System.out.print(thearr[k]+" ");

                    
//                 }
                
//                 System.out.println ("the sum is "+sum);// prints the sum

//                 System.out.println(" ");
                
//                 if (sum>max){ // compares the max value
//                     max =sum;
//                 }
                
//               sum=0; //resets the sum to initial value
             

//             } 
            
//             System.out.println("thw maximun is "+max); //prints the maximum value at the end of a complete sub array
//             max =0; //resets the max to 0
            
//             System.out.print(" ");
            
//         }
       
        
//         //return sum;
        
//     }
//     public static void main (String args[]){
//         int arr[]= {2,4,6,8,10};
//        pairnum(arr) ;

//     }
// }



import java.util.*;
// main calss
public class OOPS {
    // the method for the operation 
    public static void rainwaterstored(int heights[]){
        int n = heights.length;
        //array to store the left max of the heights
        int leftmax[] = new int[n];
        //to store the left most array of the heights to the staring of leftmax
        leftmax[0]=heights[0];
        //int i=0;
        for (int i=1; i<n;i++){ //checks from index 1 of height 
            if (heights[i]>leftmax[i-1]){ //if index  is greater than the previous max 
                int max=heights[i]; //replace with the number
                leftmax[i]=max;
            }
        }

        // array to store the right max in a array 
        int rightmax[]= new int[n];
        //stores the end array of height array to the ed array of endmax
       rightmax[n-1] =heights[n-1];
        for (int i=n-2; i>=0;i--){
            //if the 2nd last array of height is greater than the  last array
            if (heights[i]>rightmax[i+1]){
                int max1=heights[i];//replace the value with value
                rightmax[i]=max1;
            }
        }
        int sum =0;
        for (int i=0; i<n; i++){
          int themax=Math.min(leftmax[i],rightmax[i]);
          sum= sum+(themax-heights[i]);
        }
        System.out.println(sum);


    }
}




//     //main function
//     public static void main (String args []){
//         int heights[]={4,2,0,6,3,2,5};
//          rainwaterstored(heights);
       
//     }
// }

// import java.util.*;
// // main calss
// public class OOPS {
//     // the method for the operation 
//     public static void maxstocksprofit(int stockprice[]){
//         int n= stockprice.length; //array length
//         int maxprofit=0;
//         int lowestbuyprice= stockprice[0];//initialze the 1st price
//         for (int i=1;i<n;i++){
//             //enters this condition only when it find a better buy price.
//             if(stockprice[i]<lowestbuyprice){//if 2nd price is lower than the previous price
//                lowestbuyprice=stockprice[i];//then that price is the best price to buy the stocks
//             }
//             else{
//                 //it calculates the profits for each steps
//                  int profit=stockprice[i]-lowestbuyprice;
//                  //it compares the pervious profit and stores max profit
//                  maxprofit= Math.max( maxprofit,profit);
//             }
               
//         }
//         System.out.println(maxprofit);
//     }
//     public static void main (String args []){
//         int stockprice1[] = {1, 2, 3, 4, 5};
//         maxstocksprofit(stockprice1); // Expected output: 4
        
//         int stockprice2[] = {5, 4, 3, 2, 1};
//         maxstocksprofit(stockprice2); // Expected output: 0
        
//         int stockprice3[] = {3, 3, 3, 3, 3};
//         maxstocksprofit(stockprice3); // Expected output: 0
        
//         int stockprice4[] = {5};
//         maxstocksprofit(stockprice4); // Expected output: 0
        
//         int stockprice5[] = {7, 1, 5, 3, 6, 4};
//         maxstocksprofit(stockprice5); // Expected output: 5
        
//         int stockprice6[] = {3, 2, 6, 1, 4};
//         maxstocksprofit(stockprice6); // Expected output: 4
        
//         int stockprice7[] = {1, 7, 2, 6, 3, 5, 4, 8};
//         maxstocksprofit(stockprice7); // Expected output: 7
               
//             }

// }





// import java.util.*;
// public class OOPS {
//     public static string printLetters(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         String ahin="hello";
//         printLetters(ahin);
//     }
// }

// import java.util.*;
// public class OOPS{
//     public static boolean checkpalindrome(String str){
//         //store the legth if the string in a var
//         int n = str.length();
//         for (int i=0; i<n/2; i++){
//             if (str.charAt(i)!= str.charAt(n-1-i)){
//                  return false;
                
//             }
            
           
//         }
//         return true;
//     }
//     public static void main (String args[]){
//         String palindrome= "ahin";
//         boolean check = checkpalindrome(palindrome);
//         if(check==true){
//             System.out.println("the word is palindrome");

//         }
//         else{
//             System.out.println("it's not palindrome");
//         }

//     }
// }



// import java.util.*;
// public class OOPS{
//     public static String firstLettertoUpppercase(String str){
//         char ch = Character.toUpperCase(str.charAt(0));
        
//         StringBuilder sb = new StringBuilder();
//         sb.append(ch);
//         int len = str.length();
//         for (int i = 1; i<len; i++){
//              if (str.charAt(i)==' '){
//                 sb.append(str.charAt(i));
//                 sb.append(Character.toUpperCase(str.charAt(i+1)));
//                 i++;

//              }
//              else {
//                 sb.append(str.charAt(i));
//              }

//         }
//         return sb.toString();
       
//     }
//     public static void main (String args[]){
//         String str = "Ahin is good";
//         System.out.println(firstLettertoUpppercase(str));
       

//     }
// }


// import java.util.*;
// public class OOPS{
//     public static String compression(String str){
//         StringBuilder str1 = new StringBuilder();
//         int len = str.length();
       
//         for (int i =0 ; i<len-1; i++){
//             Integer count = 1;
//             while (i<len-1 && str.charAt(i)==str.charAt(i+1)){
//                 count ++;
//                 i++;


//             }
//             str1.append(str.charAt(i));
//             if(count>1){
//                 str1.append(count.toString());
//             }
            
            
//         }
//         return str1.toString();
//     }

//     public static void main (String args[]){
//         String str = "aabbbccc";
//       System.out.println(compression(str));
//     }
// }

// import java.util.*;
// public class OOPS{



//     public static void repeat (int thearr[],int target){
//        // int lastindex =0 ;
//        int len = thearr.length;
//         for (int i=0; i<len; i++){
           
//             if (thearr[i]== target){
//              //  lastindex ++;
//                System.out.println("the 1st index of the element is " +i);
//             }

//         }
       
       
     
        
//     }
//     public static void main (String args[]){
//         int arr[]= {2,4,6,2,10};
//         int target = 2;
//         repeat(arr,target) ;

//     }
// }


