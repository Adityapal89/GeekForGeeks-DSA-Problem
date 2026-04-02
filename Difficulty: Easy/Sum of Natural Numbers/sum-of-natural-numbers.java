// User function Template for Java

class Solution {
    static int sumOfNaturals(int n) {
        // code here
        if(n == 0) return 0;
        int val = 0;
        for(int i=1; i<=n; i++){
            val = val + i;
        }
        return val;
    }
};