class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int i=0;
        int j=1;
        int max=0;
        while(j<n){
            if(prices[j]>prices[i]){
                int sub=prices[j]-prices[i];
                max=Math.max(max,sub);
            }
            else{
                i=j;
            }
            j++;
        }
        return max;
    }
}