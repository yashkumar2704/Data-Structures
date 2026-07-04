// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int ans=0;
//         int l=0;
//         HashMap<Character,Integer>h=new HashMap<>();
//         for(int i=0;i<s.length();i++){
//             h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
//             while(h.get(s.charAt(i))>1){
//                 h.put(s.charAt(l),h.get(s.charAt(l))-1);
//                 if(h.get(s.charAt(l))==0)h.remove(s.charAt(l));
//                 l++;
//             }
//             ans=Math.max(ans,i-l+1);

//         }
//         return ans;
//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, l = 0;
        HashMap<Character, Integer> h = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(h.containsKey(s.charAt(i))) {
                l = Math.max(l, h.get(s.charAt(i)) + 1); // jump l directly
            }
            h.put(s.charAt(i), i);  // store index not frequency
            ans = Math.max(ans, i - l + 1);
        }
        return ans;
    }
}