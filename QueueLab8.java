import java.util.Scanner;
import java.util.*;
class Queue
{
	private int maxSize;
    private String [] queArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int s)
	{
		maxSize = s;
		queArray = new String[maxSize];
		front = 0;
		nItems = 0;
	}
	public void insert(String item)
	{
		if(nItems==0)
		{
			queArray[0]=item;
		}
		else
		{
			int j =nItems;
			if(j>0&&queArray[j-1].length()>item.length())
			{
				queArray[j]=queArray[j-1];
				j--;

			}
			if(j>0&&queArray[j-1].length()==item.length())
			{
				if(queArray[j-1].compareToIgnoreCase(item)>0)
				{
					queArray[j]=queArray[j-1];
				    j--; 
				}
				
			}
			queArray[j]=item;
		}
		nItems++;
}

	public String remove()
	{
		if(isEmpty()) 
			{
				return null;
			}
		String temp = queArray[front];
		
		if(front+1==maxSize)
		{
			front=0;
			nItems--;
		}
		
		return temp;
    }
    public String peekFront()
    {

        if(isEmpty())
        {
            return null;
        }
        return queArray[0];
    }
	public boolean isEmpty(){
		return (nItems==0);
	}
	public boolean isFull(){
		return (nItems==maxSize);
	}
	public int size(){
		return nItems;
	}
}
public class QueueLab8{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Queue ar = new Queue(n);
		String [] arr=new String[n];
		String median="";
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		for (int j = 0; j < n; j++) {
            if (arr[j].length() >6 ) {
                String val = arr[j].substring(7);
                System.out.println(val);
                ar.insert(val);
            }
            else
            {
            	System.out.println(ar.remove());
            	System.out.println("was removed");

            }

        }
        if(ar.isEmpty())
        {
            System.out.println("empty");


        }
        if(!ar.isEmpty())
        {
        	System.out.println(ar.peekFront());
        	
        }

	}
}