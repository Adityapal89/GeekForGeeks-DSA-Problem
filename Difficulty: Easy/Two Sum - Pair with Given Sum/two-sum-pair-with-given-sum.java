class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;

        // If array has less than 2 elements, no pair is possible
        if (n < 2) return false;

        // Sort the array
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        // Two-pointer approach
        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        // No pair found
        return false;
    }
}