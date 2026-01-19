class Solution {
    /*
    right expands greedily
    left moves only when necessary
    Each index moves at most once → O(n)
    freq always reflects the current window exactly
    */
    public int totalFruit(int[] fruits) {
        int left = 0;
        int ans = 0;
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        
        for (int right = 0; right < fruits.length; right++) {
            // Longest subarray with at most 2 distinct elements
            // max length of the substring of non zero and unique number untill 2
            // if the unique fruit is of third category then we have to return the max length so far



            freq.put(fruits[right], freq.getOrDefault(fruits[right], 0) + 1);

            // invalid condition, so making it valid again in loop
            while (freq.size() > 2) { 
                // reducing just one occurance of the tree at once, rather than removing them in bulk
                freq.put(fruits[left], freq.get(fruits[left]) - 1);
                if (freq.get(fruits[left]) == 0) {
                    freq.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(right - left + 1, ans);
        }
        return ans;
    }
}
