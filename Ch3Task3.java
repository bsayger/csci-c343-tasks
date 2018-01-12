/* @Author: Brandon Sayger
 * @Date: 1/12/18
 * @Description: Task 3 from CH3 notes
 */

public class Ch3Task3 {
	
	public static void main(String[] args) {
		
		// create the stringStack
		StackInterface<String> stringStack = new LinkedStack<String>();
		
		// push/pop the stringStack
		stringStack.push("Jim");
		stringStack.push("Jess");
		stringStack.pop();
		stringStack.push("Jill");
		stringStack.push("Jane");
		stringStack.pop();
		
		// create a new stack, nameStack
		StackInterface<String> nameStack = new LinkedStack<String>();
		
		// a while loop that pops the Strings from stringStack and pushes them to nameStack
		while (!stringStack.isEmpty()) {
			nameStack.push(stringStack.pop());
		}
		
		// check if stringStack is empty
		if (stringStack.isEmpty()) {
			System.out.println("stringStack is empty!");
		}
		
		System.out.println("----"); // divider for clarity
		
		// a while loop that prints the contents of nameStack, from top to bottom
		while (!nameStack.isEmpty()) {
			System.out.println(nameStack.pop());
		}
		
	}

}
