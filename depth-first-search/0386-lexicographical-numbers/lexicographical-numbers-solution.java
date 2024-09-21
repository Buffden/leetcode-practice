class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> numArr = new ArrayList<>();
        int number = 1;
        for (int i = 0; i < n; i++) {
            numArr.add(number);
            
            if (number * 10 <= n) {
                number *= 10;
            }
            else {
                if (number >= n) {
                    number /= 10;
                }
                number++;
                
                while (number % 10 == 0) {
                    number /= 10;
            }
            }
            

        }
        return numArr;
    }
}
