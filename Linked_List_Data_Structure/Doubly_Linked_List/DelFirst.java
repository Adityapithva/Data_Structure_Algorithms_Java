package Linked_List_Data_Structure.Doubly_Linked_List;
public class DelFirst {
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
    public DelFirst(){
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
    public void InsertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public ListNode deleteFirst(){
        if(isEmpty()){
            System.out.println("Empty list..!");
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }
    public static void main(String[] args){
        DelFirst obj = new DelFirst();
        obj.InsertFirst(1);
        // obj.InsertFirst(10);
        // obj.InsertFirst(15);
        obj.displayBackward();
        obj.deleteFirst();
        System.out.println();
        obj.displayBackward();
        
    }
}
