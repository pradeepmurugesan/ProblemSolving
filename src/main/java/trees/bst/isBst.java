package trees.bst;

import commons.tree.Node;
import lombok.Value;

public class isBst {

    public boolean checkBst(Node root) {
        SubtreeResult result = isBst(root);
        return result.isBst;
    }

    @Value
    static class SubtreeResult {
        boolean isBst;
        int largest;
        int smallest;
    }

    private SubtreeResult isBst(Node root) {
        if ( root == null) {
            return new SubtreeResult(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        SubtreeResult leftBst = isBst(root.getLeft());
        SubtreeResult rightBst = isBst(root.getRight());


        boolean isBst =
                leftBst.isBst &&
                rightBst.isBst &&
                root.getData() > leftBst.largest &&
                root.getData() < rightBst.smallest &&
                (root.getLeft() == null || root.getData() > root.getLeft().getData()) &&
                (root.getRight() == null || root.getData() < root.getRight().getData());

        int subtreeSmallest = Math.min(root.getData(), Math.min(root.getLeft() == null ? Integer.MAX_VALUE : root.getLeft().getData(), root.getRight() == null? Integer.MAX_VALUE :root.getRight().getData()));
        int subtreeLargest = Math.max(root.getData(), Math.max(root.getLeft() == null ? Integer.MIN_VALUE :  root.getLeft().getData(), root.getRight() == null? Integer.MIN_VALUE :root.getRight().getData()));
        return new SubtreeResult(isBst, Math.max(subtreeLargest, leftBst.largest), Math.max(subtreeSmallest, rightBst.smallest));
    }
}
