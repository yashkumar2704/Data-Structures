class Solution {
    public List<Integer> partitionLabels(String s) {
        int nums[]=new int[26];
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'a']=i;
        }
        int end=0;
        // while(end<s.length()){
        //     int t=end;
        //     for(int i=t;i<=end;i++){
        //         if(nums[s.charAt(i)-'a']>end){
        //             end=nums[s.charAt(i)-'a'];
        //         }
        //     }
        //     end++;
        //     l.add(end-t);
        // }
        int st=0;
        for(int i=st;i<s.length();i++){
            end=Math.max(end,nums[s.charAt(i)-'a']);
            if(i==end){
                l.add(end-st+1);
                st=i+1;
            }
        }
        return l;
    }
}