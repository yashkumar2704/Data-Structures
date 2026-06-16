class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int l=0;int r=0;
        int ans=Integer.MAX_VALUE;
        int temp=0;
        while(r<nums.length){
            temp+=nums[r];
            while(temp>=t){
                
                ans=Math.min(ans,r-l+1);
                temp-=nums[l++];
                // System.out.println(temp+"  left "+l+"  right "+r);
            }
            r++;
        }
        if(ans==Integer.MAX_VALUE)return 0;
        return ans;
    }
}