package gfg;

public class ChildrenSumProperty {

    static boolean childrenSumProperty(Node root){
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum=sum+root.left.key;
        }
        if(root.right!=null){
            sum=sum+ root.right.key;
        }
        return root.key==sum && childrenSumProperty(root.left) && childrenSumProperty(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(12);
        root.left.left = new Node(3);
        root.left.right = new Node(5 );
        //root.right.left = new Node(70);
        //root.right.right = new Node(20);
        //root.right.left.right = new Node(8);

        System.out.println(childrenSumProperty(root));

    }
}
