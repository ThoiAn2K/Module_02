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

    // Phương thức tìm kiếm một phần tử trong cây BST
    public boolean search(int data) {
        return searchRec(root, data);
    }

    // Phương thức đệ qui để tìm kiếm một phần tử trong cây BST
    private boolean searchRec(Node root, int data) {
        // Nếu cây BST rỗng hoặc phần tử được tìm kiếm khớp với nút gốc
        if (root == null || root.data == data) {
            return (root != null);
        }

        // Nếu phần tử được tìm kiếm nhỏ hơn nút gốc, tiến hành tìm kiếm trong cây con bên trái
        if (data < root.data) {
            return searchRec(root.left, data);
        }

        // Nếu phần tử được tìm kiếm lớn hơn nút gốc, tiến hành tìm kiếm trong cây con bên phải
        return searchRec(root.right, data);
    }
}
