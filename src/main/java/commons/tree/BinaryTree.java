package commons.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int key)
    {
        if ( root == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Do level order traversal until we find
        // an empty place.
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();

            if (temp.getLeft() == null) {
                temp.setLeft(new Node(key));
                break;
            } else
                q.add(temp.getLeft());

            if (temp.getRight() == null) {
                temp.setRight(new Node(key));
                break;
            } else
                q.add(temp.getRight());
        }
    }

    public void inorder()  {
        inorderRec(root);
        System.out.println("");
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            System.out.print(root.getData() + " ");
            inorderRec(root.getRight());
        }
    }
}
