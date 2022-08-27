package gfg;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementLevelOrder {
    static void levelOrder1(Node root){   //code from Apni kaksha
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }
                else{
                    q.offer(null);
                }
            }
            else{
                System.out.print(temp.key+" ");
                if(temp.left!=null) {
                    q.offer(temp.left);
                }
                if(temp.right!=null) {
                    q.offer(temp.right);
                }
            }
        }
    }

    static void levelOrder2(Node root){  //GFG without line
       if(root==null){
           return;
       }
       Queue<Node> q= new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
           Node temp=q.poll();
           System.out.print(temp.key+" ");
           if(temp.left!=null) {
               q.offer(temp.left);
           }
           if(temp.right!=null) {
               q.offer(temp.right);
           }
       }
        System.out.println();
    }

    static void levelOrder3(Node root){   //GFG Line by line method-1
        if(root==null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(q.size()>1){
            Node temp=q.poll();
            if(temp==null){
                System.out.println();
                    q.offer(null);
                    continue;
            }
                System.out.print(temp.key+" ");
                if(temp.left!=null) {
                    q.offer(temp.left);
                }
                if(temp.right!=null) {
                    q.offer(temp.right);
                }
        }
        System.out.println();
    }

    static void levelOrder4(Node root) {   //GFG Line by line method-2
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int count = q.size();
            for (int i = 0; i < count; i++) {
                Node temp = q.poll();
                System.out.print(temp.key + " ");
                if (temp.left != null) {
                    q.offer(temp.left);
                }
                if (temp.right != null) {
                    q.offer(temp.right);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);

        levelOrder1(root);
        levelOrder2(root);
        levelOrder3(root);
        levelOrder4(root);

    }
}
