class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        int i = 0;
        int j = 0;
        while(i < accounts.length){
            int sum = 0;
            j = 0;
            while(j < accounts[0].length){
                sum += accounts[i][j];
                j++;
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
            i++;
        }
        return maxWealth;
    }
}
