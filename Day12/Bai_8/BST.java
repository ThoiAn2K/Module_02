class BST {
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

    // Phương thức duyệt cây theo thứ tự pre-order
    public void preOrderTraversal() {
        preOrderTraversalRec(root);
    }

    // Phương thức đệ qui để duyệt cây theo thứ tự pre-order
    private void preOrderTraversalRec(Node root) {
        if (root != null) {
            // Truy cập nút gốc
            System.out.print(root.data + " ");
            // Duyệt các cây con bên trái
            preOrderTraversalRec(root.left);
            // Duyệt các cây con bên phải
            preOrderTraversalRec(root.right);
        }
    }
}
