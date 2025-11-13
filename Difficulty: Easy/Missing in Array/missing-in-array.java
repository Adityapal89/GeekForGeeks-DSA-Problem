class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int[] freq = new int[n+2];
        for(int i = 0; i < n; i++){
            if(arr[i] <= n+1){
                freq[arr[i]]++;
            }
        }
        for (int i = 1; i <= n+1; i++) {
            if (freq[i] == 0){
                return i;
            }
        }
        return 0;
        
    }
}