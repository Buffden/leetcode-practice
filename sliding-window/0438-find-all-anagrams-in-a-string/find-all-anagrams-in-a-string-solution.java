import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) return ans;

        int left = 0;
        int windowSize = p.length();

        int[] freqP = calFreq(p);
        int[] freqS = calFreq(s.substring(0, windowSize));

        for (int right = windowSize - 1; right < s.length(); ) {

            if (isEqual(freqS, freqP)) {
                ans.add(left);
            }

            right++;

            if (right == s.length()) break;

            freqS[s.charAt(right) - 'a']++;

            freqS[s.charAt(left) - 'a']--;
            left++;
        }

        return ans;
    }

    public static boolean isEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static int[] calFreq(String s) {
        int[] freqArr = new int[26];
        for (char c : s.toCharArray()) {
            freqArr[c - 'a']++;
        }
        return freqArr;
    }
}

