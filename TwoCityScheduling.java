// https://leetcode.com/problems/two-city-scheduling

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        final int n = costs.length / 2;
        int minimumCost = 0;

        Arrays.sort(costs, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        for (int i = 0; i < n; i++) {
          minimumCost += costs[i][0] + costs[n + i][1];
        }

        return minimumCost;
    }
}
