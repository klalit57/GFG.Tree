package gfg;

public class ImplementInorder {
    public static void inOrderTraverse(Node root){
        if(root==null){
            return;
        }
        inOrderTraverse(root.left);
        System.out.print(root.key+" ");
        inOrderTraverse(root.right);
    }
    public static void main(String [] args){
        Node root= new Node(10);
        root.left= new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        inOrderTraverse(root);
    }
}
