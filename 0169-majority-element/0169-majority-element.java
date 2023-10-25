import java.util.HashMap;
import java.util.Map;

class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(nums[i]);
            if (integer != null){
                map.put(nums[i],integer+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        Object[] keys = map.keySet().toArray();
        Object[] values = map.values().toArray();
        for (int i = 0; i < keys.length; i++) {
            if ((int)values[i]>(nums.length/2)){
                return (int)keys[i];
            }
        }
        return -1;
    }
}