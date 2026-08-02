//O(n^3) time complexity

class Solution {
    public int maximumProduct(int[] nums) {
        int i = 0;
        int product = 0;
        int maxProduct = 0;
        while(i < nums.length){
            int j = i+1;
            while(j < nums.length){
                int k = j+1;
                while(k < nums.length){
                    product = nums[i]*nums[j]*nums[k];
                    if(Math.abs(product) > maxProduct){
                        maxProduct = product;
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        return maxProduct;
    }
}

//O(n) time complexity

class Solution {
    public int maximumProduct(int[] nums) {
        int i = 0;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while(i < nums.length){
            int num = nums[i];

            if(num > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;

            }else if(num > secondMax){
                thirdMax = secondMax;
                secondMax = num;
            }else if(num > thirdMax){
                thirdMax = num;
            }

            if(num < firstMin){
                secondMin = firstMin;
                firstMin = num;
            }else if(num < secondMin){
                secondMin = num;
            }
            i++;
        }
        int product1 = firstMax * secondMax * thirdMax;
        int product2 = firstMax * secondMin * firstMin;
        return Math.max(product1, product2);
    }
}
