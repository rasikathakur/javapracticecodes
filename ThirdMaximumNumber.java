class Solution {
    public int thirdMax(int[] nums) {
        int i = 0;
        Long firstmax = null;
        Long secondmax = null;
        Long thirdMax = null;
        while(i < nums.length){
            long num = nums[i];

            if((firstmax != null && num == firstmax) || (secondmax != null && num == secondmax) || (thirdMax != null && num == thirdMax)){
                i++;
                continue;
            }

            if(firstmax == null || num > firstmax){
                thirdMax = secondmax;
                secondmax = firstmax;
                firstmax = num;

            }else if(secondmax == null || num > secondmax){
                thirdMax = secondmax;
                secondmax = num;
            }else if(thirdMax == null || num > thirdMax){
                thirdMax = num;
            }
            i++;
        }
        if(thirdMax == null){
            return firstmax.intValue();
        }
        return thirdMax.intValue();
    }
}
