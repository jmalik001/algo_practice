package leetcode.slidingWindow;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;

        for (int stockPrice: prices){
            min = Math.min(min, stockPrice);
            maxProfit = Math.max(maxProfit,stockPrice - min);
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int res=  BestTimeToBuyStock.maxProfit(new int[] {7,1,5,3,6,4});
        System.out.println(res);
    }
}
