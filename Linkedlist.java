/*
 * BS-Information System-2
 * Data Structure
 * Linkedlist.java
 */

/**
 *
 * @author:Melanie Villanueva
 */

public class Linkedlist {
    private ListNode first;
        
    public Linkedlist(){
       first = null;
    }
  
    public void insertFirst(int a, double b){
        ListNode newListNode = new ListNode(a, b);
        newListNode.next = first;
        first = newListNode;
    }
    
    public void deleteFirst(){
        System.out.print("delete the item ");
        first.displayData();
        first = first.next;
    }
    
    public boolean isEmpty(){
        return (first == null);