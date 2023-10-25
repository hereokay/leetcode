
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            if (i==length-1){
                list.add(nums[i]);
            }
            else if (nums[i] != nums[i+1]){
                list.add(nums[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }
}