package Linked_List_Data_Structure.Doubly_Linked_List;
public class PrintElements {
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
    public PrintElements(){
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
    public static void main(String[] args) {
        
    }
}
