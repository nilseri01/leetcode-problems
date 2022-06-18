// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits

class Solution {
    public int minimumSum(int num) {
        char[] charArr = String.valueOf(num).toCharArray();
        Arrays.sort(charArr);
        
        String firstNumStr = "" + charArr[0] + charArr[2];
        firstNumStr = firstNumStr.startsWith("0") ? firstNumStr.substring(1) : firstNumStr;
        
        String secondNumStr = "" + charArr[1] + charArr[3];
        secondNumStr = secondNumStr.startsWith("0") ? secondNumStr.substring(1) : secondNumStr;
        
        return Integer.parseInt(firstNumStr) + Integer.parseInt(secondNumStr);
    }
}
