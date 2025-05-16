package org.example.Implementation;

public class Account {
    int id;
    String name;
    int balance;

    public Account(int id) {
        this.id = id;
    }

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    private void madeChangesToLL(Account newAccount, MainApp app) {
        Node newNode = new Node(newAccount);
//        System.out.println(newNode.getRef());
//        System.out.println(newNode.getVersion());
        app.insert(newNode);
        app.lastNode = newNode;
    }

    public int getId() {
        return id;
    }

    public Account setId(int id, MainApp app) {
//        this.id = id;
        Account newAccount = new Account(id, this.name, this.balance);
        madeChangesToLL(newAccount, app);
        return newAccount;
    }

    public String getName() {
        return name;
    }

    public Account setName(String name, MainApp app) {
//        this.name = name;
        Account newAccount = new Account(this.id, name, this.balance);
        madeChangesToLL(newAccount, app);
        return newAccount;
    }


    public int getBalance() {
        return balance;
    }

    public Account setBalance(int balance, MainApp app) {
//        this.balance = balance;
        Account newAccount = new Account(this.id, this.name, balance);
        madeChangesToLL(newAccount, app);
        return newAccount;
    }

//    private void madeChangesToLL(Account newAccount, MainApp app) {
//        Node newNode = new Node(newAccount);
//        System.out.println(newNode.getRef());
//        System.out.println(newNode.getVersion());
//        app.insert(newNode);
//    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
