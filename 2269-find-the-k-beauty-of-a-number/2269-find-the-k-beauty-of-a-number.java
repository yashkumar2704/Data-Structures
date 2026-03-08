class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int ans=0;
        
        int j=0;
        int i=0;
        while(i<s.length()){
            i++;
            if(i-j==k){
                int temp=Integer.parseInt(s.substring(j,i));
                if(temp!=0){
                    if(num%temp==0)ans++;
                }
                j++;
            }
        }
        return ans;
    }
}