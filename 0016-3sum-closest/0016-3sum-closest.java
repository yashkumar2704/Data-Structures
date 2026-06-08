class Solution {
    public int threeSumClosest(int[] nums, int t) {
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        int ans1=0;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1;
            int r=nums.length-1;
        
            while(r>l){
                int temp=nums[i]+nums[l]+nums[r];
                int k= Math.abs(temp-t);
                if(nums[i]+nums[l]+nums[r]<t){
                    l++;
                }
                else{
                    r--;
                }

                if(ans>k){
                    ans=k;
                    ans1=temp;
                }
            }
        }
        return ans1;
    }
}