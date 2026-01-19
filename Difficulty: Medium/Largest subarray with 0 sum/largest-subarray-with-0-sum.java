class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer,Integer> mp = new HashMap<>();
        int maxLan = 0; int prefSum = 0;
        mp.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if (mp.containsKey(prefSum)){
                maxLan = Math.max(maxLan, i - mp.get(prefSum));
            } else {
                mp.put(prefSum,i);
            }
        }
        return maxLan;
    }
}