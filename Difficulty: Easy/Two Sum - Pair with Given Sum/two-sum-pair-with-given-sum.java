class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        
        int i = 0;
        int j = arr.length-1;
        Arrays.sort(arr);
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target) return true;
            else if(sum < target) i++;
            else{
                j--;
            }
        }
        return false;
        
        // int sum = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j = 0; j<arr.length; j++){
        //         sum = arr[i] + arr[j];
        //         if(sum == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}