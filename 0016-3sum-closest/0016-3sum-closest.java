class Solution {
    public int threeSumClosest(int[] nums, int t) {
        int ans=Integer.MAX_VALUE;
        int an=Integer.MIN_VALUE;
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int a=nums[i];
            int l=i+1;
            int r=nums.length-1;
            while(r>1 && l<nums.length-1){
                if(l==r){r--;continue;};
                c=nums[l]+nums[r]+a;
                if(nums[l]+nums[r]+a==t)return c;
                else if(nums[l]+nums[r]+a<t)l++;
                
                else r--;
                if((c>t && c<ans))ans=c;
                if((c<t && c>an))an=c;
            }
        }
        // System.out.println(Math.abs(ans-t)+"   "+ Math.abs(an-t));
        if(Math.abs(ans-t)>Math.abs(an-t) && an!=Integer.MIN_VALUE)return an;
        return ans;
    }
}