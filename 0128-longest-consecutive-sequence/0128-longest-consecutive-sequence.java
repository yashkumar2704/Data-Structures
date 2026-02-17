class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums); 
        if (nums.length == 0) return 0;
        int ans=0;int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            if(nums[i]==nums[i-1]+1)max++;
            else max=0;
            if(ans<max)ans=max;
        }
        
        
        return ans+1;


    }
}