class Solution {
    public void sortColors(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int idx = getIndexAboutMinValue(nums, i+1);
            
            if (idx == -1){
                continue;
            }

            int first = nums[i];
            int second = nums[idx];

            if (first > second){
                nums[i]= second;
                nums[idx]= first;
            }

        }
    }

    public int getIndexAboutMinValue(int[] nums, int from){
        int minValue = Integer.MAX_VALUE;
        int idx = -1;

        for (int i = from; i < nums.length; i++) {
            if (minValue >= nums[i]){
                minValue=nums[i];
                idx=i;
            }
        }

        return idx;
    }
}