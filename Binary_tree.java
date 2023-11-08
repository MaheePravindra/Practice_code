import java.util.*;
public class Binary_tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BT{
        static int ind = -1;
        public static Node buildTree(int[] nodes){
            ind++;
            if(nodes[ind]==-1){
                return null;
            }
            Node newnode = new Node(nodes[ind]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }
    }

    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    /*public static void levelorder(Node root){
        if(root==null){
            return;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } 
                else {
                    q.add(null);
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }*/

    public static int  countNode(Node root){
        if(root == null){
            return 0;
        }
        int ll = countNode(root.left);
        int rr = countNode(root.right);
        return ll + rr +1;
    }

    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BT tree = new BT();
        Node root = tree.buildTree(nodes); 
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        //levelorder(root);
        int elements = countNode(root);
        System.out.println(elements);
    }
}
