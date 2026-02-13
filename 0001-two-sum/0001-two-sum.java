class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]={-1,-1};
        HashMap<Integer,Integer>h=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])  ){
                a[0]=i;
                a[1]=h.get(target-nums[i]);break;
            }
             h.put(nums[i],i);
        }
        return a;
    }
}