class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapPS = new HashMap<>();
        Map<String, Character> mapSP = new HashMap<>();

        String[] str = s.split(" ");
        if (str.length != pattern.length()) return false;

        for (int i = 0; i < pattern.length(); i++) {
            Character p = pattern.charAt(i);
            String word = str[i];

            if (mapPS.containsKey(p)) {
                if (!mapPS.get(p).equals(word)) {
                    return false;
                } 
            } else {
                mapPS.put(p, word);
            }
            if (mapSP.containsKey(word)) {
                if (mapSP.get(word) != p) {
                    return false;
                }
            } else {
                mapSP.put(word, p);
            }
        }
        
        return true;
    }
}
