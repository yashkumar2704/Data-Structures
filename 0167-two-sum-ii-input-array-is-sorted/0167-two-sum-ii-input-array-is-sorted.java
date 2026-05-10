class Solution {
    public int[] twoSum(int[] nums, int t) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r]>t){
                r--;
            }
            else if(nums[l]+nums[r]<t){
                l++;
            }
            else return new int[]{l+1,r+1};
        }
        return new int[]{0,0};
    }
}