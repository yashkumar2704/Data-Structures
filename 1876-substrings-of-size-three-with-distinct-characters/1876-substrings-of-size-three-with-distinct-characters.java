class Solution {
    public int countGoodSubstrings(String s) {
        int i=0;int j=0;
        int ans=0;
        while(j<s.length()){
            if(j-i+1==3){
                if(s.charAt(i)-'a'!=s.charAt(i+1)-'a' && s.charAt(i+1)-'a' != s.charAt(j)-'a'&& s.charAt(j)-'a' !=s.charAt(i)-'a' ){
                    ans++;
                    
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}