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

        // Tìm kiếm phần tử trong cây BST
        int searchElement = 40;
        boolean found = bst.search(searchElement);

        if (found) {
            System.out.println("Phần tử " + searchElement + " được tìm thấy trong cây BST.");
        } else {
            System.out.println("Phần tử " + searchElement + " không tồn tại trong cây BST.");
        }
    }
}