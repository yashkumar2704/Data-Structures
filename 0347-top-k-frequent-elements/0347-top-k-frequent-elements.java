class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[]=new int[k];
        Map<Integer,Integer>h=new HashMap<>();
        List<Integer> arr[]=new ArrayList[nums.length +1];
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            arr[e.getValue()].add(e.getKey());
        }
        int p=0;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr[i].size();j++){
                ans[p++]=arr[i].get(j);
                // k--;
                if(k==p)return ans;
            }
        }
        return ans;
    }
}