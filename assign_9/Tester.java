package assign_9;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        
        System.out.println("=====================================");
    	System.out.println("\t \t MENU");
    	System.out.println("===================================== \n");
        System.out.println("Binary Search Tree Operations:");
        System.out.println("1. Insert data");
        System.out.println("2. Inorder Traversal");
        System.out.println("3. Preorder Traversal");
        System.out.println("4. Postorder Traversal");
        System.out.println("5. Exit \n");
        System.out.println("===================================== \n");

        int choice;
        do {
        
            System.out.print("\n Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = scanner.nextInt();
                    bst.insert(data);
                    break;
                case 2:
                    System.out.println("Inorder Traversal:");
                    bst.inorderTraversal(bst.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Preorder Traversal:");
                    bst.preorderTraversal(bst.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Postorder Traversal:");
                    bst.postorderTraversal(bst.root);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
