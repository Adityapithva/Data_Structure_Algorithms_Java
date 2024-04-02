package Linked_List_Data_Structure.Doubly_Linked_List;
public class InsertPos {
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data = data;
        }
    }
    private ListNode head;
    private ListNode tail;
    private int length;
    public InsertPos(){
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
            System.out.println("List is empty...!");
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
        if(head == null){
            return;
        }
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.previous;
        }
        System.out.print("null");
    }
    public void insertPos(int data,int position){
        ListNode newNode = new ListNode(data);
        if(position == 1){
            if(isEmpty()){
                head = newNode;
                tail = newNode;
            }else{
                newNode.next = head;
                head.previous = newNode;
                head = newNode;
            }
        }else{
            ListNode current = head;
            int count = 1;
            while(count < position - 1){
                current = current.next;
                count++;
            }
            if(position == length + 1){
                current.next = newNode;
                newNode.previous = current;
                tail = newNode;
            }else{
                ListNode nextNode = current.next;
                current.next = newNode;
                newNode.previous = current;
                newNode.next = nextNode;
                nextNode.previous = newNode;
            }
        }
        length++;
    }
    public static void main(String[] args) {
        InsertPos obj = new InsertPos();
        obj.insertPos(1,1);
        obj.insertPos(2,2);
        obj.insertPos(3,3);
        obj.displayForward();
        System.out.println();
        obj.displayBackward();
    }
}
