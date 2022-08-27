package gfg;

public class ConstructBTFromInOrderAndPreOrder {
    int preIndex=0;
    public Node constructTree(int [] in, int [] pre, int is, int ie){
        if(is>ie){
            return null;
        }
        Node root= new Node(pre[preIndex]);
        preIndex++;
        int inIndex=0;
        for(int i=is;i<=ie;i++){
            if(in[i]==root.key){
                inIndex=i;
                break;
            }
        }
        root.left=constructTree(in,pre,is,inIndex-1);
        root.right=constructTree(in,pre,inIndex+1,ie);
        return root;
    }
    public static void main(String[] args) {
        int [] in={40,20,50,10,30,80,70,90};
        int [] pre={10,20,40,50,30,70,80,90};

        ConstructBTFromInOrderAndPreOrder o= new ConstructBTFromInOrderAndPreOrder();

        Node root=o.constructTree(in,pre,0,pre.length-1);
        System.out.println(root.key);
    }
}
