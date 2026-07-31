class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int ans[] = new int[2*n];
        while(i < n){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[i+n];
            i++;
        }
        return ans;
    }
}
/*
nums = {2,3,4,5,6,7}
expected {2,5,3,6,4,7}
i = 0
ans[2*0] = nums[0] -> ans[0] = 2
ans[2*0+1] = nums[0+3] -> ans[1] = 5

i = 1
ans[2*1] = nums[1] -> ans[2] = 3
ans[2*1+1] = nums[1+3] -> ans[3] = 6

i = 2
ans[2*2] = nums[2] -> ans[4] = 4
ans[2*2+1] = nums[2+3] -> ans[5] = 7
*/
