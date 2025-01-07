package lab_8;

public class Node {
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public void insert_leftchild(Node parent,Node child){
        parent.left = child;
    }
    public void insert_rightchild(Node parent,Node child){
        parent.right = child;
    }
}
