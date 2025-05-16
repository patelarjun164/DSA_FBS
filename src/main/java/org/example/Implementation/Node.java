package org.example.Implementation;

public class Node {
    static double versionCounter = 0.0;

    Account ref;
    Node next;
    double version;

    public Node() {
    }

    public Node(Account ref) {
        this.ref = ref;
        this.next = null;
        System.out.println("In Node Constructor");
        System.out.println("current version " + this.version);
        this.version = Math.round((versionCounter + 0.1) * 10.0) / 10.0;
        versionCounter = this.version;
        System.out.println("After asigned version " + this.version);
    }

    public Account getRef() {
        return ref;
    }

    public void setRef(Account ref) {
        this.ref = ref;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Node{" +
                "ref=" + ref +
                ", version=" + version +
                '}';
    }
}
