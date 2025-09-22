public class insertAtBeginning {
    Node insertAtBeginning(Node head , int data){
        Node newNode = newNode(data);
        newNode.next = head;
        return newNode;
    }

    private Node newNode(int data) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newNode'");
    }
}
