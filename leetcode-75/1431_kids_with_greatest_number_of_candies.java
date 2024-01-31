class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int leastToBeBiggest = Arrays.stream(candies).max().getAsInt() - extraCandies;
        List<Boolean> resultList = new ArrayList();

        for (int i: candies) {
            resultList.add(i >= leastToBeBiggest);
        }

        return resultList;
    }
}
