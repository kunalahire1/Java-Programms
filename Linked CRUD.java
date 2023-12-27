import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Node head=null;
	    Node temp=null;
	    Node temp2=null;
	    int ch=0;
	    do{
	    System.out.println("1)LinkedList Creation 2)Display 3)Reverse Print 4)Insert At Specific Pos 5) Delete At Spec");
	    ch=sc.nextInt();
	    switch(ch)
	    {
	     case 1:
	          int size=sc.nextInt();
	          for(int i=0;i<size;i++)
	            {
	          int element=sc.nextInt();
	          Node nn=new Node(element);
	          if(head==null)
	          {
	            head=nn;
	            temp=head;
	          }
	          else
	          {
	            temp.next=nn;
	            temp=temp.next;
	          }
	          }
	          temp2=head;
	         System.out.println("Node created");
	         break;
	   case 2:
	       
	         while(temp2!=null)
	        {
	        System.out.print(temp2.data+"-->"+"");
	        temp2=temp2.next;
	       
	        }
	          System.out.println();
	    break;
	  case 3:
	      temp2=head;
	      ArrayList<Integer>al=new ArrayList<>();
	      while(temp2!=null)
	      {
	          al.add(temp2.data);
	          temp2=temp2.next;
	      }
	      System.out.println("Revere is");
	      for(int i=al.size()-1;i>=0;i--)
	      {
	          System.out.print(al.get(i)+" ");
	      }
	       System.out.println();
	      
	   break;
	 case 4:
	     temp2=head;
	     Node prev=null;
	     Node nextNode=null;
	   System.out.println("Enter position");
	     int pos=sc.nextInt();
	     System.out.println("Enter element");
	     int element=sc.nextInt();
	     Node nnn=new Node(element);
	     if(pos==0)
	     {
	         nnn.next=head;
	         head.next=nnn;
	     }
	     else
	     {
	         for(int i=0;i<pos-1;i++)
	         {
	             
	             prev=temp2;
	             nextNode=prev.next;
	             prev.next=nnn;
	             nnn.next=nextNode;
	             temp2=temp.next;
	         }
	     }
	     System.out.println("Node Inserted");
	     temp2=head;
	         while(temp2!=null)
	        {
	        System.out.print(temp2.data+"-->"+"");
	        temp2=temp2.next;
	       
	        }
	     
	    break;
	       
	    }
	 
	      
	      System.out.println("go to main menu press 1");
	      ch=sc.nextInt();
	 } 
	    while(ch==1);
	   }
	}

