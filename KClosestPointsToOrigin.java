// https://leetcode.com/problems/k-closest-points-to-origin/

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> orderedPointsQueue = new PriorityQueue<int[]>((p1, p2) ->  (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]));
        
        for (int[] point : points) {
            orderedPointsQueue.offer(point);
            if (orderedPointsQueue.size() > k) {
                orderedPointsQueue.poll();
            }
        }
        
        int[][] closestPointsArray = new int[k][2];
        int i = 0;
        while (i < k) {
            closestPointsArray[i] = orderedPointsQueue.poll();
            i++;
        }
        return closestPointsArray;
    }
}
