class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // group frequencies
        // HashMap
        // frequency counting

        // like a bucket of strings
        Map<String, List<String>> map = new HashMap<>(); 
        
        // freq for each strings
        for (String word: strs) {
            int[] count = new int[26];
            for (char c: word.toCharArray()) {
                count[c - 'a']++;
            }
            // creating a unique cannonical key out of the freq array
            String cannonicalKey = Arrays.toString(count);

            // put the word in the map with key as the unique cannonical freq array key
            map.computeIfAbsent(cannonicalKey, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
