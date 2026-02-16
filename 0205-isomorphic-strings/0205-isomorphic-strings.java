class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>h=new HashMap<>();
        HashMap<Character,Character>h1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                if(h.get(s.charAt(i))!=t.charAt(i))return false;
                
            }
            else h.put(s.charAt(i),t.charAt(i));
            if(h1.containsKey(t.charAt(i))){
                if(h1.get(t.charAt(i))!=s.charAt(i))return false;
                
            }
            else 
            h1.put(t.charAt(i),s.charAt(i));
            
        }
        return true;
    }
}