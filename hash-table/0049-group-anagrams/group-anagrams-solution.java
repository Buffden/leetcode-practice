class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        /*“I can generate a canonical key for each word.
        The simplest approach is sorting characters.
        If we want to optimize further, we can use a fixed-size 
        frequency signature to get linear time.”
        */
        HashMap<String, List<String>> groups = new HashMap<String, List<String>>();

        for (String s: strs) {
            int[] count = new int[26];

            for (char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder key = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                key.append('#').append(count[i]);
            }
            groups.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}
