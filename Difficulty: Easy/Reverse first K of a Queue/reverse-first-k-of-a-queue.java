class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if (k > q.size() || k <= 0) {
            return q;
        }
        reverseK(q, k);
        int n = q.size();
        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }
        return q;
    }
    
    private void reverseK(Queue<Integer> q, int k) {
        if (k == 0) return;
        int x = q.remove();
        reverseK(q, k - 1);
        q.add(x);
    }
}