class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>h=new HashMap<>(); int ans=0;
        for(int i:nums){
            ans+=h.getOrDefault(i,0);
            h.put(i,h.getOrDefault(i,0)+1);
        }
        // int ans=0;
        // for(Map.Entry<Integer,Integer> e:h.entrySet()){
        //     int v=e.getValue();
        //     ans+=(v)*(v-1)/2;
        // }
        return ans;
    }
}