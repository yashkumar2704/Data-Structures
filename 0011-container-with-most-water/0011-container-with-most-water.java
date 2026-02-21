class Solution {
    public int maxArea(int[] h) {
        int r=h.length-1;
        int ans=0;
        int lf=0;
        while(lf<r){
            int he=Math.min(h[lf],h[r]);
            int l=r-lf;
            int area=he*l;
            ans=Math.max(ans,area);
            if(h[lf]>h[r])r--;
            else lf++;
        }
        return ans;
    }
}