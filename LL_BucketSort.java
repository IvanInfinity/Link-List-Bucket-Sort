/**
 *  class LL_BucketSort bucket sorts a link list of integers.
 * 
 * @author (Ivan Williams) 
 * @version (version 1.0)
 */
import javax.swing.JOptionPane;
public class LL_BucketSort
{
   public static void main(String[] args)
   {
       //head is the first Node of the Link List. tempHead is the first Node in the temp Link List
       Node head = null;
       Node tempHead = null;
       
       int x = 0;
       //If head is null get integer from the user.
       if(head==null)
       {
           head = new Node(Integer.parseInt(JOptionPane.showInputDialog("Gimme Numba")));
           tempHead = new Node(0);
       }
       //Ask user for second Integer, place as a Node in Link List.
       Node temp = new Node(Integer.parseInt(JOptionPane.showInputDialog("Gimme Numba")));
       head.setNext(temp);
       Node tempTemp = new Node(0);
       tempHead.setNext(tempTemp);
       //Continually ask for user input unitl the input given is less than 0.
       while(x>=0)
       { 
           x = Integer.parseInt(JOptionPane.showInputDialog("Gimme Numba (negative integer to terminate)"));
           if (x>=0)
           {
               temp.setNext(new Node(x));
               temp=temp.getNext();
               tempTemp.setNext(new Node(x));
               tempTemp=tempTemp.getNext();
           }
           else
           {
               x=-1;
           }
       } 
       
       Node n = head;
       Node m = tempHead;
       int l = n.getInfo();
       //Finds the highest value within the Nodes in the Link List.
       while(n!=null)
       {
           if (n.getInfo() > l)
           {
               l=n.getInfo();
           }
            n=n.getNext();
       }
       
       int j = 10;
       int k = 0;
       //j loop prevents the program from evaluating past the highest place digit.
       //j is used to isolate the digit of a particular place (10's place, 100's place ect.).
       for(j=10; j<=l*10; j*=10)
       {
           n=head;
           m=tempHead;
           //k indicates the value of the digit.
           for(k=0; k<=9; k++)
           {
               n=head;
               //make the temp Link List the original Link List sorted at a particular place.
               while(n!=null)
               {
                   if((n.getInfo() % j)/(j/10) == k)
                   {
                           m.setInfo(n.getInfo());
                           m = m.getNext();
                   }
                   n = n.getNext();
               }
           }
           
           n=head;
           m=tempHead;
           //set the original Link List to the temp Link List.
           while(m!=null)
           {
               n.setInfo(m.getInfo());
               n=n.getNext();
               m=m.getNext();
           }
            n=head;
           System.out.println();
           //print current iteration.
           while(n!=null)
           {
               System.out.print(n.getInfo() + " ");
               n=n.getNext();
           }
       }
       
       n=head;
       System.out.println();
       //prints complete sorted Link List.
       while(n!=null)
           {
               System.out.print(n.getInfo() + " ");
               n=n.getNext();
           }
   }
}
