class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if (arr.length < 2) return -1;
        int max1, max2;
        if (arr[0] > arr[1]){
            max1 = arr[0];
            max2 = arr[1];
        } else if(arr[0] < arr[1]){
            max2 = arr[0];
            max1 = arr[1];
        } else {
            max1 = arr[0];
            max2 = Integer.MIN_VALUE;
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            } else if(arr[i] < max1 && arr[i] > max2){
                max2 = arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE) return -1;
        return max2;
    }
}