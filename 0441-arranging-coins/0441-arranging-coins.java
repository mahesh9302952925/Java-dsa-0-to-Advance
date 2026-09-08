class Solution {
    public int arrangeCoins(int n) {
        int x = 1;
        int c = 0;
        while(true){
            n = n-x;
            c++;
            x++;
            if(c>=n){
                return c;
            }
        }
    }
}