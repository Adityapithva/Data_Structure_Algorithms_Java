package Linked_List_Data_Structure.Circular_Singly_Linked_List;
public class DelFirst {
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    private ListNode last;
    private int length;
    public DelFirst(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void createCSLL(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;
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
    public ListNode deleteFirst(){
        if(isEmpty()){
            System.out.println("Empty list...!");
        }
        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        }else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }
    public static void main(String[] args) {
        DelFirst obj = new DelFirst();
        obj.createCSLL();
        obj.display();
        obj.deleteFirst();
        obj.display();
    }
}
