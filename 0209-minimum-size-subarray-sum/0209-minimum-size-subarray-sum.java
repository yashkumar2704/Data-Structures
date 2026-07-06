class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int l=0;
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            while(temp>=t){
                ans=Math.min(ans,i-l+1);
                temp-=nums[l];
                l++;
            }
        }
        if(ans==Integer.MAX_VALUE)return 0;
        return ans;
    }
}