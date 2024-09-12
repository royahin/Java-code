import java.util.*;
// main calss
public class MaxStockPrice {
    // the method for the operation 
    public static void maxstocksprofit(int stockprice[]){
        int n= stockprice.length; //array length
        int maxprofit=0;
        int lowestbuyprice= stockprice[0];//initialze the 1st price
        for (int i=1;i<n;i++){
            //enters this condition only when it find a better buy price.
            if(stockprice[i]<lowestbuyprice){//if 2nd price is lower than the previous price
               lowestbuyprice=stockprice[i];//then that price is the best price to buy the stocks
            }
            else{
                //it calculates the profits for each steps
                 int profit=stockprice[i]-lowestbuyprice;
                 //it compares the pervious profit and stores max profit
                 maxprofit= Math.max( maxprofit,profit);
            }
               
        }
        System.out.println(maxprofit);
    }
    public static void main (String args []){
        int stockprice1[] = {1, 2, 3, 4, 5};
        maxstocksprofit(stockprice1); // Expected output: 4
        
        int stockprice2[] = {5, 4, 3, 2, 1};
        maxstocksprofit(stockprice2); // Expected output: 0
        
        int stockprice3[] = {3, 3, 3, 3, 3};
        maxstocksprofit(stockprice3); // Expected output: 0
        
        int stockprice4[] = {5};
        maxstocksprofit(stockprice4); // Expected output: 0
        
        int stockprice5[] = {7, 1, 5, 3, 6, 4};
        maxstocksprofit(stockprice5); // Expected output: 5
        
        int stockprice6[] = {3, 2, 6, 1, 4};
        maxstocksprofit(stockprice6); // Expected output: 4
        
        int stockprice7[] = {1, 7, 2, 6, 3, 5, 4, 8};
        maxstocksprofit(stockprice7); // Expected output: 7
               
            }

}