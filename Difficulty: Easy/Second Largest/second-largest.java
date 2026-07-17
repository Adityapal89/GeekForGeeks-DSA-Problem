class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int secondLargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > secondLargest && arr[i] < max){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}