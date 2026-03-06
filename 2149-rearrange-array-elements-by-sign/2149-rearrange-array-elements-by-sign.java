class Solution {
    
    public int[] rearrangeArray(int[] nums) {
        int f=0;
        int s=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                arr[f]=nums[i];
                f+=2;
            }
            if(nums[i]<0){
                arr[s]=nums[i];
                s+=2;
            }
            
        }
        return arr;
    }
}