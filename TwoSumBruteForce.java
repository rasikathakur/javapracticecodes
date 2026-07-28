class TwoSum {

    public int[] twoSum(int[] nums, int target){
        //initialize i and j to 0
        int i = 0; 
        int j = 0;
        while(i < nums.length){ //loop through nums array
            j = i+1; //start after ith position to reuce time complexity
            while(j < nums.length){ 
              //check whether the the sum matched target
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j}; //if yes return result
                }
                j++;
            }
            i++;
        }
        throw new IllegalArgumentException("No solution found");
    }

}
