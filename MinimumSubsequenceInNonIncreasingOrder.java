// https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order

class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
          totalSum += nums[i];
        }
        int threshold = totalSum / 2;
        int sum = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0 && sum <= threshold; i--) {
            result.add(nums[i]);
            sum += nums[i];
        }
        return result;
    }
}
