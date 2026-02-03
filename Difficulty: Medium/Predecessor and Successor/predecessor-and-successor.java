class Solution {

    Node prev, pre, suc;

    public ArrayList<Node> findPreSuc(Node root, int key) {
        prev = null;
        pre = null;
        suc = null;

        ArrayList<Node> ans = new ArrayList<>();
        inorder(root, key);

        ans.add(pre);
        ans.add(suc);
        return ans;
    }

    private void inorder(Node root, int key) {
        if (root == null) return;

        inorder(root.left, key);

        // If current node is greater than key and successor not set
        if (root.data > key && suc == null) {
            suc = root;
        }

        // If current node is less than key, update predecessor
        if (root.data < key) {
            pre = root;
        }

        prev = root;

        inorder(root.right, key);
    }
}
