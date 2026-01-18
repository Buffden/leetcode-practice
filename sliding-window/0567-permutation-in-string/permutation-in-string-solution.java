class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int windowSize = s1.length();

        int[] freq1 = calCharFreq(s1);
        int[] freq2 = new int[26];

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            freq2[s2.charAt(right) - 'a']++;

            if (right - left + 1 > windowSize) {
                freq2[s2.charAt(left) - 'a']--;
                left++;
            }

            if (right - left + 1 == windowSize) {
                if (equalArray(freq1, freq2)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int[] calCharFreq(String s) {
        int[] charFreq = new int[26];
        for (char c : s.toCharArray()) {
            charFreq[c - 'a']++;
        }
        return charFreq;
    }

    public static boolean equalArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

