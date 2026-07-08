class Solution {
    public boolean check(int arr[],int nums[]){
        for(int i=0;i<26;i++){
            if(arr[i]!=nums[i])return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int arr[]=new int[26];
        int nums[]=new int[26];
        int l=0;
        List<Integer>li= new ArrayList<>();
        for(int i=0;i<p.length();i++){
            arr[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'a']++;
            if(i-l+1==p.length()){
                if(check(arr,nums))li.add(l);
                nums[s.charAt(l)-'a']--;
                l++;
            }
        }
        return li;
    }
}