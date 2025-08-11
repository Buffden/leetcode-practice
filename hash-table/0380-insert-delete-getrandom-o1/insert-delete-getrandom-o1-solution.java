class RandomizedSet {
    private final List<Integer> list;
    private final Map<Integer, Integer> index;
    private final Random rand;
    
    public RandomizedSet() {
        this.list = new ArrayList<>();
        this.index = new HashMap<>();
        this.rand = new Random();
    }
    
    public boolean insert(int val) {
        if (index.containsKey(val)) return false;

        index.put(val, list.size());
        list.add(val);

        return true;
    }
    
    public boolean remove(int val) {
        Integer i = index.get(val);
        if (i == null) return false;

        Integer lastVal = list.get(list.size() - 1);

        list.set(i, lastVal);
        index.put(lastVal, i);
        
        list.remove(list.size() - 1); // pop last element from the list
        index.remove(val); // removing the key and its value from the map
        return true;
    }
    
    public int getRandom() {
        Integer random = rand.nextInt(list.size());
        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
