class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        int i = 1;
        int result = 0;
        while(true){
            if(i % 2 == 0 && i % n == 0){
                return i;
            }
            i++;
        }
    }
}
