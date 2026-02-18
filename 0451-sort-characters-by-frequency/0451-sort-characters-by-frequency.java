class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>h=new HashMap<>();
        for(int i=0;i<s.length();i++)h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(h.entrySet());


list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        String k="";
        for(Map.Entry<Character,Integer> e:list){
            for(int i=0;i<e.getValue();i++){
                k+=e.getKey();
            }
        }

    return k;
    }
}