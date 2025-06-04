package org.example.Tree;


public class MainApp {
    Node root;

    public static void main(String[] args) {
        Node n1 = new Node("Arjun");
        MainApp app = new MainApp();
        app.insert(n1);
    }

    private void insert(Node n1) {
        Node current = root;
        if (root==null){
            root = n1;
        } else {
            if(n1.data.compareTo(current.data)<0){
                current = current.left;
            } else {
                current = current.right;
            }
        }


    }
}
