class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length;j++){
                int sum=nums1[i]+nums2[j];
                h.put(sum,h.getOrDefault(sum,0)+1);
            }
        }
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length;j++){
                int sum=nums3[i]+nums4[j];
                if(h.containsKey(-sum)){
                    // h.put(-sum,h.getOrDefault(-sum,0)-1);
                    // if(h.get(-sum)==0)h.remove(-sum);
                    ans+=h.get(-sum);
                }
            }
        }

        return ans;
    }
}