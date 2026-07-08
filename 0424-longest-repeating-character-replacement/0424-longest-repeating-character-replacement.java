class Solution {
    public int characterReplacement(String s, int k) {
        int nums[]=new int[26];
        int l=0;
        int ans=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'A']++;
            if(max<nums[s.charAt(i)-'A']){
                max=nums[s.charAt(i)-'A'];
            }
            // int diff=i-l+1-max;
            while(i-l+1-max>k){
                nums[s.charAt(l)-'A']--;
                l++;
            }
            
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}