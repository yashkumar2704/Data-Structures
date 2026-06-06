class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>l2=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
    if(i > 0 && nums[i] == nums[i-1]) continue;
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i]>0)r--;
                else if(nums[l]+nums[r]+nums[i]<0)l++;
                else{
                    List<Integer>l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[l]);
                    l1.add(nums[r]);
                    l2.add(l1);
                    while(l<r && nums[l]==nums[l+1])l++;
                    while(l<r && nums[r]==nums[r-1])r--;
                    r--;l++;

                }
            }
        }
        return l2;
    }
}