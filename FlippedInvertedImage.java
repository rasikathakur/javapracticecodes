class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] flippedImage = new int[image.length][image[0].length];
        int i = 0;
        int j = 0;
        
        while(i < image.length ){
            j = 0;
            while(j < image[0].length){
                //flipping image horizontally
                flippedImage[i][j] = image[i][(image[0].length)-1-j];

                //inverting image
                if(flippedImage[i][j] == 0){
                    flippedImage[i][j] = 1;
                }else if(flippedImage[i][j] == 1){
                    flippedImage[i][j] = 0;
                }
                j++;
            }
            i++;
        }
        return flippedImage;
    }
}
