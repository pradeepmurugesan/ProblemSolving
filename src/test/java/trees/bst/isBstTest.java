package trees.bst;

import commons.tree.BinaryTree;
import commons.tree.Bst;
import factory.TreeFactory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class isBstTest {

    private isBst isBst;

    @Before
    public void setUp() {
        isBst = new isBst();
    }

    @Test
    public void shouldReturnTrue() {
        Bst testTree = TreeFactory.aBST(10);
        Assert.assertTrue(isBst.checkBst(testTree.getRoot()));
    }

    @Test
    public void shouldReturnFalse() {
        BinaryTree testTree = TreeFactory.aBinaryTree(10);
        Assert.assertFalse(isBst.checkBst(testTree.getRoot()));
    }
}