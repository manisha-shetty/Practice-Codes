//Switch pair of nodes in linklist 1 2 3 4 shud become 2 1 4 3 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
int info;
Node next;

Node(int in,Node nxt){
   
    info=in;
    next=nxt;
}
}


class SwitchNodes
{
    public static void main (String[] args) throws java.lang.Exception
    {
       
        Node head=new Node(1,null);
head.next=new Node(2,(new Node(3,new Node(4,new Node(5,null)))));
Node first=head;
int count=0;

    System.out.println("new list");
    head=first.next;
    while(first.next!=null&& first!=null){

        Node second=first.next;
        first.next=second.next;
        second.next=first;
        //point the new switched second in pair to first of next to be new pair
	second=first.next;
if(second.next ==null) break; // second is the last element at odd position so no one to switch with
	if(second!=null){
        first.next=second.next;
        first=second;
	}
       

    }
    first=head;
    while (first!=null){
            System.out.println(first.info); first=first.next;

    }
}

}

