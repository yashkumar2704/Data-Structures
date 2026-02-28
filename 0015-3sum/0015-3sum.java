class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>li=new ArrayList<>();
        Set<List<Integer>>s=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            int a=nums[i];
            int l=i+1;
            int r=nums.length-1;
            while(r>l){
                if(nums[r]+nums[l]==-a){
                    List<Integer>k=new ArrayList<>();
                    k.add(nums[i]);
                    k.add(nums[l]);
                    k.add(nums[r]);
                    s.add(k);
                    r--;
                }
                else if(nums[r]+nums[l]<-a)l++;
                else r--;
            }
        }
        for(List<Integer> e:s){
            li.add(e);
        }
        return li;
    }
}