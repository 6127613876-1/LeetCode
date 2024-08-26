public class BuyandSellStock
{
    public int max(int[] prices)
    {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min = prices[i];
            }
            else {
                int p = prices[i] - min;
                if (p > max) {
                    max = p;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        BuyandSellStock bs = new BuyandSellStock();
        int[] p = {7,1,5,3,6,4};
        System.out.println(bs.max(p));
    }
}
