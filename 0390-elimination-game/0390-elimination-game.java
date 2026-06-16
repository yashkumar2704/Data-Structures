class Solution {
    public int lastRemaining(int n) {
        if(n==1)return 1;
        int h=1;
        int s=1;
        int r=n;
        int k=1;
        while(r>1){
            if(k%2!=0 || r%2!=0){
                h=h+s;
            }
            s*=2;
            r/=2;
            k++;
        }
        return h;
    }
}