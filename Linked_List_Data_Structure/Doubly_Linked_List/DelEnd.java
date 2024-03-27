package Linked_List_Data_Structure.Doubly_Linked_List;
public class DelEnd {
    private ListNode head;
    private ListNode tail;
    private int length;
    public class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data = data;
        }
    }
    public DelEnd(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public int length(){
        return length;
    }
    public void displayForward(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.previous;
        }
        System.out.print("null");
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }
    public ListNode deleteLast(){
        if(isEmpty()){
            return null;
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        return temp;
    }
    public static void main(String[] args) {
        DelEnd obj = new DelEnd();
        obj.insertLast(1);
        obj.insertLast(10);
        obj.insertLast(15);
        obj.displayForward();
        obj.deleteLast();
        System.out.println();
        obj.displayForward();
    }
}
