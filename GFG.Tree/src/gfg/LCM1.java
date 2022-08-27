package gfg;

import java.util.Stack;

public class LCM1 {
    public static int lcm1(Node root, int x, int y){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int curr=0;
        boolean res1=found(root,x, s1);
        if(res1==false){
            return -1;
        }
        boolean res2=found(root,y, s2);
        if(res2){
            while(s1.peek()==s2.peek()){
                curr=s1.pop();
                s2.pop();
            }
        }
        return curr;
    }
    static boolean found(Node root, int a, Stack<Integer> s){
        if(root==null){
            return false;
        }
        if(root.key==a){
            s.push(root.key);
            return true;
        }
        boolean res1=found(root.left,a,s);
        if(res1){
            s.push(root.key);
            return true;
        }
        boolean res2=found(root.right,a,s);
        if(res2){
            s.push(root.key);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        root.right.left.left = new Node(60);
        root.right.right.left = new Node(70);
        root.right.right.right = new Node(80);
        //root.right.right.right.left = new Node(90);

        System.out.println(lcm1(root,60,70));

    }
}
