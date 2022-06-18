// https://leetcode.com/problems/minimum-moves-to-reach-target-score

class Solution {
    public int minMoves(int target, int maxDoubles) {
        int moves = 0;
        while (target > 1) {
            if (target % 2 == 1) {
                target--;
            } else if (maxDoubles > 0) {
                maxDoubles--;
                target /= 2;
            } else {
                return moves + target - 1;
            }
            moves++;
        }
        return moves;
    }
}
