class Solution {
    public int countDigit(int num){
        int count = 0;
        int temp = num;
        while(temp != 0){
            count++;
            temp = temp/10;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int i = 0;
        int countNumbers = 0;
        while(i < nums.length){
            if(countDigit(nums[i]) % 2 == 0){
                countNumbers++;
            }
            i++;
        }
        return countNumbers;
    }
}
