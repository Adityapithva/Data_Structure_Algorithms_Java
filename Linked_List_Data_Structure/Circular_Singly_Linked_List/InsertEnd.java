package Linked_List_Data_Structure.Circular_Singly_Linked_List;
public class InsertEnd {
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    private ListNode last;
    private int length;
    public InsertEnd(){
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
    public void insertLast(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
            length++;
        }
    }
    public static void main(String[] args) {
        InsertEnd obj = new InsertEnd();
        obj.insertLast(1);
        obj.insertLast(10);
        obj.insertLast(15);
        obj.display();
    }
}
