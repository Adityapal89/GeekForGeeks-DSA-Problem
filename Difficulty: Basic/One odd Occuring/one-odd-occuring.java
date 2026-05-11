class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int x : arr) {
            mp.put(x, mp.getOrDefault(x, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()){
            if(entry.getValue()%2 == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}