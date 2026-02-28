class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>li=new ArrayList<>();
        // Set<List<Integer>>s=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int a=nums[i];
            int l=i+1;
            int r=nums.length-1;
            while(r>l ){
                if(nums[r]+nums[l]==-a){
                    List<Integer>k=new ArrayList<>();
                    k.add(nums[i]);
                    k.add(nums[l]);
                    k.add(nums[r]);
                    li.add(k);
                    while(l<r && nums[l]==nums[l+1])l++;
                    while(l<r && nums[r]==nums[r-1])r--;
                    r--;
                    l++;
                }
                else if(nums[r]+nums[l]<-a)l++;
                else r--;
            }
        }
        
        return li;
    }
}