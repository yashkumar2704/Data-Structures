class Solution {
    public int countGoodSubstrings(String s) {
        int j=0;
        if(s.length()<3)return 0;
        
        for(int i=2;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i-1)!=s.charAt(i-2)){
                if(s.charAt(i)!=s.charAt(i-2))j++;
            }
        }
        return j;
    }
}