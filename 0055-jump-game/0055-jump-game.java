class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
        int max=0;
        for(int i=0;i<=n;i++){
            max=Math.max(max,nums[i]);
            if(max>=n-i)return true;
            if(max==0)return false;
            max--;
        }
        return false;
    }
}