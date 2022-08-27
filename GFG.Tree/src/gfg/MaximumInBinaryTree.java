package gfg;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumInBinaryTree {
    static int maximumInBinaryTree1(Node root){   //gfg method-1 recursive
        if(root==null){
            return Integer.MIN_VALUE;
        }

        return Math.max(root.key,Math.max(maximumInBinaryTree1(root.left),maximumInBinaryTree1(root.right)));
    }

    static int maximumInBinaryTree2(Node root){    //gfg method-2 iterative
        int max=Integer.MIN_VALUE;
        if(root==null){
            return max;
        }
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
         Node temp=q.poll();
         max=Math.max(max,temp.key);
         if(temp.left!=null){
             q.offer(temp.left);
         }
         if(temp.right!=null){
                q.offer(temp.right);
         }
        }
        return max;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);

        System.out.println(maximumInBinaryTree1(root));
        System.out.println(maximumInBinaryTree2(root));

    }
}
