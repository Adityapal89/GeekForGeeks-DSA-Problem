/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public void inorder(Node root,ArrayList<Integer> st){
        if(root == null) return;
        inorder(root.left,st);
        st.add(root.data);
        inorder(root.right,st);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> st = new ArrayList<>();
        inorder(root,st);
        return st;
    }
}