class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>();
        int ans=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
            while(h.size()>2){
                // System.out.println(nums[l]+"  l:"+l+"  i:"+i);
                
                h.put(nums[l],h.get(nums[l])-1);
                if(h.get(nums[l])==0)h.remove(nums[l]);
                l++;
            }
            
                ans=Math.max(ans,i-l+1);
                // System.out.println(ans);
            
        }
        return ans;
    }
}