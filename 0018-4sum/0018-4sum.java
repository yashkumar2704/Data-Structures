class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        Arrays.sort(nums);
        List<List<Integer>> li= new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])continue;
                int l=j+1;
                int r=nums.length-1;
                while(r>l){
                    long k=(long)nums[i]+nums[j]+nums[l]+nums[r];
                    // System.out.println(nums[i]+ "  "+ nums[j]+"  "+ nums[l]+"  "+nums[r]);
                    if(k==(long)(t)){
                        ArrayList<Integer>a=new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[l]);
                        a.add(nums[r]);
                        li.add(a);
                        while(l<r && nums[l]==nums[l+1])l++;
                        while(r>l && nums[r]==nums[r-1])r--;
                        l++;
                        r--;
                    }
                    else if(k>t)r--;
                    else l++;
                    
                }
            }
        }
        return li;
    }
}