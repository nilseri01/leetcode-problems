// https://leetcode.com/problems/split-a-string-in-balanced-strings

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, balance = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            balance += (c == 'L' ? 1 : -1);
            count += (balance == 0) ? 1 : 0;
        }
        return count;
    }
}
