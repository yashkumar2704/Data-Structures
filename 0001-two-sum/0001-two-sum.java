class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]={-1,-1};
        HashMap<Integer,Integer>h=new HashMap<>();
       for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(h.containsKey(k)){
                a[1]=i;
                a[0]=h.get(k);
            }
            h.put(nums[i],i);
       }
       return a;
    }
}