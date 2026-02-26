class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int f=0;
        int ans=Integer.MAX_VALUE;
        int e=0;
        int sum=0;
        while(f<nums.length){
            sum+=nums[f];
            while(sum>=t){
                    ans=Math.min(ans,f-e+1);
                sum=sum-nums[e++];
            }
            f++;
        }
        if(ans==Integer.MAX_VALUE)return 0;

        return ans;
    }
}