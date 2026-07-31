class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int k = 0;
        while(i < nums.length){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        return k;
    }
}

/*Remove Element val all occurences and starting k digits of array should be not equal to val and k = number of occurences of val*/

