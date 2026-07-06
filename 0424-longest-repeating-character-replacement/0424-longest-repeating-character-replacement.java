class Solution {
    public int max(int arr[]){
        int max=0;
        for(int i=0;i<26;i++){
            max=Math.max(arr[i],max);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int ans=0;
        int l=0;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            int len=i-l+1;
            int diff=len-max(arr);
            while(diff>k){
                arr[s.charAt(l)-'A']--;
                l++;
                len=i-l+1;
                diff=len-max(arr);
            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}