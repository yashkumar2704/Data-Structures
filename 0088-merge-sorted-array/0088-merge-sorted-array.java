class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums[]=new int[m+n];
        int l=0;
        int r=0;
        int i=0;
        while( m>0 && n>0){
            if(nums1[l]<nums2[r]){
                nums[i++]=nums1[l++];m--;
            }else{
                nums[i++]=nums2[r++];n--;
            }
        }
        int m1=m;
        int n1=n;
         while(m1 > 0){
            nums[i++] = nums1[l++];
            m1--;
        }

        while(n1 > 0){
            nums[i++] = nums2[r++];
            n1--;
        }
        for(int j=0;j<nums.length;j++){
            nums1[j]=nums[j];
        }
    }
}