class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> aIndices = new ArrayList<Integer>();
        List<Integer> bIndices = new ArrayList<Integer>();

        for (int i = 0; i <= (s.length() - a.length()); i++) {
            if (s.substring(i, i + a.length()).equals(a)) {
                aIndices.add(i);
            }
        }

        for (int i = 0; i <= s.length() - b.length(); i++) {
            if (s.substring(i, i + b.length()).equals(b)) {
                bIndices.add(i);
            }
        }
        Set<Integer> newSet = new HashSet<>();
        for (Integer i: aIndices) {
            for (Integer j: bIndices) {
                if (Math.abs(i - j) <= k) {
                    newSet.add(i);
                    break;
                }
            }
        }
        List<Integer> result = new ArrayList<>(newSet);
        Collections.sort(result);
        return result;
    }
}
