package linkedlist;

/**
 * Created by ksama on 12/27/15.
 */
public class LinkedList {
  Node head;
  Node tail;

  public LinkedList(){
    head = null;
    tail = null;
  }

  public void add(int value){
    Node n = new Node(value);
    if(head == null) {
      head = tail =n;
    }else{
      tail.next = n;
      tail = n;
    }
  }

  public static int getLinkedListLength(Node n){
     int length = 0;
    while(n!=null){
      length++;
      n= n.next;
    }
    return length;
  }

  public static void printLinkedList(Node n){
     while(n!=null){
       System.out.print(n.value+"->");
       n= n.next;
     }
     System.out.println("NULL");
  }
}
