class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int ans=0;
        StringBuilder sb=new StringBuilder();
        int j=0;
        int i=0;
        while(i<s.length()){
            sb.append(s.charAt(i++));
             if(sb.length()==k){
                int temp=Integer.parseInt(sb.toString());
                // System.out.println(sb.charAt(0));
                if(temp==0){
                    sb.deleteCharAt(0);
                }else{
                if(num%temp==0)ans++;
                sb.deleteCharAt(0);
                }
             }
        }
        return ans;
    }
}