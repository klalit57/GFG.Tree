 package gfg;

 import java.util.LinkedList;
 import java.util.Queue;

 public class PrintLeftMostNode{
     int maxLevel=0;   //a var is created which will track the which level is printed
     public void printLeftMostNode(Node root,int level){ //gfg recursive method-1
        if(root==null){   //if node is null return
            return;
        }
        if(maxLevel<level){   //level=currlevel, maxLevel= level upto which printed
            System.out.print(root.key+" ");
            maxLevel=level;  //once printed maxLevel will increase by one
        }
        printLeftMostNode(root.left,level+1);  //traverse the postOrder
        printLeftMostNode(root.right,level+1);
     }

     public void printLeftMostNode2(Node root){  //gfg iterative solution
         if(root==null){   //if root is null means no tree is present
             return;
         }
         Queue<Node> q= new LinkedList<>();  //a queue is created to store a level of tree
         q.offer(root);
         while(!q.isEmpty()){
             int count=q.size();  //this is the number of nodes in a level
             for(int i=0;i<count;i++){   //we are traveling for whole level
                 Node curr= q.poll();
                 if(i==0) {
                     System.out.print(curr.key+" ");  //first popped item is the left most so printed
                 }
                 if(curr.left!=null){
                     q.offer(curr.left);  //we are adding left and right item of the next level
                 }
                 if(curr.right!=null){
                     q.offer(curr.right);
                 }
             }
         }
     }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(50);
        root.right = new Node(60);
        //root.left.left = new Node(40);
       // root.left.right = new Node(50);
        root.right.left = new Node(70);
        root.right.right = new Node(20);
        root.right.left.right = new Node(8);
        PrintLeftMostNode p = new PrintLeftMostNode();

        p.printLeftMostNode(root,1);
    }
}
