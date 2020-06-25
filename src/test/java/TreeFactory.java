import commons.tree.BinaryTree;

public class TreeFactory {

    public static BinaryTree aBinaryTree(int numberOfNodes) {
        BinaryTree tree = new BinaryTree();

        for (int i = 1; i <= numberOfNodes; i++) {
            tree.insert(i);
        }

        return tree;
    }

    public static BinaryTree aBinaryTree(int[] elements) {
        BinaryTree tree = new BinaryTree();

        for (int i: elements) {
            tree.insert(i);
        }

        return tree;
    }
}
