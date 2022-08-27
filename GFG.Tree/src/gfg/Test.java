package gfg;

class Node{
        int key;
        Node left;
        Node right;
        Node(int key){
            this.key=key;
            this.left=null;
            this.right=null;
        }
}

class GFunction{

}
public class Test {
    public static void main(String [] args){
        Node root= new Node(10);
        root.left= new Node(20);
        root.right= new Node(30);
        root.left.left= new Node(40);
    }

}
