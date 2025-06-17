class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTree5 {
    int findMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        int maxLeft = findMax(root.left);
        int maxRight = findMax(root.right);

        return Math.max(root.data, Math.max(maxLeft, maxRight));
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.right.right = new Node(40);
        int max = tree.findMax(root);
        System.out.println("Maximum value in the tree: " + max);
    }
}
