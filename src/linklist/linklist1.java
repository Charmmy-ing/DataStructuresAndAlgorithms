//package linklist;
//
//import java.util.LinkedList;
//
//public class linklist1 {
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next=new ListNode(2);
//        head.next.next=new ListNode(3);
//        ListNode tmp=head;
//        tmp=tmp.next;
//        insertList(head,4);
//        printList(head);
//
//    }
//    public static void insertList(ListNode head,int data) {
//        ListNode cur=head;
//        while(cur.next!=null){
//            cur=cur.next;
//        }
//        cur.next=new ListNode(data);
//    }
//    public static void printList(ListNode head) {
//        ListNode tmp=head;
//        while(tmp!=null){
//            System.out.println(tmp.val);
//            tmp=tmp.next;
//        }
//    }
// static class ListNode {
//     int val;
//    private ListNode next;
//    public ListNode(int val) {
//        this.val = val;
//        this.next = null;
//    }
// }
//}
////class MyLinkedList {
////    class LinkedList{
////        int val;
////        LinkedList next;
////        public LinkedList(int val) {
////            this.val=val;
////            this.next=null;
////        }
////    }
////    int size;
////    LinkedList head;
////    public MyLinkedList(){
////        this.size=0;
////        this.head=new LinkedList(0);
////    }
////    public int get(int index) {
////        //如果index非法，返回-1
////        if (index < 0 || index >= size) {
////            return -1;
////        }
////        LinkedList cur = head;
////        //第0个节点是虚拟头节点，所以查找第 index+1 个节点
////        for (int i = 0; i <= index; i++) {
////            cur = cur.next;
////        }
////        return cur.val;
////    }
////
////
////    public void addAtHead(int val) {
////        LinkedList cur=head;
////        LinkedList newhead=new LinkedList(val);
////        newhead.next=cur.next;
////        cur.next=newhead;
////    }
////
////    public void addAtTail(int val) {
////        LinkedList cur=head;
////        LinkedList addhead=new LinkedList(val);
////        while(cur.next!=null){
////            cur=cur.next;
////        }
////        cur.next=addhead;
////    }
////
////    public void addAtIndex(int index, int val) {
////        LinkedList cur=head;
////        while(cur.next!=null){
////            cur=cur.next;
////            size++;
////        }
////        cur=head;
////        if(index>size){
////            return;
////        }
////        if(index>0){
////            for(int i=0;i<index;i++){
////                cur=cur.next;
////            }
////            LinkedList newathead=new LinkedList(val);
////            newathead.next=cur.next;
////            cur.next=newathead;
////            size++;
////        }
////    }
////
////    public void deleteAtIndex(int index) {
////        LinkedList cur=head;
////        if(index<size&&index>=0){
////            for(int i=0;i<index;i++){
////                cur=cur.next;
////            }
////            cur.next=cur.next.next;
////            size--;
////        }else{
////            return;
////        }
////    }
////}