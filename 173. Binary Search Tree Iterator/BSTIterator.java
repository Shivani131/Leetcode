public class BSTIterator {

    Deque<TreeNode> stack;
    TreeNode curr;

    public BSTIterator(TreeNode root) {
        this.curr = root;
        this.stack = new LinkedList<>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (this.curr == null && stack.isEmpty()) {
            return false;
        }
        return true;
    }

    /** @return the next smallest number */
    public int next() {
        while (this.curr != null) {
            this.stack.offerFirst(this.curr);
            this.curr = this.curr.left;
        }
        TreeNode next = this.stack.pollFirst();
        this.curr = next.right;
        return next.val;
    }
}