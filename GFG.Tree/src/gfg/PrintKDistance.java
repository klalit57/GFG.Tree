package gfg;

public class PrintKDistance {
    static void printKDistance1(Node root, int k,int curr){  //MyCode
        if(root==null){
            return;
        }
        if(k==curr){
            System.out.println(root.key+" ");
            return;
        }
        printKDistance1(root.left,k,curr+1);
        printKDistance1(root.right,k,curr+1);
    }

    static void printKDistance2(Node root, int k){  //GFG Code
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.key+" ");
        }
        else {
            printKDistance2(root.left, k-1);
            printKDistance2(root.right, k-1);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);

        printKDistance1(root,2,0);
        printKDistance2(root,2);
    }
}
