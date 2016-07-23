package shopstyle.example;

public class MyStack {
    public static void main(String[] args) {
    	System.out.println("1st argument passed in: "+ args[0]);
    	IntegerStack is = new IntegerStack(Integer.parseInt(args[0].trim()));
    	System.out.println("Size of List: "+ is.getSize());
    	System.out.println("Peek at value at top of stack: (Expecting 14) "+is.peek());

    	System.out.println("Pop of value at top of stack: (Expecting 14) "+is.pop());

    	System.out.println("Peek at value at top of stack (Expecting 13, given that 14 has been popped): "+is.peek());
   }
}