class Solution {
    public boolean closeStrings(String s1, String s2) {
        if(s1.length()!=s2.length())return false;
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            b[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((a[i]!=0 && b[i]!=0 )||( a[i]==0 && b[i]==0))continue;
            else return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        String k1=Arrays.toString(a);
        String k2=Arrays.toString(b);
        if(!k1.equals(k2))return false;
        return true;
    }
}