package Tree_Data_Structure;

public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data) {
            this.data = data;
        }
    }
    public BinarySearchTree() {
        this.root = null;
    }
    private TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public void insert(int value) {
        root = insert(root, value);
    }
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public void inOrder() {
        inOrder(root);
    }
    public TreeNode search(TreeNode root,int key){
        if(root == null || root.data == key){
            return root;
        }
        if(key < root.data){
            return search(root.left,key);
        }else{
            return search(root.right,key);
        }
    }
    public TreeNode search(int key){
        return search(root,key);
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.inOrder();
        System.out.println();
        if(null != bst.search(3)){
            System.out.println("Key found...!");
        }else{
            System.out.println("Key not found...!");
        }
        if(null != bst.search(72)){
            System.out.println("Key found...!");
        }else{
            System.out.println("Key not found...!");
        }
    }
}
