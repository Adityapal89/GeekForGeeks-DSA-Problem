class Solution {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();
    public ArrayList<Double> getMedian(int[] arr) {
        ArrayList<Double> ar = new ArrayList<>();
        // code here
        // ArrayList<Double> ar = new ArrayList<>();
        // for(int i=0; i<arr.length; i++){
        //     PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        //     for(int j =0; j<= i; j++){
        //         pq.add((double)arr[j]);
        //     }
        //     if(pq.size()%2 == 1){
        //         double el = pq.size()/2;
        //         for (int k = 0; k < el; k++) {
        //             pq.remove();
        //         }
        //         ar.add(pq.poll());
        //     } else {
        //         int el = pq.size()/2 - 1;
        //         for (int k = 0; k < el; k++) {
        //             pq.remove();
        //         }
        //         double a = pq.poll();
        //         double b = pq.poll();
        //         ar.add((a+b)/2);
        //     }
        // }
        // return ar;
        
        
        // for(int num : arr){
        //     if(left.size() == 0){
        //         left.add(num);
        //         ar.add((double) num);
        //     }
        //     else{
        //         if(num < left.peek()){
        //           left.add(num);
        //           arr.add(left.peek());
        //         } 
        //         else {
        //             right.add(num);
        //             double med = (left.peek() + right.peek())/2.0;
        //             arr.add(med);
        //         }
        //     }
            
        // }
        for(int ele : arr){
            addNum(ele);
            ar.add(findMedian());
        }
        return ar;
        
    }
    public void addNum(int num) {
        if(left.size() == 0) left.add(num);
        else{
            if(num<left.peek()) left.add(num);
            else right.add(num);
        }

        if(left.size() == right.size()+2){
            right.add(left.remove());
        }
        if(right.size() == left.size()+2){
            left.add(right.remove());
        }
    }

    public double findMedian() {
        if(left.size() == right.size()+1){
           return left.peek(); 
        } else if(right.size() == left.size()+1){
            return right.peek();
        } else{
           return ((left.peek()+right.peek())/2.0);
        }
    }
}