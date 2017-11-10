class Solution {
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (prices == null || prices.length == 0){
            return 0;
        }
        
        int[][] l = new int[n][3];
        int[][] g = new int[n][3];
        
        for (int i = 1; i < prices.length; i++){
            int diff = prices[i] - prices[i - 1];
            for (int j = 1; j <= 2; j++) {
                l[i][j] = Math.max(g[i - 1][j - 1] + Math.max(diff, 0), l[i -1][j] + diff);
                g[i][j] = Math.max(l[i][j], g[i - 1][j]);    
            }
        }
        
        return g[n - 1][2];
    }
}