package Linked_List_Data_Structure.Circular_Singly_Linked_List;
public class InsertFirst {
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    private ListNode last;
    private int length;
    public InsertFirst(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data+" ");
            first = first.next;
        }
        System.out.print(first.data+" ");
    }
    public void insertFirst(int data){
        // 10 15 20
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
        }else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }
    public static void main(String[] args) {
        InsertFirst obj = new InsertFirst();
        obj.insertFirst(1);
        obj.insertFirst(10);
        obj.insertFirst(15);
        obj.display();
    }
}
