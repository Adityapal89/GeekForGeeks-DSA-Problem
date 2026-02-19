/*
class TrieNode {

    private final int ALPHABET_SIZE = 26;
    public TrieNode[] children;
    public boolean isLeaf;

    public TrieNode() {
        children = new TrieNode[ALPHABET_SIZE];
        isLeaf = false;
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            children[i] = null;
        }
    }
}
*/

class Solution {
    public static int wordCount(TrieNode root) {
        if (root == null) return 0;
        return dfs(root);
    }
    private static int dfs(TrieNode node) {
        int count = 0;
        if (node.isLeaf) {
            count++;
        }
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                count += dfs(node.children[i]);
            }
        }
        return count;
    }
}