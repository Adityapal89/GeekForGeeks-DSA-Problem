class Solution {
    int single(int[] arr) {
        // code here
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = arr[i]^result;
        }
        
        return result;
    }
}