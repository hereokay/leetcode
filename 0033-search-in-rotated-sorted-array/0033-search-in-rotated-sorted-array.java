
class Solution {
    public int search(int[] nums, int target){
        int pivot = getPivot(nums);

        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left+right)/2;

            int value = getArrayValue(nums,pivot,mid);
            if (value == target){
                return (mid+pivot)% nums.length;
            }
            else if (value > target){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return -1;
    }


    public int getArrayValue(int[] nums, int pivot, int idx){
        int real = (idx+pivot) % nums.length;
        return nums[real];
    }

    public int getPivot(int[] nums){

        int left = 0;
        int right = nums.length-1;

        if (nums[left] <= nums[right]){
            return 0;
        }

        while (left < right){
            int mid = (left+right)/2;

            if (isValid(nums[mid],nums[0])){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    public boolean isValid(int x, int limit){
        return x < limit;
    }
}
