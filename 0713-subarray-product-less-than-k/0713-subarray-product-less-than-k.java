class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        int j=0;
        int i=0;
        int t=1;
        while(j<nums.length){
            t*=nums[j];
            while(t>=k && i<=j){
                t/=nums[i];
                i++; 
                
            }
            if(t<k){
                ans+=j-i+1;
            }
            
            
            j++;
        }
        return ans;
    }
}