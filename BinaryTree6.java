class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTree6 {
    Node root;

    // 1. Count non-leaf nodes
    int countNonLeaf(Node node) {
        if (node == null || (node.left == null && node.right == null)) {
            return 0;
        }
        return 1 + countNonLeaf(node.left) + countNonLeaf(node.right);
    }

    // 2. Search for an element
    boolean search(Node node, int key) {
        if (node == null)
            return false;
        if (node.data == key)
            return true;
        return search(node.left, key) || search(node.right, key);
    }

    // 3. Mirror the tree
    void mirror(Node node) {
        if (node == null)
            return;
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }

    // Inorder traversal
    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {
        BinaryTree6 tree = new BinaryTree6();

        // Create sample tree
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        // Count non-leaf nodes
        int nonLeafCount = tree.countNonLeaf(tree.root);
        System.out.println("Non-leaf nodes: " + nonLeafCount);

        // Search for an element
        int searchKey = 50;
        if (tree.search(tree.root, searchKey))
            System.out.println(searchKey + " found in the tree");
        else
            System.out.println(searchKey + " not found in the tree");

        // Inorder before mirror
        System.out.print("Inorder before mirror: ");
        tree.inorder(tree.root);
        System.out.println();

        // Mirror the tree
        tree.mirror(tree.root);

        // Inorder after mirror
        System.out.print("Inorder after mirror: ");
        tree.inorder(tree.root);
        System.out.println();
    }
}
