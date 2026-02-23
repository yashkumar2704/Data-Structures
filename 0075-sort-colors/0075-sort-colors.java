class Solution {
    public void sortColors(int[] nums) {
        int f=0;
        int  mid=0;
        int end=nums.length-1;
        while(mid<=end){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[f];
                nums[f]=temp;
                f++;
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[end];
                nums[end]=temp;
                end--;
            }
            else mid++;
            // for(int i=0;i<nums.length;i++){
            //     System.out.print(nums[i]+" ");
            // }
            // System.out.println();
        }
    }
}