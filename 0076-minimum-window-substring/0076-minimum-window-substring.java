class Solution {
    public boolean same(int arr[],int arr1[]){
        for(int i=0;i<126;i++){
            if(arr[i]>arr1[i])return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length()>s.length())return "";
        
        int l=0;
        int len=Integer.MAX_VALUE;
        int arr[]=new int[126];
        int arr1[]=new int[126];
        
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i)]++;
        }
        int i=0;
        int o=0;int b=0;
        for(i=0;i<s.length();i++){
            
            arr1[s.charAt(i)]++;
            
            while(same(arr,arr1)){
            if(i-l+1<len){
                len=i-l+1;
                o=i;
                b=l;
            }
            arr1[s.charAt(l)]--;
            l++;
            }
        }
        if(len==Integer.MAX_VALUE)return "";
        String f="";
        for(int j=b;j<=o;j++){
            f+=s.charAt(j);
        }
        return f;
    }
}