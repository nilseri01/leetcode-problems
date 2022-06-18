// https://leetcode.com/problems/two-furthest-houses-with-different-colors

class Solution {
    public int maxDistance(int[] colors) {
        int size = colors.length;
        int maxDistance = -1;
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (colors[i] != colors[j] && (j - i) > maxDistance) {
                    maxDistance = (j - i);
                }
            }
        }
        return maxDistance;
    }
}
