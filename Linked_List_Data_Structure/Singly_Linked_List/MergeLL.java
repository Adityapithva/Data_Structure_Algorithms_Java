package Linked_List_Data_Structure.Singly_Linked_List;
public class MergeLL {
    public static class ListNode{
        private int data;
        private ListNode next;
        private ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head;
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }
    public static ListNode merge(ListNode a,ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(a!= null && b!= null){
            if(a.data <= b.data){
                tail.next = a;
                a = a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a == null){
            tail.next = b;
        }else{
            tail.next = a;
        }
        return dummy.next;
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main(String[] args) {
        MergeLL obj1 = new MergeLL();
        obj1.insertLast(1);
        obj1.insertLast(4);
        obj1.insertLast(8);
        obj1.display();
        MergeLL obj2 = new MergeLL();
        obj2.insertLast(3);
        obj2.insertLast(5);
        obj2.insertLast(8);
        obj2.insertLast(9);
        obj2.insertLast(14);
        obj2.insertLast(18);
        System.out.println();
        obj2.display();
        MergeLL obj3 = new MergeLL();
        obj3.head = merge(obj1.head, obj2.head);
        System.out.println();
        obj3.display();
    }
}
