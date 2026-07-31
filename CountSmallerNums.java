class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[] = new int[nums.length];
        int i = 0;
        int j = 0;
        while(i < nums.length){
            count[i] = 0;
            i++;
        }
        i = 0;
        while(i < nums.length){
            j = 0;
            while(j < nums.length){
                if(nums[i] > nums[j]){
                    count[i]++;
                }    
                j++;
            }
            i++;
        }
        return count;
    }
}

/* Counting smaller numbers than current number in array*/
