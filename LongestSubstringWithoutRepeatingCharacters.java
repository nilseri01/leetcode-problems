// https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<String> strList = new ArrayList<>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (str.indexOf(s.charAt(i)) > -1) {
                if (str.length() > 0) {
                    strList.add(str);
                }
                str = str.substring(str.indexOf(s.charAt(i)) + 1);
            }
            str += s.charAt(i);
        }
        // add final substr if exists
        if (str.length() > 0) {
            strList.add(str);
        }
        
        int strLength = 0;
        for (String sub : strList) {
            if (sub.length() > strLength) {
                strLength = sub.length();
            }
        }
        return strLength;
    }
}
