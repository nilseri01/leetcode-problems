// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position

class Solution {
    public int minCostToMoveChips(int[] position) {
        int oddCount = 0, evenCount = 0;
 
        for (int i = 0; i < position.length;  i++) {
            if (position[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++; 
            }
        }
        return Math.min(evenCount, oddCount);
    }
}
