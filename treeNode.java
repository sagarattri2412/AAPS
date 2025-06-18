import java.util.*;
public class treeNode{
    int root;
    treeNode left;
    treeNode right;
    public treeNode(int root){
        this.root=root;
        this.left=null;
        this.right=null;
    }
     static void inorder(treeNode root){
             if(root==null) return;

             inorder(root.left);
             System.out.print(root.root+" ");
             inorder(root.right);
    }
     static void preorder(treeNode root){
             if(root==null) return;
             System.out.print(root.root+" ");
             preorder(root.left);
             preorder(root.right);
    }
     static void postorder(treeNode root){
             if(root==null) return;

             postorder(root.left);
             postorder(root.right);
             System.out.print(root.root+" ");
    }
    static void levelOrderTraversal(treeNode root){
        Queue<treeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            treeNode t=q.remove();
            System.out.print(t.root+" ");
            if(t.left!=null) q.add(t.left);
            if(t.right!=null) q.add(t.right);
        }
    }
    static void levelOrderTraversal_t(treeNode root){
        Queue<treeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size(); 
        for (int i = 0; i < levelSize; i++) {
            treeNode t = q.remove();
            System.out.print(t.root + " ");

            if (t.left != null) q.add(t.left);
            if (t.right != null) q.add(t.right);
        }
         System.out.println();
    }
}
    public static void main(String []args){
        treeNode root = new treeNode(1);
        treeNode temp1 = new treeNode(2);
        treeNode temp2 = new treeNode(3);
        treeNode temp3 = new treeNode(4);
        treeNode temp4 = new treeNode(5);
        root.left = temp1;
        root.right = temp2;
        temp1.left = temp3;
        temp2.right = temp4;
        System.out.println("inOrder traversal");
        inorder(root); 
        System.out.println();
        System.out.println("preOrder traversal");
        preorder(root); 
        System.out.println();
        System.out.println("postOrder traversal");
        postorder(root); 
        System.out.println();
        System.out.println("levelOrder traversal");
        levelOrderTraversal(root);
        System.out.println();
        System.out.println("levelOrder traversal_t");
        levelOrderTraversal_t(root);
    }
}