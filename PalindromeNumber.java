// https://leetcode.com/problems/palindrome-number/
class Solution {
    public boolean isPalindrome(int x) {
        int xx = x;
        int yy = 0;
        while (xx > 0) {
            yy = yy * 10 + (xx % 10);
            xx = xx / 10;
        }
        return x == yy;
    }
}
