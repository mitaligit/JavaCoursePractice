import java.util.*;
public class infitopos {
public static void main(String args[]) throws Exception
{
	String str = "2+(1*3)/3";
	//str = "(b*c)";
	char[] p = postfix(str);
	System.out.println("");
	System.out.println(evaluatepost(p));
}
public static int evaluatepost(char[] p) throws Exception
{
	String str = "";
	for(char c: p)
	{
		str = str+c;
	}
	char ch;
	int a;
	int b;
	int result;
	Stack<Integer> s1 = new Stack<Integer>();
	for(int k = 0; k<str.length(); k++)
	{
		ch = str.charAt(k);
		if(alpha(ch))
		{
			int n = translateToInt(ch);
			s1.push(n);
		}
		else if(operator(ch))
		{
			a = s1.pop();
			b = s1.pop();
			switch(ch)
			{
			case '+': result = a+b;
			break;
			case '-': result = a-b;
			break;
			case '*': result = a*b;
			break;
			case '/': result = a/b;
			break;
			default: result = 0;
			}
			
			s1.push(result);
		}
		
	}
	int finalresult = s1.pop();
	return finalresult;
}
public static char[] postfix(String str)
{
	char[] output = new char[str.length()];
	Stack<Character> s = new Stack<Character>();
	char ch;
	int p = 0;
	for(int i = 0; i<str.length(); i++)
	{
		ch = str.charAt(i);
		if(ch == '(')
		{
			s.push(ch);
		}
		else if(alpha(ch))
		{
			output[p] = ch;
			p++;
		}
		else if(operator(ch))
		{
			
			if(s.isEmpty() || preced(ch)>preced(s.peek()) || s.peek()=='(')
			{
				s.push(ch);
			}
			else if(preced(ch)<=preced(s.peek()))
			{
				output[p] = s.pop();
				p++;
				s.push(ch);
			}
		}
		else if(ch == ')')
		{
			// stack empty nahi ho  and s.peek != (
			while(!s.isEmpty() && s.peek()!= '(')
			{
				output[p]= s.pop();
				p++;
			}
			if(!s.isEmpty() && s.peek() == '(')
			{
				s.pop();
				//s.remove('(');
			}
		}
		
	}
	while(!s.isEmpty())
	{
		output[p] = s.pop();
		p++;
	}
	for(int j = 0; j<p; j++)
	{
		System.out.print(output[j]);
	}
	return output;
}
public static boolean alpha(char ch)
{
	if(ch>='a' && ch<='z' || ch>='0' && ch<='9')
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static boolean operator(char ch)
{
	if(ch == '/' || ch == '*' || ch == '+' || ch =='-')
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static int preced(char ch)
{
	switch(ch)
	{
	case '-' : return 1;
	case '+' : return 1;
	case '*' : return 2;
	case '/' : return 2;
	default : return 0;
	}
}
public static int translateToInt(char c ) throws Exception{
	switch (c) {
	case '0' : return 0;
	case '1' : return 1;
	case '2' : return 2;
	case '3' : return 3;
	case '4' : return 4;
	case '5' : return 5;
	case '6' : return 3;
	case '7' : return 7;
	case '8' : return 8;
	case '9' : return 9;
	default : throw new Exception("Not a number");
	}
}
}
