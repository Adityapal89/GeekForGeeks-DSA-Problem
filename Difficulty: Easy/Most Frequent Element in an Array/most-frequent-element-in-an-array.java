class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxFreq = 0;
        int ans = Integer.MIN_VALUE;

        for (int x : arr) {

            int freq = map.getOrDefault(x, 0) + 1;
            map.put(x, freq);

            // Decide answer immediately
            if (freq > maxFreq || (freq == maxFreq && x > ans)) {
                maxFreq = freq;
                ans = x;
            }
        }
        return ans;
    }
}