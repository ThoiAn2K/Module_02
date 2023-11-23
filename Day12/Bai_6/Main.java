public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        // Chèn các phần tử vào cây BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Duyệt cây theo thứ tự post order
        System.out.println("Post Order Traversal:");
        bst.postOrderTraversal();
    }
}
