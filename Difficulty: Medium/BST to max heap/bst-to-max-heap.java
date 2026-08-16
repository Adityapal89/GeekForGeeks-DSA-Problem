class Solution {
    void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    void convert(Node root, ArrayList<Integer> arr, int[] index) {
        if (root == null) return;
        convert(root.left, arr, index);
        convert(root.right, arr, index);
        root.data = arr.get(index[0]);
        index[0]++;
    }

    void convertToMaxHeapUtil(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int[] index = {0};
        convert(root, arr, index);
    }
}