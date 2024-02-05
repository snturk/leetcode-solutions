class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrLength = nums.length;
        int[] result = new int[arrLength];
        int zeroCount = 0;
        int multiplyResult = 1;

        for (int n : nums) {
            if (n == 0) zeroCount++;
            else multiplyResult *= n;
        }


        if (zeroCount == 0) {
            for (int i = 0; i < arrLength; i++) {
                result[i] = multiplyResult / nums[i];
            }
        } else if (zeroCount == 1){
            for (int i = 0; i < arrLength ; i++) {
                if (nums[i] == 0)
                    result[i] = multiplyResult;
            }
        }

        return result;
    }
}
