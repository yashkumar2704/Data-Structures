class Solution {
    public int maxArea(int[] h) {
        int r=h.length-1;
        int ans=0;
        int lf=0;
        int max_h=0;
        for(int i=0;i<h.length;i++)max_h=Math.max(h[i],max_h);
        while(lf<r){
            ans=Math.max(ans,Math.min(h[lf],h[r])*(r-lf));
            if(ans>max_h*(r-lf))return ans;
            if(h[lf]>h[r])r--;
            else lf++;
        }
        return ans;
    }
}