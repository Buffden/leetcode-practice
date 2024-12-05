class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows < 1) return null;

        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                int prevElement1 = (i > 0 && j < listOfLists.get(i - 1).size()) ? listOfLists.get(i - 1).get(j) : 0;
                int prevElement2 = (i > 0 && j - 1 >= 0) ? listOfLists.get(i - 1).get(j - 1) : 0;

                if (j == 0 || j == i) {
                    innerList.add(1);
                } else {
                    innerList.add(prevElement1 + prevElement2);
                }
            }

            listOfLists.add(innerList);
        }

        return listOfLists;
    }
}
