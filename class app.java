public class APP{
    public static void main(String[] args){
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.insertLast(30);
        list.insertLast(35);
        list.insertLast(40);
        list.displayForward();
        list.displayBackward();
        list.deleteFirst();
        list.deleteLast();
        list.deleteKey(15);
        list.displayForward();
        list.insertAfter(10, 90);
        list.insertAfter(30, 95);
        list.displayForward();
    }
}
