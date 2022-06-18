// https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount

class Solution {
    public int minimumCost(int[] cost) {
        int result = 0;
        Arrays.sort(cost);
        int j = 1;
        for (int i = cost.length - 1; i >= 0; i--) {
             if (j % 3 != 0) {
                 result += cost[i];
             } 
             j = (j % 3 == 0) ? 1 : (j + 1);
        }
        return result;
    }
}
