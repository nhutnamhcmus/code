package vn.edu.hcmus.fit.sv18120061.lab02;

/**
 * vn.edu.hcmus.fit.sv18120061.lab02
 *
 * @created by NhutNam - StudentID : 18120061
 * @Date 4/23/2020 - 2:47 PM
 * @Description: Viết chương trình xây dựng Linked List (danh sách liên kết). Sau đó, thực hiện đảo ngược danh sách liên kết này.
 * @Example:
 * nhập vào 20 -> 40 -> 60 -> 80, danh sách đảo ngược 80 -> 60 -> 40 -> 20
 */
public class Exercise22 {
    private static class Node {
        private int value; // The value of the node
        private Node next; // Point to the next node
        /**
         * Default Constructor
         */
        Node(){

        }

        /**
         * Parameter Constructor
         *
         * @param value Value to be put in the node
         */
        Node(int value){
            this.value = value;
            this.next = null;
        }

        /**
         * Parameter Constructor
         *
         * @param value Value to be put in the node
         * @param next Point to the next node
         */
        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


    public static class SinglyLinkedList {
        private Node head; // Head refer to the front of the list
        private int size; // size of SinglyLinkedList

        /**
         * Default Constructor
         *
         * init SinglyLinkedList
         */
        public SinglyLinkedList(){
            this.head = new Node(0);
            this.size = 0;
        }

        /**
         * Parameter Constructor
         *
         * Init SinglyLinkedList with specified head node and size
         *
         * @param head the head node of list
         * @param size the size of list
         */
        public SinglyLinkedList(Node head, int size) {
            this.head = head;
            this.size = size;
        }

        public boolean isEmpty(){
            return this.size == 0;
        }

        public int getSize(){
            return this.size;
        }

        private void checkBounds(int position, int low, int high) {
            if (position > high || position < low) {
                throw new IndexOutOfBoundsException(position + "");
            }
        }

        public void insertNth(int data, int position) {
            checkBounds(position, 0, size);
            Node cur = head;
            for (int i = 0; i < position; ++i) {
                cur = cur.next;
            }
            Node node = new Node(data);
            node.next = cur.next;
            cur.next = node;
            size++;
        }

        public void insertHead(int x) {
            insertNth(x, 0);
        }

        public void deleteNth(int position) {
            checkBounds(position, 0, size - 1);
            Node cur = head;
            for (int i = 0; i < position; ++i) {
                cur = cur.next;
            }

            //Node destroy = cur.next;
            cur.next = cur.next.next;
            //destroy = null; // clear to let GC do its work

            size--;
        }

        @Override
        public String toString() {
            if (size == 0) {
                return "";
            }
            StringBuilder builder = new StringBuilder();
            Node cur = head.next;
            while (cur != null) {
                builder.append(cur.value).append("->");
                cur = cur.next;
            }
            return builder.replace(builder.length() - 2, builder.length(), "").toString();
        }

        public void deleteHead() {
            deleteNth(0);
        }

        private void reverse(Node node){
            if (node == null){
                return;
            }
            reverse(node.next);
            if (node.value != 0){
                System.out.printf("%d ",node.value);
            }
        }
        public void displayReverse(){
            reverse(this.head);
        }
    }

    /**
     * Solution exercise 22 function
     *
     */
    public static void Function22(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertHead(20);
        singlyLinkedList.insertHead(40);
        singlyLinkedList.insertHead(60);
        singlyLinkedList.insertHead(80);
        System.out.println("Linked list: ");
        System.out.println(singlyLinkedList.toString());
        System.out.println("Reverse linked list: ");
        singlyLinkedList.displayReverse();
    }
}
