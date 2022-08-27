package gfg;

public class ConvertBinaryTreeToDLL {
    Node prev=null;
    Node convertBTTtoDLL(Node root){
        if(root==null){
            return null;
        }

        Node head=convertBTTtoDLL(root.left);
        if(prev==null){
            head=root;
        }
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        convertBTTtoDLL(root.right);
        return head;
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(70);
        root.right.right = new Node(20);
        root.right.left.right = new Node(8);

        ConvertBinaryTreeToDLL l= new ConvertBinaryTreeToDLL();
        System.out.println(l.convertBTTtoDLL(root).key);

    }
}
