class Solution {
    public int threeSumClosest(int[] nums, int t) {
        
        Arrays.sort(nums);
        int an=nums[0]+nums[1]+nums[2];
        int c=0;

        for(int i=0;i<nums.length-1;i++){
            
            int l=i+1;
            int r=nums.length-1;

            while(l<r){
                c= nums[i] + nums[l] + nums[r];

                if(c==t)return c;

                else if(c<t)l++;
                
                else r--;

                if(Math.abs(c-t)<Math.abs(an-t))an=c;
            }
        }
        
        return an;
    }
}