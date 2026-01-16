class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int left = 0;
        int right = 0;
        int maxCount = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (right = 0; right < n; right++) {
            // conditionally increasing left index when the charSet contains the character,
            // as the condition of "non repeating character" fails
            while(charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }
            // finding the unique chat at index "right"
            // add this char in the set as its unique char
            charSet.add(s.charAt(right));

            // this is important to track the maxCount yet and current length of the substring
            maxCount = Math.max(maxCount, right - left + 1);

            // right index will automatically increase because of for loop 
            // to check for "max" length of substring
        }
        return maxCount;
    }
}
