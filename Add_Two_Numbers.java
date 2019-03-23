import java.util.Map;
import java.util.Scanner;
/*
 * 链表的创建，头结点，而后申请一个节点，next指向这个节点，头结点的next是链表的首部
 * P！=null用来判断是否到链表尾
 */
class ListNode {
   int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

public class Add_Two_Numbers {
       public static void main(String args[])
       {
    	 int n1,n2;
    	 Scanner input = new Scanner(System.in);
    	 n1=input.nextInt();
    	 n2=input.nextInt();
    	 ListNode l1 = new ListNode(0);
    	 ListNode l2 = new ListNode(0);
    	 ListNode temp1 =l1;
    	 ListNode temp2 =l2;
    	 for(int i=0;i<n1;i++)
    	 {
    		temp1.next = new ListNode(input.nextInt());
    		temp1=temp1.next;
    	 }
    	 for(int i=0;i<n2;i++)
    	 {
    		temp2.next = new ListNode(input.nextInt());
    		temp2=temp2.next;
    	 }
    	 temp1.next=null;
    	 temp2.next=null;
    	 ListNode head =fun(l1.next,l2.next);
    	 ListNode temp = head;
    	 while(temp!=null)
    	 {
    		 System.out.print(temp.val);
    		 temp=temp.next;
    	 } 	 
       }      
       public static ListNode fun(ListNode l1,ListNode l2)
       {
    	  ListNode head = new ListNode(0);
    	  ListNode temp = head;
    	  ListNode p = l1;
    	  ListNode q = l2;
    	  int sum =0;
    	  int carry =0;
    	  while(p!=null || q!=null)
    	  {
    		  int a = (p!=null)?p.val:0;
    		  int b = (q!=null)?q.val:0;
    		  sum = carry+a+b;
    		  temp.next=new ListNode(sum%10);
    		  temp=temp.next;
    		  carry = sum/10;
    		  if(p!=null) p=p.next;
    		  if(q!=null) q=q.next;	  
    	  }
    	  if(carry !=0)
    	  {
    		  temp.next =new ListNode(1);
    		  temp=temp.next;		 
    	  }
    	  temp.next=null;
    	  return head.next;   	  
       }
}










