class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (mapST.containsKey(s.charAt(i))) {
                if (!mapST.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            } else {
                mapST.put(s.charAt(i), t.charAt(i));
            }
            if (mapTS.containsKey(t.charAt(i))) {
                if (!mapTS.get(t.charAt(i)).equals(s.charAt(i))) {
                    return false;
                }
            } else {
                mapTS.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
