/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    static int s;
    public boolean isHeap(Node tree) {
        s = size(tree);
        return isMaxHeap(tree) && isCBT(tree,1);
    }
    
    private int size(Node tree){
        if(tree == null) return 0;
        return 1+size(tree.left)+size(tree.right);
    }
    
    private boolean isCBT(Node tree, int idx){
        if(tree == null) return true;
        if(idx>s) return false;
        return isCBT(tree.left, 2*idx) && isCBT(tree.right, 2*idx+1);
    }
    
    private boolean isMaxHeap(Node tree){
        if(tree == null) return true;
        int leftVal = (tree.left != null) ? tree.left.data : Integer.MIN_VALUE;
        int rightVal = (tree.right != null) ? tree.right.data : Integer.MIN_VALUE;
        if(tree.data <= leftVal || tree.data <= rightVal) return false;
        return isMaxHeap(tree.left) && isMaxHeap(tree.right);
    }
}