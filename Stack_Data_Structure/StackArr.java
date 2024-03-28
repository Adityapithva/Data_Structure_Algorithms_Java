package Stack_Data_Structure;
public class StackArr {
    private int top;
    private int[] stack;
    private int length;
    public boolean isEmpty() {
        return length == 0;
    }
    public boolean isFull(){
        return size() == top+1;
    }
    public int size(){
        return stack.length;
    }
    public StackArr(int capacity){
        stack = new int[capacity];
        top = -1;
    }
    public StackArr(){
        this(10);
    }
    public void push(int value){
        if(isFull()){
            System.out.println("Stack overflow..!");
        }
        top++;
        stack[top] = value;
        length++;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow..!");
        }
        int result = stack[top];
        top--;
        length--;
        return result;
    }
    public void display(){
        for(int i=0;i<=top; i++){
            System.out.print(stack[i]+" ");
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack underflow...!");
        }
        return stack[top];
    }
    public static void main(String[] args) {
        StackArr obj = new StackArr(5);
        obj.push(10);
        obj.push(15);
        obj.push(20);
        obj.push(25);
        obj.pop();
        obj.display();
        System.out.println(obj.peek());
    }
}
