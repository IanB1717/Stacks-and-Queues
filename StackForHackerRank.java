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

public class StackForHackerRank{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        boolean flag = true;
        String str = sc.nextLine();
        int l = str.length();
        flag = true;
        Stack<String> st = new Stack<String>();
        for (int i = 0; i < l; i++) {
            String test = str.substring(i, i + 1);
            if (test.equals("(")) {
                st.push(test);
            } else if (test.equals("{")) {
                st.push(test);
            } else if (test.equals("[")) {
                st.push(test);
            } else if (test.equals(")")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("(")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (test.equals("}")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("{")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            } else if (test.equals("]")) {
                if (st.empty()) {
                    flag = false;
                    break;
                }
                if (st.peek().equals("[")) {
                    st.pop();
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag && st.empty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}