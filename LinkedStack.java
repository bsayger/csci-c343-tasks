/**
 * A class of stacks whose entries are stored in a chain of nodes.
 * 
 */
public class LinkedStack<T> implements StackInterface<T> {
	
	// references the first node in the chain
	private Node topNode; 

	public LinkedStack() {
		topNode = null;
	} // end default constructor

	public void push(T newEntry) {
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
	} // end push

	public T peek() {
		T top = null;

		if (topNode != null)
			top = topNode.getData();

		return top;
	} // end peek

	public T pop() {
		T top = peek();

		if (topNode != null)
			topNode = topNode.getNextNode();

		return top;
	} // end pop

	public boolean isEmpty() {
		return topNode == null;
	} // end isEmpty

	public void clear() {
		topNode = null;
	} // end clear

	private class Node {
		private T data; // entry in stack
		private Node next; // link to next node

		private Node(T dataPortion) {
			data = dataPortion;
			next = null;
		} // end constructor

		private Node(T dataPortion, Node linkPortion) {
			data = dataPortion;
			next = linkPortion;
		} // end constructor

		private T getData() {
			return data;
		} // end getData

		private Node getNextNode() {
			return next;
		} // end getNextNode
	} // end Node
} // end LinkedStack