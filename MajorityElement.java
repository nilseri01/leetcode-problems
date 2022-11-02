// https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int majorityIndex = 0, count = 1;
        for (int i = 1; i < nums.length; i++) {
            count = (nums[majorityIndex] == nums[i]) ? (count + 1) : (count - 1);
            
            if (count == 0) {
                majorityIndex = i;
                count = 1;
            }
        }
        
        return nums[majorityIndex];
    }
}
