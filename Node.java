public class Node
{
private int myInfo;
private Node next;

    Node() { 
        myInfo = 0;
        next = null; 
    }
    
   
     
    Node(int i)
    {
        myInfo = i;
        next = null;
    }
   
   
    
    public int getInfo()
    {
        return myInfo;   
    }
    
    public void setInfo(int x)
    {
        myInfo = x;   
    } 
    
   
    
    public Node getNext()
    {
        return next;   
    }    
    
    public void setNext(Node m)
    {
        next = m;   
    }
}
