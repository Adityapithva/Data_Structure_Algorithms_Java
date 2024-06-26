package Queue_Data_Structure;
public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }
    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while(current != null){
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return data;
    }
    public int first(){
        if(isEmpty()){
            return -1;
        }
        return front.data;
    }
    public int last(){
        if(isEmpty()){
            return -1;
        }
        return rear.data;
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.print();
        q.dequeue();
        System.out.println();
        q.print();
        q.enqueue(40);
        System.out.println();
        q.print();
        System.out.println();
        System.out.println(q.first());
        System.out.println(q.last());
    }
}
