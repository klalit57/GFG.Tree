package gfg;

public class DiameterBinaryTree {
    static int heightOfBT(Node root){
        if(root==null){
            return 0;
        }
         int lHeight=heightOfBT(root.left);
        int rHeight=heightOfBT(root.right);
        int maxHeight=1+Math.max(lHeight,rHeight);
        return maxHeight;
    }

    static int diameterBinaryTree1(Node root){  //gfg & apni kaksha solution
        if(root==null){
            return 0;
        }
        int lDia= diameterBinaryTree1(root.left);
       int rDia= diameterBinaryTree1(root.right);
       int dia=heightOfBT(root.left)+heightOfBT(root.right)+1;

       return Math.max(dia,Math.max(lDia,rDia));
    }
    static class Pair{
        int height;
        int dia;
        Pair(int height, int dia){
            this.height=height;
            this.dia=dia;
        }
    }

    static Pair diameterBinaryTree2(Node root){
        if(root==null){
            return new Pair(0,0);
        }
        Pair lInfo=diameterBinaryTree2(root.left);
        Pair rInfo=diameterBinaryTree2(root.right);
        int dia=lInfo.height+rInfo.height+1;

        int height=Math.max(lInfo.height,rInfo.height)+1;
        int resDia= Math.max(dia,Math.max(lInfo.dia,rInfo.dia));
        return new Pair(height,resDia);
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
        root.right.right.right.left = new Node(90);

        System.out.println(diameterBinaryTree1(root));

        System.out.println(diameterBinaryTree2(root).dia);
    }
}
