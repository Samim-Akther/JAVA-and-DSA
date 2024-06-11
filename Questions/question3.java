package Questions;
/*you are given an array prices where prices[i] is the price of a given stoc on the ith dsay. 
you want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock. return the maximun profit
you can achieve from this transation. if you can not achieve any profit return 0. 
prices ={7,1,5,3,6,4}
ans =5  */
public class question3 {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(int prices[]){
        int maxprofit =0;
        int buyprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit = prices[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }
            else{
                buyprice= prices[i];
            }
        }
        return maxprofit;
    }
}


/*
 WE ALSO WRITE THIS CODE LIKE THIS -----:
                                        :


public static int maxprofit(int prices[]){
    int leastsofar=Integer.MAX_VALUE;//LEAST PRICES OR FIRST TIME WHEN WE WILL BUY IT
    int overallProfit =0; 
    int profitIfSold_today = 0;

    for(int i=0;i<prices.length;i++){
    if(prices[i]<leastsofar){
    leastsofar =prices[i]; //LEAST PRICES FOR TODAY 
       }
    profitiIfSold_today = prices[i]-leastsofar; //IF WE SELL OUR STOCK TODAY

    if(profitIfSold_today >overallProfit ){
    overallProfit=profitIfSold_today;
       }
 }
    return overallProfit;
}
 */