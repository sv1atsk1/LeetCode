package by.viachaslau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class RandomizedSet {

    private final List<Integer> nums;
    private final Map<Integer, Integer> positions;

    public RandomizedSet() {
        nums = new ArrayList<>();
        positions = new HashMap<>();
    }

    public boolean insert(int val) {
        if (positions.containsKey(val))
            return false;
        nums.add(val);
        positions.put(val, nums.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!positions.containsKey(val))
            return false;
        int position = positions.get(val);
        nums.set(position, nums.get(nums.size() - 1));
        positions.put(nums.get(position), position);
        nums.remove(nums.size() - 1);
        positions.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get((int) (Math.random() * nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */