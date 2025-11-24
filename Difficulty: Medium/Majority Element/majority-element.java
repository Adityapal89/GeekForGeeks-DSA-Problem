class Solution {
    int majorityElement(int arr[]) {
        int candidate = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}