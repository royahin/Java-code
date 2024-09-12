import java.util.*;
public class gg{
    public static void print(String str){
    int len = str.length();
    int len1= len-2;
    StringBuilder str1 = new StringBuilder();
    str1.append(Character.toLowerCase(str.charAt(0))) ;
    str1.append(len1) ;
    str1.append(Character.toLowerCase(str.charAt(len-1))) ;
    System.out.println(str1.toString());
    }
public static void main(String args[]) {
    String str = "Sampad";
    print(str);
    
}
}
