package bfs.tree;

public class MainTree {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Symmetric tree
        TreeNode symmetricRoot = new TreeNode(1,
                new TreeNode(2, new TreeNode(3), new TreeNode(4)),
                new TreeNode(2, new TreeNode(4), new TreeNode(3))
        );

        // Asymmetric tree
        TreeNode asymmetricRoot = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(2, null, new TreeNode(3))
        );

        System.out.println("Symmetric Tree: " + solution.isSymmetric(symmetricRoot)); // true
        System.out.println("Asymmetric Tree: " + solution.isSymmetric(asymmetricRoot)); // false

    }
}
