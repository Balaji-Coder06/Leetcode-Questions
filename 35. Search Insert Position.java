class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) c=i;
            else{
                if(target>nums[i]) c=i+1;
            }
        }
        return c;
    }
}
