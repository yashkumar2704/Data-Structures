class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)l++;
            else r++;
        }
        // System.out.println(l+"  "+r);
        int i=0;
        int t=l;
        while(l>0 && r>0){
            // System.out.println(nums[nums.length-r]);
            if(Math.abs(nums[l-1])>nums[nums.length-r]){
                arr[i]=nums[nums.length-r]*nums[nums.length-r];
                r--;
            }else{
                arr[i]=nums[l-1]*nums[l-1];
                l--;
            }
            // System.out.println(arr[i]+" element");
            i++;
        }
        while(l>0){
            arr[i]=nums[l-1]*nums[l-1];
            l--;i++;
        }
        while(r>0){
            arr[i]=nums[nums.length-r]*nums[nums.length-r];
            r--;i++;
        }

        return arr;
        
    }
}