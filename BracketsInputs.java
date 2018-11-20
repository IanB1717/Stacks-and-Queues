import java.util.Scanner;
public class BracketsInputs {
	public static void main(String args[])
	{
		String input;
		while(true)
		{
			System.out.flush();
			input=getString();
			if(input.equals(""))
				break;

				BrackerChecker theChecker = new BracketChecker(input);
				theChecker.check();
		}
	}
	public static String getString()
	{
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		return s;

	}
}