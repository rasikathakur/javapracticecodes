class ReversingNumber {
    public int reverse(int x) {
        int temp = x;
        int rev = 0;
        while(temp != 0){
            int lastDigit = temp % 10;

             // Check positive overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && lastDigit > 7))
                return 0;

            // Check negative overflow
            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && lastDigit < -8))
                return 0;
            rev = (rev*10)+lastDigit;
            temp = temp/10;
        }
        return rev;
    }
}
