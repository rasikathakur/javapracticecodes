class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        while(i < candies.length){
            j = 0;
            boolean canHaveGreatest = true;
            while(j < candies.length){
                if((candies[i]+extraCandies) < candies[j]){
                    canHaveGreatest = false;
                    break;
                }
                j++;
            }
            result.add(canHaveGreatest);
            i++;
            
        }
        return result;
    }
}
