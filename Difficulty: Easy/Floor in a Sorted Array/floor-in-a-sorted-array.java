class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= x){
                ans = i;
            } else{
                break;
            }
        }
        return ans;
    }
}
