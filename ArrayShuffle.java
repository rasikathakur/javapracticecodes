class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int ans[] = new int[2*n];
        while(i < n){
            ans[2*i] = nums[i];
            ans[2*i+1]=nums[i+n];
            i++;
        }
        return ans;
    }
}
