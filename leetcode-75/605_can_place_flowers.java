class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) {
            return true;
        }

        int placedFlowers = 0;
        int prevPlaceStatus = 0;
        int nextPlaceStatus;
        
        for(int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                prevPlaceStatus = flowerbed[i];
                continue;
            }

            if (i != flowerbed.length - 1) {
                nextPlaceStatus = flowerbed[i+1];
            } else {
                nextPlaceStatus = 0;
            }

            if(prevPlaceStatus == 0 && nextPlaceStatus == 0) {
                if (n == ++placedFlowers) {
                    return true;
                } else {
                    flowerbed[i] = 1;
                }
            }
            prevPlaceStatus = flowerbed[i];
        }
        return false;
    }
}
