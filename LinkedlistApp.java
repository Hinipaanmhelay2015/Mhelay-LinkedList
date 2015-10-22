/*
 *
 * BS-InformatiON System-2
 * Data Structure
 * LinkedListApp.java
 */
/**
 *
 * @author:Melanie Villanueva
 */
public class LinkedListApp {
    public static void main(String[] args){
        Linkedlist aList = new Linkedlist();
        aList.displayList();
        int a;
        for(a=1;a<10;a++){
            tList.insertFirst(a, (a * 3.1416));
        }
        aList.displayList();
        aList.find(0);
        aList.delete(7);
        aList.delete(5);
        aList.delete(1);
        while(!aList.isEmpty()){
            aList.deleteFirst();
        }
        aList.displayList();
    }
}
