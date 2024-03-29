package PriorityQueue_And_BinaryHeap.PriorityQueue_;
public class MaxPriorityQueue {
    private Integer[] heap;
    private int n;
    public MaxPriorityQueue(int capacity){
        heap = new Integer[capacity + 1];
        n = 0;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public int size(){
        return n;
    }
    public void insert(int x){
        if(n == heap.length  - 1){
            // resize(2*heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }
    private void swim(int k){
        while(k > 1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k = k/2;
        }
    }
    public static void main(String[] args) {
        MaxPriorityQueue pq = new MaxPriorityQueue(3);
        System.out.println(pq.size());
        System.out.println(pq.isEmpty());
    }
}
