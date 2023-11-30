
class Solution {
    public void sortColors(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int idx = 0;
        while (idx <= right){

            if (nums[idx]==0){
                swap(nums,idx,left);

                left+=1;
                idx+=1;
            } else if (nums[idx]==2) {
                swap(nums,idx,right);

                right-=1;
            }
            else{
                idx+=1;
            }
        }
    }

    public void swap(int[] nums, int first, int second){
        int value1 = nums[first];
        int value2 = nums[second];

        nums[first] = value2;
        nums[second]= value1;
        
    }
}