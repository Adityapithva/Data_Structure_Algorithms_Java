package Linked_List_Data_Structure.Doubly_Linked_List;
public class InsertEnd {
    public class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        private ListNode(int data){
            this.data = data;
        }
    }
    private ListNode head;
    private ListNode tail;
    private int length;
    public InsertEnd(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty() {
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
    public static void main(String[] args) {
        InsertEnd obj = new InsertEnd();
        obj.insertLast(1);
        obj.insertLast(10);
        obj.insertLast(15);
        obj.displayForward();
        System.out.println();
        obj.displayBackward();
    }
}
