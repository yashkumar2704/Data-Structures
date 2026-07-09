class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[]=new int[nums.length];

        int ans=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<nums.length;i++){
            if(arr[i]!=nums[i]){
                
        System.out.println(arr[i]+"  "+nums[i]);
                ans=i;break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(arr[i]!=nums[i]){
                
                t=i;break;
            }
        }
        System.out.print(t+"  "+ans);
        if(t==0 && ans==0)return 0;
        return t-ans+1;
    }
}