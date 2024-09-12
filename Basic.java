/*inputs in java
 * we make a object of scanner class.
 * we write-
 * import java.util.*
 * public class Basic {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.print(input);
    }
}
    sc is not compulsory it can be anything
    *"sc.next()" only captures till space
    to print everything we use "sc.nnextLine()"
    *to print any integer we use nextInt()
    *to print any Float we use nextFloat()*/


//     import java.util.*;
//   public class Basic {
//     public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//         String input = sc.next();
//         System.out.println(input);
//         int number = sc.nextInt();
//         System.out.println(number);
//         float price = sc.nextFloat();
//         System.out.println(price);
//     }
// }



// //------------------sum of the two numbers taken from the user
// import java.util.*;/**
//  * Basic
//  */
// public class Basic {

//     public static void main(String args[]){
//         System.out.println("Enter the first number");
//     Scanner input= new Scanner(System.in);
    
//     int a = input.nextInt();
//     System.out.println("Enter the second number");
//     int b= input.nextInt();
//     int sum = a+b;
//     System.out.println("the sum is "+sum);
//     }
// }


//------------------product of two numbers from the users
// import java.util.*;/**
//  * Basic
//  */
// public class Basic {

//     public static void main(String args[]){
//         System.out.println("enter the first number for product");
//         Scanner input = new Scanner(System.in);
//         int a = input.nextInt();
//          System.out.println("enter the Second number for product");
//           int b = input.nextInt();
//           int c = (a*b);
//           System.out.print("the product is " +c);
//     }
// }



//---------------area of a circle
// import java.util.*;/**
//  * Basic
//  */
// public class Basic {

//     public static void main(String args[]){
//         System.out.println("enter the radius of the circle");
//         Scanner input = new Scanner(System.in);
//         float r = input.nextFloat();
//         float area = (3.14f*r*r);
//           System.out.print("the area is " +area);
//     }
// }


// ----------for coversion the destination type must be more than the sourse bytes
// this results in lossy coversion as most data can be lost during conversion 
// the destination converson mus be compatible type.

    
//-------------type casting is a process in which we forcibly converts one type of data to another by incuring the loss in the data!

//**********    narrowing explicit
// import java.util.*;
// public class Basic {
//     public static void main (String args []) {
//     Scanner sc = new Scanner (System. in) ;
//     float number = 99.999f;
//     int number2 = (int) number;
//     System.out. println(number2);
//     }
// }


// largest nuumber 


// import java.util.*;
// public class Basic{
//     public static void main (String args[]){
//     int a = 10;
//     int b =6;
//     if (a>b) {
//         System.out.println("the largest number is "+a);
//     }
//     else
//     {
//         System.out.println("the largest number is "+b);
//     }
//    }
// }

import java.util.*;

public class Basic {
    public static void invertedpyramid(int totrows) {
     //   int tot=0;
        for (int i = 1; i<= totrows; i++) {
            int j=0;
            for ( j =0; j <= totrows-i; j++) {
                
                    System.out.print(" ");
                }
                    for (j = 0; j <= totrows; j++) {
                
                        System.out.print("*");
                    }

                
            
            System.out.println();
                }
    }
    

        public static void main(String args[]) {
        invertedpyramid(5);
    }
}



//     //int add=0;
//     System.out.println("enter the number of numbers you want to enter");
//     int n = input.nextInt();
//     if (n>1){
//         for (int i= n; i>=1 ; i--){
       
//             fact *=i;
//            // add = fact +add;
//         }
//         System.out.println("the factorial of the given number is"+fact);

//     }
//     else {
//         System.out.println("Enter value greater then 1");
//     }
// }
// }

    

    // //boolean isprime = true ;
    // for (int i = 1 ; i<= n; i++){
    //     System.out.println("enter the " + i + /*getNumberSuffix(i) */"nd number");
    //     int num = input.nextInt();
    //    // for (int j = 2; j<= num-1; j++){
        
    //         if (num % 2 == 0){
    //             evensum = evensum+num;
                
    //         }
    //         else{
    //             oddsum = oddsum+ num;

    //         }
    //     }
    //     System.out.println("the sum of odd number is " + oddsum);
    //     System.out.println("the sum of odd number is " + evensum);
    // }
       
    // }



// import java.util.Scanner;

// public class Basic {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int oddSum = 0;
//         int evenSum = 0;

//         System.out.println("Enter the number of numbers you want to enter:");
//         int n = input.nextInt();

//         for (int i = 1; i <= n; i++) {
//             System.out.println("Enter the " + i + " number:");
//             int num = input.nextInt();

//             if (num % 2 == 0) {
//                 evenSum += num; // Add to even sum if the number is even
//             } else {
//                 oddSum += num; // Add to odd sum if the number is odd
//             }
   
//         }
//     }
// }
//     boolean isPrime = true;
//     for (int i = 2 ; i<= n-1; i++){
//         if (n % i == 0){
//             isPrime = false;
//            break;
//         }
//     }
//         if (isPrime = true){
//             System.out.println("the number is not prime");}
//          else {
//             System.out.println("the muber is prime");
//         }
//         }
// }
    
    
       
//        System.out.println(n);
// }
//        while (true);
//       //System.out.println("you have entered a number multiple of 10");
//     }
// }
       // }
    //     public static void main (String args[]){
    //     int n=1;  
    //     Scanner input= new Scanner (System.in);
    //     for (int i=0; (n%10)!=0; i++){
    //     System.out.println("enter the number");
    //     n = input.nextInt();
    //     }
    //     System.out.println("you have entered a number multiple of 10");
    // }
    // }
// }
//         int newvar = 0;
//         while (n>0){
//             int lastdig = n%10;//shows the last numberr
//             newvar = (newvar*10)+lastdig;
//             n/=10;
           
//             }
//             System.out.println(newvar);
//     }
// }

        //  int j=0;
        //  while (i<=n){
        //     j+=i;
        //     i+=1;
        // }
        // System.out.println(j);
    //     }else if (b>c) {
    //     System.out.println("2nd number is largest");
    // }
    // else
    // {
    //     System.out.println("3rd number is largese");
    // }
   




