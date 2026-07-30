//leetcode

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

//full code

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int twoSum[] = new int[]{3,5,3,2,7};
        int arr[] = twoSum(6, twoSum);
        System.out.println("Two Sum indices are:"+Arrays.toString(arr));
    }
    
    public static int[] twoSum(int target, int[] arr){
    int i = 0;
    while(i < arr.length){
        int j = i+1;
        while(j < arr.length){
            if((arr[i]+arr[j])==target){
                return new int[]{i, j};
            }
            j++;
        }
        i++;
    }
    return new int[]{-1, -1};
}
}
