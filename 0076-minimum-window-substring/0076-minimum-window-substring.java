class Solution {
    public boolean check(int arr[],int nums[]){
        for(int i=0;i<126;i++){
            if(nums[i] <arr[i])return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        int arr[]=new int[126];
        int nums[]=new int [126];
        int l=0;
        int max=Integer.MAX_VALUE;
        int f=0;int h=0;
        for(int i=0;i<t.length();i++)arr[t.charAt(i)]++;

        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)]++;
            while(check(arr,nums)){
                
                if(i-l+1<max){
                    max=i-l+1;
                f=l;
                h=i;
                }
                nums[s.charAt(l)]--;
                l++;
            }

        }
        String str="";
        if(max==Integer.MAX_VALUE)return "";
        for(int i=f;i<=h;i++){
            str+=s.charAt(i);
        }
        return str;
    }
}