package com.dsa.app.leetcode.top150.arraystring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.random.RandomGenerator;

// https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150

public class LC0380_InsertDeleteGetRandom {

    Map<Integer,Integer> map ;
    ArrayList<Integer> arr ;

    public LC0380_InsertDeleteGetRandom() {
        map = new HashMap<>();
        arr = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,arr.size());
        arr.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(map.containsKey(val)){
            int index = map.get(val);
            int lastElement = arr.get(arr.size()-1);
            arr.set(index,lastElement);
            map.put(lastElement,index);
            arr.remove(arr.size()-1);
            map.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        RandomGenerator rand = RandomGenerator.getDefault();
        // Generates a random index from 0 to arr.length - 1
        int randomIndex = rand.nextInt(arr.size());
        return arr.get(randomIndex);
    }


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
}
