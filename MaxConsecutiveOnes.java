class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
        int count = 0;
        while(i < nums.length){
            if(nums[i] == 1){
                count++;
            }else if(nums[i] == 0){
                count = 0;
            }
            if(max <= count){
                max = count;
            }
            i++;
        }
        return max;
    }
}
