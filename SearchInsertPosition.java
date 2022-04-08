// https://leetcode.com/problems/search-insert-position/
class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, mid = 0;
        int end = nums.length - 1;
        int index = nums.length;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                index = mid;
                end = mid - 1;
            }
        }
        
        return index;
    }
}
