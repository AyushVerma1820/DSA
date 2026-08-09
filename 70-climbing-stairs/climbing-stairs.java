class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a2 = 1;  
        int a1 = 2;  
        for (int i = 3; i <= n; i++) {
            int b = a1 + a2;
            a2 = a1;
            a1 = b;
        }
        return a1;
    }
}