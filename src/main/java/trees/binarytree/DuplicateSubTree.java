package trees.binarytree;

import commons.tree.Node;

import java.util.HashMap;


public class DuplicateSubTree {
    private final HashMap<String, Integer> pathCounter;

    public DuplicateSubTree() {
        pathCounter = new HashMap<>();
    }

    public boolean hasDuplicateSubtree(Node root) {
        checkDuplicate(root, "");
        return pathCounter.entrySet()
                .stream()
                .anyMatch(entry -> entry.getValue() > 1);
    }

    private String checkDuplicate(Node root, String path) {
        if (root == null) {
            return path;
        }

        String leftPath = checkDuplicate(root.getLeft(), path);
        String rightPath = checkDuplicate(root.getRight(), path);

        String rootPath = leftPath + root.getData() + rightPath ;

        if(rootPath.length() >= 2) {
            if (pathCounter.containsKey(rootPath)) {
                int count = pathCounter.get(rootPath);
                pathCounter.put(rootPath, count + 1);
            } else {
                pathCounter.put(rootPath, 1);
            }
        }
        return rootPath;
    }
}
