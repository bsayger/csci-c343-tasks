/* @Author: Brandon Sayger
 * @Date: 1/12/2018
 * @Description: Task 1 from CH3 notes
 */

public class Ch3Task1 {
	
	public static void main(String[] args) {
		
		// create two new character stacks, 's' and 't'
		StackInterface<Character> s = new LinkedStack<Character>();
		StackInterface<Character> t = new LinkedStack<Character>();
		
		// push and pop
		s.push('a');
		s.push('b');
		s.push('c');
		t.push('d');
		t.push(s.pop());
		t.push(s.peek());
		s.push(t.pop());
		t.pop();
		
		// create a loop that displays the contents of the two stacks, from top to bottom
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
		
		System.out.println("--"); // divider for clarity
		
		while (!t.isEmpty()) {
			System.out.println(t.pop());
		}
	}

}
