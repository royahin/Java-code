import java.util.*;
public class PALINDROME{
    public static boolean checkpalindrome(String str){
        //store the legth if the string in a var
        int n = str.length();
        for (int i=0; i<n/2; i++){
            if (str.charAt(i)!= str.charAt(n-1-i)){
                 return false;
                
            }
            
           
        }
        return true;
    }
    public static void main (String args[]){
        String palindrome= "nin";
        boolean check = checkpalindrome(palindrome);
        if(check==true){
            System.out.println("the word is palindrome");

        }
        else{
            System.out.println("it's not palindrome");
        }

    }
}

