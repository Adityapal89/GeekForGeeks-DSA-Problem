class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)-> {
                if(mp.get(a).equals(mp.get(b))){
                    return b-a;
                }
                return mp.get(b) - mp.get(a);
            }
        );
        for(int ele : arr){
            mp.put(ele, mp.getOrDefault(ele,0)+1);
        }
        
        pq.addAll(mp.keySet());
        for(int i=0; i<k; i++){
            al.add(pq.poll());
        }
        
        return al;
        
    }
}
