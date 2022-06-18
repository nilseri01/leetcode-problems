// https://leetcode.com/problems/minimum-time-to-type-word-using-special-typewriter

class Solution {
    public int minTimeToType(String word) {
        int result = 0;
        char current = 'a';
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result += Math.min(Math.abs(c - current), 26 - Math.abs(c - current)) + 1;
            current = c;
        }
        return result;
    }
}
