import java.util.HashSet;

class Solution {
    int prefix(String word1, String word2) {
        int a = Math.min(word1.length(), word2.length());
        for (int i = 0; i < a; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                return i;
            }
        }
        return a;
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        List<Pair> combinedArr = new ArrayList<>();

        for (int num: arr1) {
            combinedArr.add(new Pair(Integer.toString(num), 1));
        }

        for (int num: arr2) {
            combinedArr.add(new Pair(Integer.toString(num), 2));
        }

        combinedArr.sort((p1, p2) -> p1.word.compareTo(p2.word));

        int maximum = 0;
        for (int i = 0; i < combinedArr.size() - 1; i++) {
            if (combinedArr.get(i).index != combinedArr.get(i + 1).index) {
                maximum = Math.max(maximum, prefix(combinedArr.get(i).word, combinedArr.get(i + 1).word));
            }
        }
        return maximum;

    }
    static class Pair {
        String word;
        int index;

        Pair(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }
}
