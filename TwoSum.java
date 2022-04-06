// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer requiredValue = target - nums[i];
            if (valueIndexMap.containsKey(requiredValue)) {
                return new int[]{i, valueIndexMap.get(requiredValue)};
            }
            valueIndexMap.put(nums[i], i);
        }
        return null;
    }
}
