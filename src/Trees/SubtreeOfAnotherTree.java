package Trees;

public class SubtreeOfAnotherTree {
    static class Node {
        int data;
      Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left =null;
            this.right =null;
        }
    }

    public static boolean isSubtree(Node root,Node subRoot){
        if(root.data== subRoot.data){
           if(isIdentical(root,subRoot)){
               return true;
           }
        }
        boolean leftAns =isSubtree(root.left,suboRot);
        boolen rightAns = 
    }

    public static void main(String[] args) {
        HeightOfATree.Node root = new HeightOfATree.Node(1);
        root.left = new HeightOfATree.Node(2);
        root.right = new HeightOfATree.Node(3);
        root.left.left = new HeightOfATree.Node(4);
        root.left.right = new HeightOfATree.Node(5);
        root.right.left = new HeightOfATree.Node(6);
        root.right.right = new HeightOfATree.Node(7);

       Node subRoot = new Node(2);
       subRoot.left = new Node(4);
       subRoot.right =new Node(5);
    }
}
