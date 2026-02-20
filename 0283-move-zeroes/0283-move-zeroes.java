class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1)return;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k++]=nums[i];
                nums[i]=temp;
            }
        }
    }
}