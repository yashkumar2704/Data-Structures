class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double ans=Integer.MIN_VALUE;
        double temp=0;
        while(j<nums.length){
            temp+=nums[j++];
            if(j-i==k){
                if(temp>ans)ans=temp;
                temp-=nums[i];
                i++;
            }
           

        }
        return ans/k;
    }
}