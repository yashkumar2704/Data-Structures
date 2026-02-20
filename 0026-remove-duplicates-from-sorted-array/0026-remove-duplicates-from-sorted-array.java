class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=1;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[k]){
                nums[++k]=nums[i];
                ans++;
            }
        }
        return ans;
    }
}