class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split(" ");
        int i=0;
        int j=str.length-1;
        while(j>i){
            String t=str[i];
            str[i]=str[j];
            str[j]=t;
            i++;j--;
        }
        String k="";
        for(int p=0;p<str.length;p++){
            if(str[p].equals("")){
                continue;
            }
            k+=str[p];
            if(p<str.length-1)k+=" ";
            
        }
        return k;
    }
}