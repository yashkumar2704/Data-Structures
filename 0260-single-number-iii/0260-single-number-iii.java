class Solution {
    public int[] singleNumber(int[] nums) {
        int x=nums[0];
        for(int i=1;i<nums.length;i++){
            x^=nums[i];
        }
        int mask=x & (-x);
        int a=0;int b=0;
        for(int i=0;i<nums.length;i++){
            if((mask & nums[i]) ==0)a^=nums[i];
            else b^=nums[i];
        }
        return new int[]{a,b};
    }
}