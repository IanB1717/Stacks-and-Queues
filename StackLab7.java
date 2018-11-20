import java.util.*;
class StackX
{
	private int maxSize;
	private char[] stackArray;
	private int top;

	public StackX(int s)
	{
		maxSize=s;
		stackArray=new char[maxSize];
		top=-1;
	}
	public void push(char j)
	{
		stackArray[++top]=j;
	}
	public char pop()
	{
		return stackArray[top--];
	}
	public char peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
}

public class StackLab7{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        boolean flag = true;
        int count =o;
        int l = sc.nextInt();
        flag = true;
        //Stack<String> ar = new Stack<String>();
        //Stack<String> check = new Stack<String>();
        StackX ar = new StackX(l);
        char [] check = new char[l];
        for (int i = 0; i < l; i++) {
        	char c = sc.next().charAt(0);
        	ar.push(c);
     }
     for (int j = 0; j < l; j++)
     {
        	char val =ar.pop();
        	val=check[j];
     }

     for(int k=0;k<l;k++)
     {
     	if(ar[k]==check[k])
     	{
     		count++;
     	}
     }
     if(count==l)
     {
     	System.out.println("VALID");
     }
     else
     {
     	System.out.println("INVALID");
     }

    }
}