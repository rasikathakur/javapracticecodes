class Concatentination {
    public int[] getConcatenation(int[] nums) {
        int i = 0;
        int n = nums.length;
        int ans[] = new int[2*n];
        while(i < nums.length){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
            i++;
        }
        return ans;
    }
}
