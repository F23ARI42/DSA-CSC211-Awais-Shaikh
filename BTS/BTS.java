package BTS;
public class BTS {
    node root;
    public void insert(int value) {
        if (root == null) {
            root = new node(value);
            return;
        }
        node cur = root;
        while (true) {
            if (value < cur.data) {
                if (cur.left == null) {
                    cur.left = new node(value);
                    return;
                }
                cur = cur.left;
            } else if (value > cur.data) {
                if (cur.right == null) {
                    cur.right = new node(value);
                    return;
                }
                cur = cur.right;
            } else {
                // Value already exists, no duplicates allowed in BST
                return;
            }
        }
    }

    // Inorder traversal: left -> root -> right
    public void inorder(node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BTS bts = new BTS();
        bts.insert(50);
        bts.insert(30);
        bts.insert(20);
        bts.insert(40);
        bts.insert(70);
        bts.insert(60);
        bts.insert(80);
        System.out.println("Inorder traversal of the BST:");
        bts.inorder(bts.root);
    }
}
