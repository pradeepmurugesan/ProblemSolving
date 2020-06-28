package trees.binarytree;

import commons.tree.BinaryTree;
import factory.TreeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuplicateSubTreeTest {

    DuplicateSubTree duplicateSubTree;

    @Before
    public void setUp() {
        duplicateSubTree = new DuplicateSubTree();
    }
    @Test
    public void shouldReturnFalse() {
        BinaryTree tree = TreeFactory.aBinaryTree(9);
        Assert.assertFalse(duplicateSubTree.hasDuplicateSubtree(tree.getRoot()));
    }

    @Test
    public void shouldReturnTrue() {
        BinaryTree tree = TreeFactory.aBinaryTree(new int[] {1, 2, 3, 4, 5, 4, 5, 6, 7, 6, 7, 6, 7, 6, 7});
        Assert.assertTrue(duplicateSubTree.hasDuplicateSubtree(tree.getRoot()));
    }

}