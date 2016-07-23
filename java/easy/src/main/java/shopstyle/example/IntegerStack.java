package shopstyle.example;

import java.util.Optional;
import java.util.LinkedList;

// javac -sourcepath . shopstyle/example/IntegerStack.java
/**
 * An {@link Integer} implementation of {@link Stack}.
 *
 * <p>Instances of this class are not thread-safe.</p>
 */
final class IntegerStack<T> implements shopstyle.example.Stack {  // implement interface

    //******************************************************************************
    // Choosing LinkedList over ArrayList as it is faster for inserts and removals
    // and does not traverse the list to add or remove from the list for Stack 
    // operations
    //******************************************************************************
    LinkedList<Integer> itemList = new LinkedList<Integer>();

    int size = 0;

    IntegerStack(int Size) {
    	this.size = size;
    	fillList(size);
    }

    IntegerStack() {
    	if(size > 0)
    		fillList(size);
    }

    //**************************************************************
    // create function as this can be used for both constructors
    //**************************************************************
    private void fillList(int size) {
    	for(int i = 0; i<size; i++){
    		itemList.addFirst(new Integer(i)); // use addFirst since this is LIFO
    	}
    }

	public boolean isEmpty() {
		if(itemList.isEmpty()) {
	    	return true;
	    } else {
	    	return false;
	    }	
	}

	public Optional<Integer> pop() {
		if(itemList.isEmpty()) {
			return Optional.empty();
		}
        return Optional.of(itemList.pop());
	}

	public Optional<Integer> peek() {
		if(itemList.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(itemList.peek()); 
	}

	public void push(Object t) {
		if(t !=null && t instanceof Integer) { 
			itemList.push((Integer)t);
		}
	}

    public int getSize(){
    	return itemList.size();	
    }

	public void outputList(){
		Integer[] vals = itemList.toArray(new Integer[itemList.size()]);
		for(int i = 0; i < vals.length; i++) {
			System.out.println("value at index: "+ i + " is: "+vals[i]);
		}
	}
}