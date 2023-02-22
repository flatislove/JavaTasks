/**
 * Given two binary trees original and cloned and given a reference to a node target in the original tree.
 * The cloned tree is a copy of the original tree.
 * Return a reference to the same node in the cloned tree.
 * Note that you are not allowed to change any of the two trees or the target node and the answer must be
 * a reference to a node in the cloned tree.
 */
public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree {
    public static void main(String[] args) {
        TreeNode original = new TreeNode(1);
        original.left = new TreeNode(2);
        original.right = new TreeNode(3);
        original.left.left = new TreeNode(4);
        original.left.right = new TreeNode(5);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(7);

        TreeNode cloned = new TreeNode(1);
        cloned.left = new TreeNode(2);
        cloned.right = new TreeNode(3);
        cloned.left.left = new TreeNode(4);
        cloned.left.right = new TreeNode(5);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(7);

        TreeNode target = original.left.right;

        FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree find = new FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree();
        System.out.println(find.getTargetCopy(original, cloned, target));
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null || original == target)
            return cloned;
        TreeNode res = getTargetCopy(original.left, cloned.left, target);
        if (res != null)
            return res;
        return getTargetCopy(original.right, cloned.right, target);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
