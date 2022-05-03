class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> symbolValueMap = new LinkedHashMap<>();
        symbolValueMap.put("IV", 4);
        symbolValueMap.put("IX", 9);
        symbolValueMap.put("XL", 40);
        symbolValueMap.put("XC", 90);
        symbolValueMap.put("CD", 400);
        symbolValueMap.put("CM", 900);
        symbolValueMap.put("I", 1);
        symbolValueMap.put("V", 5);
        symbolValueMap.put("X", 10);
        symbolValueMap.put("L", 50);
        symbolValueMap.put("C", 100);
        symbolValueMap.put("D", 500);
        symbolValueMap.put("M", 1000);
        
        Integer sum = 0;
        while (s.length() > 0) {
            for (Map.Entry<String, Integer> entry : symbolValueMap.entrySet()) {
                if (s.startsWith(entry.getKey())) {
                    sum += entry.getValue();
                    s = s.substring(entry.getKey().length());
                    break;
                }
            }
        }
        
        return sum;
    }
}
