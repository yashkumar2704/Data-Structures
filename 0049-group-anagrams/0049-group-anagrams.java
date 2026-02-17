class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
        HashMap<String,List<String>>h=new HashMap<>();
        for(int i=0;i<str.length;i++){
            int arr[]=new int[26];
            for(int j=0;j<str[i].length();j++){
                arr[str[i].charAt(j)-'a']++;
            }
            String s=Arrays.toString(arr);
            
            if(h.containsKey(s)){
                h.get(s).add(str[i]);
            }
            else {
                List<String>l=new ArrayList<>();
                l.add(str[i]);
                h.put(s,l);
            }
            
        }
        return new ArrayList<>(h.values());

    }
}