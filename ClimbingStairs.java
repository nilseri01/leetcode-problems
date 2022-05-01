// https://leetcode.com/problems/climbing-stairs/
// solution: https://github.com/charles-wangkai/leetcode/blob/master/climbing-stairs/Solution.java
class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        
        int prev = 1;
        int curr = 2;
        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            
            prev = curr;
            curr = next;
        }
        
        return curr;
    }
}
