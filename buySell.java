public class buySell {
    public static int maxProfit(int[] prices) {
        int min = 100000;
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] <= min){
                min = prices[i];
            }
            else{
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []price = {2,4,2,5,3};
        System.out.println("best profit = " + maxProfit(price));
    }
}
