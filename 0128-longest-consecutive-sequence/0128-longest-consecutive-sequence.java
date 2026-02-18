class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        
        int ans=0;
        for(int num:h){
            if(!h.contains(num-1)){
                int curr=num;
                int t=1;
                while(h.contains(curr+1)){
                    // curr++;
                    t++;curr++;
                }
                if(ans<t)ans=t;
            }
            
        }
        return ans;


    }
}