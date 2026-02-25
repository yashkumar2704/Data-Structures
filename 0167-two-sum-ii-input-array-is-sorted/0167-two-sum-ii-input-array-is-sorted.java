class Solution {
    public int[] twoSum(int[] nums, int t) {
        int f=0;
        int e=nums.length-1;
        
        while(e>f){
            int sum=nums[f]+nums[e];
            
            if(sum==t){
                return new int[]{f+1,e+1};
            }
            else if(sum>t){
                e--;
            }else f++;
        }
        return new int[]{-1,-1};
        
        

    }
}