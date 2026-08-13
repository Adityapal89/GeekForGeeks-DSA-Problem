class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                int distA = a[0] * a[0] + a[1] * a[1];
                int distB = b[0] * b[0] + b[1] * b[1];

                return Integer.compare(distB, distA);
            }
        );
        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            int[] point = pq.poll();

            ArrayList<Integer> temp = new ArrayList<>();

            temp.add(point[0]);
            temp.add(point[1]);

            ans.add(temp);
        }
        return ans;
        
    }
}