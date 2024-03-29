package Tree_Data_Structure;
import java.util.Stack;
public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public void createBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
    }
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void iterativePreOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!= null){
                stack.push(temp.right);
            }
            if(temp.left!= null){
                stack.push(temp.left);
            }
        }
    }
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void iterativeInOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.createBinaryTree();
        System.out.println("Recursive Pre-Order Tree Traversal:-");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println("Iterative Pre-Order Tree Traversal:-");
        bst.iterativePreOrder();
        System.out.println();
        System.out.println("Recursive In-Order Tree Traversal:-");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println("Iterative In-Order Tree Traversal:-");
        bst.iterativeInOrder();
    }
}
