package gfg;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBinaryTree {
    static int maxWidth1(Node root){  //MyCode iterative  & gfg iterative
        if(root==null){
            return 0;
        }
        int count=0;
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            count=Math.max(count,q.size());
            int size=q.size();
            for(int i=0;i<size;i++) {
                Node temp = q.poll();
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
        }
        return count;
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

        System.out.println(maxWidth1(root));

    }
}
