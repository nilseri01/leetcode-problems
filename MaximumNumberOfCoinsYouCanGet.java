// https://leetcode.com/problems/maximum-number-of-coins-you-can-get

class Solution {
    public int maxCoins(int[] piles) {
        int roundCount = piles.length / 3;
        Arrays.sort(piles);
        int counter = 0;
        for (int i = roundCount; i < piles.length; i += 2)
            counter += piles[i];
        return counter;
    }
}
