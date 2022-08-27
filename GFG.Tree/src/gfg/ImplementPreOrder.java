package gfg;

public class ImplementPreOrder {
    public static void preOrderTraverse(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.key+" ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public static void main(String [] args){
        Node root= new Node(10);
        root.left= new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        preOrderTraverse(root);
    }
}
