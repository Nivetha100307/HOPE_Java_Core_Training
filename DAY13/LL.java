package DAY13;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void insertAtPosition(int pos, int data) {
        if (pos == 0) {
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtStart() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtStart(5);
        list.insertAtEnd(74);
        list.insertAtEnd(100);
        list.insertAtPosition(1, 10);

        list.display(); // 5->10->74->100->null

        list.deleteAtEnd();
        list.display(); // 5->10->74->null

        list.deleteAtStart();
        list.display(); // 10->74->null
    }
}