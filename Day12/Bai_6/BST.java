public class BST {
    Node root;

    public BST() {
        root = null;
    }

    // Phương thức chèn một nút mới vào cây BST
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Phương thức đệ qui để chèn một nút mới vào cây BST
    private Node insertRec(Node root, int data) {
        // Nếu cây BST rỗng, tạo một nút mới và trả về nó
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Nếu không, tiến hành chèn nút vào cây
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Phương thức duyệt cây theo thứ tự post order
    public void postOrderTraversal() {
        postOrderTraversalRec(root);
    }

    // Phương thức đệ qui để duyệt cây theo thứ tự post order
    private void postOrderTraversalRec(Node root) {
        if (root != null) {
            // Duyệt các cây con bên trái
            postOrderTraversalRec(root.left);
            // Duyệt các cây con bên phải
            postOrderTraversalRec(root.right);
            // Truy cập nút gốc
            System.out.print(root.data + " ");
        }
    }
}
