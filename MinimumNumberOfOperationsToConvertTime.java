// https://leetcode.com/problems/minimum-number-of-operations-to-convert-time

class Solution {
    public Integer convertToMins(String time) {
        String[] hourMinArr = time.split(":");
        
        String hourStr = hourMinArr[0].startsWith("0") ? hourMinArr[0].substring(1) : hourMinArr[0];
        Integer hourInMins = Integer.valueOf(hourStr) * 60;
        
        String minStr = hourMinArr[1].startsWith("0") ? hourMinArr[1].substring(1) : hourMinArr[1];
        Integer mins = Integer.valueOf(minStr);
        
        return hourInMins + mins;
    }
    
    public int convertTime(String current, String correct) {
        Integer currentSum = convertToMins(current);
        Integer correctSum = convertToMins(correct);
 
        Integer diff = correctSum - currentSum;
        Integer counter60 = diff / 60;
        diff -= counter60 * 60;
        Integer counter15 = diff / 15;
        diff -= counter15 * 15; 
        Integer counter5 = diff / 5;
        diff -= counter5 * 5;
        return counter60 + counter15 + counter5 + diff;
    }
}
