class Solution {
    public int numRescueBoats(int[] nums, int lim) {
        Arrays.sort(nums);
        int s=0;
        int ans=0;
        int e=nums.length-1;
        while(e>s){
            if(nums[s]+nums[e]>lim){
                e--;
            }
            else{
                ans++;e--;s++;
            }

        }
        return nums.length-ans;
    }
}