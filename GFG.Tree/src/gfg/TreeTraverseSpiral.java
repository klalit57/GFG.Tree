package gfg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraverseSpiral {

    void spiralTraverse1(Node root){    //gfg Method-1
        Queue<Node> q= new LinkedList<>();   //q created to store nodes
        Stack<Integer> s= new Stack<>();   //s creacted to store integer in reverse order
        boolean reverse=false;          // at first no reverse traverse so simply run BFS after which change reverse=true
        q.offer(root);   //root stored in q
        while(!q.isEmpty()){
            int count=q.size();  //number of nodes at particular level
            for(int i=0;i<count;i++) {  //travel each node
                Node temp = q.poll();    //
                if(reverse) {         //when it is true we store values in stack
                    s.push(temp.key);  //it will print after empting the queue
                }else {
                    System.out.print(temp.key + " ");  //Normal BFS
                }
                if (temp.left!= null) {   //add in q
                        q.offer(temp.left);
                    }
                if (temp.right != null) { //add in q
                        q.offer(temp.right);
                    }
                }
            if(reverse) {  //once it is true we will pop s and print
                while(!s.isEmpty()) {
                    System.out.print(s.pop()+" ");
                }
            }
            reverse=!reverse;  //after each level it is reversed
            }
        System.out.println();
        }


    void spiralTraverse2(Node root){
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        boolean reverse=false;
        s1.push(root);
        while(!s1.isEmpty() || !s2.isEmpty()){
            int count1=s1.size();
            int count2=s2.size();
            if(reverse){
                for (int i = 0; i < count2; i++) {
                    Node curr=s2.pop();
                    System.out.print(curr.key+" ");
                    if(curr.right!=null){
                        s1.push(curr.right);
                    }
                    if(curr.left!=null){
                        s1.push(curr.left);
                    }
                }
            }
            else{
                for (int i = 0; i < count1; i++) {
                    Node curr=s1.pop();
                    System.out.print(curr.key+" ");
                    if(curr.left!=null){
                        s2.push(curr.left);
                    }
                    if(curr.right!=null){
                        s2.push(curr.right);
                    }
                }
            }
            reverse=!reverse;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(70);
        root.right.right.right = new Node(80);

        TreeTraverseSpiral o= new TreeTraverseSpiral();
        o.spiralTraverse1(root);
        TreeTraverseSpiral o1= new TreeTraverseSpiral();
        o1.spiralTraverse2(root);
    }
}
