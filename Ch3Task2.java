/* @Author: Brandon Sayger
 * @Date: 1/12/18
 * @Description: Task 2 from CH3 notes (factorial program)
 */

public class Ch3Task2 {
	
	public static void main(String[] args) {
		
		// variables
		int n = 4;
		
		// create new stack
		StackInterface<Integer> stack = new LinkedStack<Integer>();
		
		// while loop that pushes a decrementing integer onto the stack
		while (n > 0) {
		stack.push(n);
		n--;
		} // end while
		int result = 1;
		
		// while loop that empties the stack while multiplying each integer in the stack
		while (!stack.isEmpty()) {
		int integer = stack.pop();
		result = result * integer;
		} // end while
		
		// print the result of the factorial
		System.out.println("result = " + result);
		
	}

}
