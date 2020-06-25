package commons.tree;

import lombok.Getter;

public class Bst {

    @Getter
    private Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }


    Node insertRec(Node root, int data) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.getData())
            root.setLeft(insertRec(root.getLeft(), data));
        else if (data > root.getData())
            root.setRight(insertRec(root.getRight(), data));

        return root;
    }

    public void inorder()  {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.getLeft());
            inorderRec(root.getRight());
        }
    }
}
