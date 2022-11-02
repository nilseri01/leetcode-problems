// https://leetcode.com/problems/find-common-characters/

class Solution {
    public List<String> commonChars(String[] words) {        
        int [][]charCountArrays = new int[words.length][26];
        
        for (int i = 0; i < charCountArrays.length; i++) {
            Arrays.fill(charCountArrays[i], 0);
        }

        for (int i = 0; i < words.length; i++) {
            String word =  words[i];
            for (int j = 0; j < word.length(); j++) {
              charCountArrays[i][word.charAt(j) - 'a']++;  
            } 
        }
       
        List<String> commonCharArrayList = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int commonCount = charCountArrays[0][i];
            for (int j = 1; j < words.length; j++) {
                commonCount = Math.min(commonCount, charCountArrays[j][i]);
            }
             
            String charStr = new Character((char) ('a' + i)).toString();
            for (int j = 0; j < commonCount; j++) {
                commonCharArrayList.add(charStr);
            }
        }

        return commonCharArrayList;
    }
}
