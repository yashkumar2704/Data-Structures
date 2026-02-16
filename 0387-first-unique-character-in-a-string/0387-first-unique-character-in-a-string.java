class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character,Integer>h=new HashMap<>();
        int nums[]=new int[26];
        for(int i=0;i<s.length();i++){
            // h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
            nums[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(nums[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
}