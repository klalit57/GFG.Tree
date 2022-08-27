package gfg;

public class BalancedBinaryTree {
    static boolean isBalancedTree1(Node root){  //gfg Naive Method
        if(root==null){
            return true;
        }
        int lHeight=heightOfBinaryTree(root.left);
        int rHeight=heightOfBinaryTree(root.right);


        //3 condition
        //1. left & right tree diff not 2
        //2.left subtree should be balanced
        //3.right subtree should be balanced

        return Math.abs(lHeight-rHeight)<=1 && isBalancedTree1(root.left) && isBalancedTree1(root.right);
    }
    static int heightOfBinaryTree(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(heightOfBinaryTree(root.left),heightOfBinaryTree(root.right))+1;
    }

    static int isBalancedTree2(Node root){  //gfg efficient
        if(root==null){
            return 0;
        }
        int lHeight=isBalancedTree2(root.left);
        if(lHeight==-1){
            return -1;
        }
        int rHeight=isBalancedTree2(root.right);
        if(rHeight==-1){
            return -1;
        }
        if(Math.abs(lHeight-rHeight)>1){
            return -1;
        }
        else{
            return Math.max(lHeight,rHeight)+1;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        //root.right.left = new Node(70);
        //root.right.right = new Node(20);
        //root.right.left.right = new Node(8);


        System.out.println(isBalancedTree1(root));
        System.out.println(isBalancedTree2(root));

    }
}
