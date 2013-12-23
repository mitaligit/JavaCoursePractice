

/*Write a method stutter that accepts a Stack of integers as a parameter and replaces every value in the stack with two occurrences of that value. For example, suppose a stack stores these values:

bottom [3, 7, 1, 14, 9] top

Then the stack should store the following values after the method terminates:

bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top

Notice that you must preserve the original order. In the original stack the 9 was at the top and would have been popped first. In the new stack the two 9s would be the first values popped from the stack. Also, you must not use any auxillary data structures to solve this problem. If the original stack is empty, the result should be empty as well.*/
import java.util.Stack;
public class stutter{
	public static void main(String[] args)
	{
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(3);
		s1.push(7);
		s1.push(1);
		s1.push(14);
		s1.push(9);
		System.out.println(s1);
		test(s1);
	}
	public static void test(Stack<Integer> s1)
	{
		System.out.println("result");
		stuttered(s1);
		System.out.println(s1);
	}
	public static Stack<Integer> stuttered(Stack<Integer> s1)
	{
		//int result;
		if(s1.isEmpty())
		{
			return s1;
		}
		int num;
		num = s1.pop();
		stuttered(s1);
		
		
		s1.push(num);
		s1.push(num);
		return s1;
	
	}
}
