import java.util.*;
public class COMPRESSION{
    public static String compression(String str){
        StringBuilder str1 = new StringBuilder();
        int len = str.length();
       
        for (int i =0 ; i<len-1; i++){
            Integer count = 1;
            while (i<len-1 && str.charAt(i)==str.charAt(i+1)){
                count ++;
                i++;


            }
            str1.append(str.charAt(i));
            if(count>1){
                str1.append(count.toString());
            }
            
            
        }
        return str1.toString();
    }

    public static void main (String args[]){
        String str = "aabbbccc";
      System.out.println(compression(str));
    }
}
