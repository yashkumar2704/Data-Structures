class Solution {
    public int minCost(String s, int[] nums) {
        int i=0;int j=1;
        int ans=0;
        while(j<nums.length && i<nums.length){
            
            if(s.charAt(i)==s.charAt(j)){
                
                if(nums[i]<nums[j]){
                    ans+=nums[i];
                    i=j;
                }else {
                    ans+=nums[j];
                    j++;
                }
            }
            else {
                i=j;
            }
            if(i==j)j++;
            
        }
        return ans;
    }
}