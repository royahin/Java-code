import java.util.*;

public class FlTriangle{
    public static void flyordtriangle (int len ){
        int num=1;
        for (int i=0; i<len; i++){
            for (int j=0; j<=i; j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();
        }
    }




    public static void main (String args[]){
        int num = 5;
        flyordtriangle (num);

    }
}
