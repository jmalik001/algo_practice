package leetcode.slidingWindow;

public class BestTimeToBuyStockTwoPointer {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int l =0;
        int r =1;

        while(r< prices.length){
            if(prices[r] > prices[l]){
                maxProfit = Math.max(prices[r] - prices[l], maxProfit);
            }else{
                l = r;
            }
            r++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
      int res=  BestTimeToBuyStockTwoPointer.maxProfit(new int[] {7,1,5,3,6,4});
      System.out.println(res);
    }
}
