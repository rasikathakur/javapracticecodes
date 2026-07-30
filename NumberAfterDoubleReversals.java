class NumberAfterDoubleReversals {
    public int reversal(int num){
        int temp = num;
        int reverse = 0;
        while(temp != 0){
            int lastDigit = temp % 10;
            reverse = (reverse*10)+lastDigit;
            temp = temp / 10;
        }
        return reverse;
    }
    public boolean isSameAfterReversals(int num) {
        int reverse1 = reversal(num);
        int reverse2 = reversal(reverse1);
        if(reverse2 == num){
            return true;
        }else{
            return false;
        }
    }
}
