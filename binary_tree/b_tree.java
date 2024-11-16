package binary_tree;
import java.util.LinkedList;
import java.util.Queue;
public class b_tree {
    Node root;
    b_tree(int data) {
        root=new Node(data);
    }
    public void inorder(Node root) {// left root right
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public void preorder(Node root) {// root left right
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root) {// left rigth root
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public void levelOrder(Node  root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node cur = queue.remove();
            System.out.print(" "+ cur.data);
            if(cur.left!=null){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }
        }
    }
    public static void main(String[] args) {
        b_tree n1=new b_tree(1);
        System.out.println(n1.root.data);
        Node n2=new Node(2);
        Node n3=new Node(3);
        n1.root.insert_leftchild(n1.root,n2);
        n1.root.insert_rightchild(n1.root,n3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        n2.insert_leftchild(n2,n4);
        n2.insert_rightchild(n2,n5);
        Node n6=new Node(6);
        n3.insert_rightchild(n3,n6);
        System.out.println("inorder teversal");
        n1.inorder(n1.root);
        System.out.println("preorder teversal");
        n1.preorder(n1.root);
        System.out.println("postorder teversal");
        n1.postorder(n1.root);
        System.out.println("level order teversal");
        n1.levelOrder(n1.root);
    }
}