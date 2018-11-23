import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Stack
{
    private int maxSize;
	private int[] stackArray;
	private int top;

	public Stack(int s)
	{
		maxSize=s;
		stackArray=new int[maxSize];
		top=-1;
	}
	public void push(int j)
	{
		stackArray[++top]=j;
	}
	public int pop()
	{
		return stackArray[top--];
	}
	public int peek()
	{
		return stackArray[top];
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
}

public class StackLab7{
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean flag;
        int n = sc.nextInt();
        sc.nextLine();
        Stack ar = new Stack(n);
        String[] arr = new String[n];
        int count=-1001;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for (int j = 0; j < n; j++) {
            if (arr[j].length() > 3) {
                String val = arr[j].substring(5);
                int result = Integer.parseInt(val);
                // System.out.println(result);
                ar.push(result);
            }
            else if(!ar.isEmpty())
            {

                    ar.pop();

            }

        }
        if(ar.isEmpty())
        {
            System.out.println("empty");

        }

        while(!ar.isEmpty())

         {
            int smallest = ar.pop();
            if (smallest > count) {
                count = smallest;
         }
         }
         if(count!=-1001)
         {
             System.out.println(count);
         }




    }
}

