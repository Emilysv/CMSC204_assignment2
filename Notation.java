
public class Notation extends Object 
{

	MyStack <Integer> stack = new MyStack<>();
	public Notation()
	{
		
	}
	
	public static double evaluatePostfixExpression(String postfixExpr) throws InvalidNotationFormatException
	{
	MyStack<Double>stack= new MyStack<>(postfixExpr.length());
	
	for (int index=0; index< postfixExpr.length(); index++)
	{
		if(Character.isDigit(index))
		{
						
		}
	}
		return 0;
		
	}
	
	public static String convertPostfixToInfix(String postfix)throws InvalidNotationFormatException
	{
		return postfix;
		
	}
	
	public static String convertInfixToPostfix(String infix)throws InvalidNotationFormatException
	{
		return infix;
		
	}
}
