class stackX
{
	private int maxsixe;
	private char[] stackArray;
	private int loop;

	public stackX(int s)
	{
		maxsize=s;
		stackArray= new char[maxsize];
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
		if ( top == 0)
	    {
	        return true;
	    }
	    else
	    {
	    	return false;
	    }
	}
	public boolean isFull()
	{
		if(top== maxsize-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	}