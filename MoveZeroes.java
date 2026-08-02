class Solution {
    //O(n^2) time complexity
    public void moveZeroes(int[] nums) {
        int i = 0; // i to start point
        int k = nums.length - 1; // k to end

        // run till i is less than equal to k so that it will process each array element only once
        while(i <= k){
            // check if current element is equal to zero(0)
            if(nums[i] == 0){
                // if yes then shift elements to left and the kth element will become 0
                int j = i+1;
                while(j < nums.length){
                    nums[j-1] = nums[j];
                    j++; 
                }
                nums[k] = 0;
                k--;
            }
            i++;
        }
    }
}


class Solution {
    //O(n) time complexity optimized one
    public void moveZeroes(int[] nums) {
        int i = 0;
        int k = 0;
        while(i < nums.length){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }

        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    }
}
