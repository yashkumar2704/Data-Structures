class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<m.length();i++){
            h.put(m.charAt(i),h.getOrDefault(m.charAt(i),0)+1);
        }
        HashMap<Character,Integer>h1=new HashMap<>();
        for(int i=0;i<r.length();i++){
            h1.put(r.charAt(i),h1.getOrDefault(r.charAt(i),0)+1);
        }
        // System.out.println(h);
        // System.out.println(h1);
        for(int i=0;i<r.length();i++){
            if(!h.containsKey(r.charAt(i)))return false;
            // System.out.println(h1.get(r.charAt(i))+"                 "+ h.get(r.charAt(i)));
            if(h1.get(r.charAt(i))>h.get(r.charAt(i)))return false;
        }
        return true;
    }
}