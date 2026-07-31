class Solution {
    public int largestAltitude(int[] gain) {
        int i = 0;
        int highest = 0;
        int currentAltitude = 0;
        while(i < gain.length){
            currentAltitude += gain[i];
            if(currentAltitude > highest){
                highest = currentAltitude;
            }
            i++;
        }
        return highest;
    }
}

