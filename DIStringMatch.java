// https://leetcode.com/problems/di-string-match

class Solution {
    public int[] diStringMatch(String s) {
        int min = 0, max = s.length();
        int[] result = new int[s.length() + 1];
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'I') {
                result[i] = min;
                min++;
            } else {
                result[i] = max;
                max--;
            }
        }
        result[s.length()] = min;
        return result;
    }
}
