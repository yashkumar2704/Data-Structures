class Solution {
    public int maxArea(int[] h) {
        int r=h.length-1;
        int ans=0;
        int lf=0;
        while(lf<r){
            ans=Math.max(ans,Math.min(h[lf],h[r])*(r-lf));
            if(h[lf]>h[r])r--;
            else lf++;
        }
        return ans;
    }
}