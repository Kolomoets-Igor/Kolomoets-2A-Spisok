public class MyList {
    private Node head;
    private int size;

    public MyList() {
        head = null;
        size = 0;
    }

    public void add(String value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
        size++;
    }

    public String get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        int i = 0;
        Node currentNode = head;
        while (i < index) {
            currentNode = currentNode.getNextNode();
            i++;
        }
        return currentNode.getValue();
    }

    public int getSize() {
        return size;
    }

    private class Node {
        private String value;
        private Node nextNode;

        public Node(String value) {
            this.value = value;
            nextNode = null;
        }
        
        public String getValue() {
            return value;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }
    }
}