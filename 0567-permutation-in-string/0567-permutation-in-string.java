class Solution {
    public boolean check(int arr[],int arr1[]){
        for(int i=0;i<26;i++){
            if(arr[i]!=arr1[i])return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int arr[]=new int[26];
        int arr1[]=new int[26];
        int l=0;
        
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            arr1[s2.charAt(i)-'a']++;
            
            if(i-l+1==s1.length()){
                if(check(arr,arr1))return true;
                arr1[s2.charAt(l)-'a']--;
                l++;
            }
        }
        return false;
    }
}