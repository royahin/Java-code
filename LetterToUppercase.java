import java.util.*;
public class LetterToUppercase{
    public static String firstLettertoUppercase(String str){
        char ch = Character.toUpperCase(str.charAt(0));
        
        StringBuilder sb = new StringBuilder();
        sb.append(ch);
        int len = str.length();
        for (int i = 1; i<len; i++){
             if (str.charAt(i)==' '){
                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(i+1)));
                i++;

             }
             else {
                sb.append(str.charAt(i));
             }

        }
        return sb.toString();
       
    }
    public static void main (String args[]){
        String str = "Ahin is good";
        System.out.println(firstLettertoUppercase(str));
       

    }
}

