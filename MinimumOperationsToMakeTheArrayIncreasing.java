// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing

class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int previous = nums[i-1];
            int current = nums[i];
            
            if (current <= previous) {
                current = previous + 1;
                count += (current - nums[i]);
                nums[i] = current;
            }
        }
        
        return count;
    }
}
