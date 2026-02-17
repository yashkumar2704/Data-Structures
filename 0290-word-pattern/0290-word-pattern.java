class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String>h1=new HashMap<>();
        HashMap<String,Character>h2=new HashMap<>();
        String str[]=s.split(" ");
        if(str.length!=p.length())return false;
        for(int i=0;i<str.length;i++){
            if(h1.containsKey(p.charAt(i))){
            if(!h1.get(p.charAt(i)).equals(str[i]))return false;
            }
            else h1.put(p.charAt(i),str[i]);
        
            if(h2.containsKey(str[i])){
                if(h2.get(str[i])!=p.charAt(i))return false;
            }
            else h2.put(str[i],p.charAt(i));
        }
        return true;
    }
}