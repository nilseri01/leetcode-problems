
// https://leetcode.com/problems/maximum-subarray/
// Kadane's Algorithm : https://medium.com/@rsinghal757/kadanes-algorithm-dynamic-programming-how-and-why-does-it-work-3fd8849ed73d
// Solution: https://github.com/charles-wangkai/leetcode/blob/master/maximum-subarray/Solution.java
class Solution {
    public int maxSubArray(int[] nums) {
        Integer result = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result = Math.max(result, sum);
            sum = Math.max(sum, 0);
        }
        
        return result;
    }
}
