class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        
        TreeSet<Integer> set = new TreeSet<>();
        
        // Add elements of first array
        for (int x : arr1) {
            set.add(x);
        }
        
        // Add elements of second array
        for (int x : arr2) {
            set.add(x);
        }
        
        // Convert set to ArrayList and return
        return new ArrayList<>(set);
    }
}
