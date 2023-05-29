package linkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
        LinkedList<Integer> linkedList3 = new LinkedList<>();
        linkedList3.add(30);
        linkedList3.push(56);
        linkedList3.add(70);

        linkedList3.show();
        linkedList1.show();
        linkedList2.show();
        Integer poppedData1 = linkedList3.pop();
        if (poppedData1 == null)
            System.out.println("Linked List is Empty");
        else
            System.out.println("The element popped is => " + poppedData1);

        linkedList3.show();
        Integer poppedData2 = linkedList3.popLast();
        if (poppedData2 == null)
            System.out.println("Linked List is Empty");
        else
            System.out.println("The element popped is => " + poppedData2);

        linkedList3.show();
        LinkedList<Integer> linkedList6 = new LinkedList<>();
        linkedList6.push(70);
        linkedList6.push(30);
        linkedList6.push(56);
        linkedList6.push(45);
        linkedList6.push(90);

        linkedList6.show();

        Node<Integer> searchedData = linkedList6.search(30);
        if (searchedData == null) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element Found");
        }
        boolean isInserted = linkedList1.insertAfter(30, 40);
        if (isInserted)
            System.out.println("Element inserted successfully!");
        else
            System.out.println("Element not inserted!");
        linkedList1.show();

    }

}
