package Tree_Data_Structure;
import java.util.*;
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
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public void levelOrder(){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left != null){
                q.offer(temp.left);
            }
            if(temp.right != null){
                q.offer(temp.right);
            }
        }
    }
    public int findMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);
        if(left > result){
            result = left;
        }
        if(right > result){
            result = right;
        }
        return result;
    }
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.println("Recursive Pre-Order Tree Traversal:-");
        bt.preOrder(bt.root);
        System.out.println();
        System.out.println("Iterative Pre-Order Tree Traversal:-");
        bt.iterativePreOrder();
        System.out.println();
        System.out.println("Recursive In-Order Tree Traversal:-");
        bt.inOrder(bt.root);
        System.out.println();
        System.out.println("Iterative In-Order Tree Traversal:-");
        bt.iterativeInOrder();
        System.out.println();
        System.out.println("Recursive Post-Order Tree Traversal:-");
        bt.postOrder(bt.root);
        System.out.println();
        System.out.println("Level-Order Tree Traversal:-");
        bt.levelOrder();
        System.out.println();
        System.out.println("Maximum value is:-"+bt.findMax(bt.root));
    }
}
