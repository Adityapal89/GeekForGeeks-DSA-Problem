class Solution {
    static int sumOfDigits(int n) {
        if(n>= 0 && n<= 9) return n;
        return sumOfDigits(n%10) + sumOfDigits(n/10);
    }
}
