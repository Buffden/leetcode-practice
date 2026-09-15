class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // frequency counting
        // hashMap number -> frequency
        // Bucket frequency 

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }

            buckets[count].add(num);
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num: buckets[i]) {
                    result[index++] = num;
                    
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
