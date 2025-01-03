class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int left = 0;
        int right = 0;
        int maxCount = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (right = 0; right < n; right++) {
            while(charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));

            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}
