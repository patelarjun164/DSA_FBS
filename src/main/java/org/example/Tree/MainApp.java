package org.example.Tree;


public class MainApp {
    static Node root;

    public static void main(String[] args) {
//        Node n4 = new Node("Dhanashri");
//        Node n2 = new Node("Bob");
//        Node n1 = new Node("Arjun");
//        Node n3 = new Node("Capcy");
//        Node n6 = new Node("Sakshudi");
//        Node n5 = new Node("Jiya Pagal");
//        Node n7 = new Node("Yuvi");
        MainApp app = new MainApp();
        app.insert("Dhoni");
        app.insert("Bob");
        app.insert("Arjun");
        app.insert("Capcy");
        app.insert("Sakshi");
        app.insert("Jiya");
        app.insert("Yuvi");
        app.inOrder();
    }
    private void inOrder() {
        inOrderTree(root);
    }

    private void inOrderTree(Node root) {
        if(root!=null){
            inOrderTree(root.left);
            System.out.println(root.data);
            inOrderTree(root.right);
        }
    }

//    private void insert(Node n1, Node curRoot, Node leaf) {
//
//        if (root==null){
//            root = n1;
//        } else {
//            if(isFirstTime || leaf==null){
//                leaf=n1;
//                isFirstTime = false;
//                return;
//            }
//            if(n1.data.compareTo(curRoot.data)<0){
//                insert(n1, curRoot, curRoot.left);
//            } else {
//                insert(n1, curRoot, curRoot.right);
//            }
//        }
//    }

    private void insert(String value) {
        root = insertValue(root, value);
    }

    private Node insertValue(Node root, String value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value.compareTo(root.data) > 0) {
            //ahi alphabetically nano chhe, so check karvanu ke aeno left exists kare chhe?!
            //jo left null chhe to left nej navoNode set kri devano
            root.right = insertValue(root.right, value);
        } else {
            if (value.compareTo(root.data) < 0) {
                root.left = insertValue(root.left, value);
            }
        }
        return root;
    }
}
