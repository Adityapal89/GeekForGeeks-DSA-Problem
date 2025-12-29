class Solution {
    int floorSqrt(int n) {
        // code here
        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid * mid == n) {
                return mid;   // perfect square
            }
            else if (mid * mid < n) {
                ans = mid;    // possible answer
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}