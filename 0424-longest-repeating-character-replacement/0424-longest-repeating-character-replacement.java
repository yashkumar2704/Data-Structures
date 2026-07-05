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
        int temp=0;
        int l=0;
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;
            int len=i-l+1;
            temp=max(arr);
            int diff=len-temp;
            while(diff>k){
                arr[s.charAt(l)-'A']--;
                l++;
                temp=max(arr);
            len= i-l+1;
            diff=len-temp;

            }
            ans=Math.max(ans,len);
        }
        return ans;
    }
}