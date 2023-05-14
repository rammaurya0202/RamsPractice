package Trees;
import java.util.*;
public class HeightOfATree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
         this.data =data;
         this.left =null;
         this.right=null;
        }

    }
//Height of a tree
    public static int height(Node root){
        if(root ==null){
            return 0;
        }

        int lh = height(root.left);
        int rh =height(root.right);
        return Math.max(lh,rh)+1;
    }
  // counts of a nodes of tree
    public static int count(Node root){
        if(root==null){
            return 0;
        }
       int  lc = count(root.left);
        int rc = count(root.right);
        return (lc+rc) +1 ;
    }
  // sum of nodes
    public static int SumOfNode(Node root){
        if(root==null){
            return 0;
        }
        int ls = SumOfNode(root.left);
        int rs = SumOfNode(root.right);
        return ls + rs +root.data;
    }

    //Diameter of a tree
    public static int Diameter(Node root){  // O(n^2)
        if(root==null){
            return 0;
        }
        int ld = Diameter(root.left);
        int rd = Diameter(root.right);
        int lh = height(root.left);
        int rh =height(root.right);
        int selfDiameter =lh + rh +1;
        return Math.max(selfDiameter ,Math.max(ld,rd));
    }

static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht){
            this.diam=diam;
            this.ht =ht;
        }
}

    public static Info Diameter1(Node root){

        if(root==null){
            return new Info(0,0);
        }
        Info leftInfo = Diameter1(root.left);
        Info rightInfo= Diameter1(root.right);
        int diam =Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht,rightInfo.ht +1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

      return new Info(diam,ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(SumOfNode(root));
        System.out.println(Diameter(root));
        System.out.println(Diameter1(root).diam);
    }
}
