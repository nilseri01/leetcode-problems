// https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> openCloseMap = new HashMap<>();
        openCloseMap.put('}', '{');
        openCloseMap.put(']', '[');
        openCloseMap.put(')', '(');
        
        Stack<Character> charStack = new Stack<>();
        
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++) {
            if (openCloseMap.get(chars[i]) == null) {
                charStack.push(chars[i]);
            } else {
                Character openChar = openCloseMap.get(chars[i]);
                if (charStack.empty()) {
                    return false;
                }
                if (charStack.pop() != openChar) {
                    return false;
                }
            }
        }
        return charStack.empty();
    }
}
