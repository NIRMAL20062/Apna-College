import java.util.ArrayList;

public class StackImplementArrayList_ {

    public static void main(String[] args) {
	//   Stack stack = new Stack();
	  
	 //The static method push(int) from the type StackImplementArrayList_.Stack should be accessed in a static wayJava(603979893)
     // Stack stack - StackImplementArrayList_.main(String[])
	  /* stack.push(1); // ❌ NOT RECOMMENDED for static methods
	  stack.push(2); // ❌ NOT RECOMMENDED for static methods
	  stack.push(3); // ❌ NOT RECOMMENDED for static methods
 */

	  Stack.push(1); // ✅ RECOMMENDED for static methods
	  Stack.push(2);
	  Stack.push(3);	

	  while (!Stack.isEmpty()) {
		System.out.println(Stack.peek());
		// System.out.println(stack.pop());
		Stack.pop();
	  }
	  
    }


    // Stack Implementation Using ArrayList
    static class Stack {
	   static ArrayList<Integer> stack = new ArrayList<>();

	   //Making a isEmpty function;
	   public static boolean isEmpty(){
		  return stack.size() == 0;
	   }

	   // Making a pop Function
	   public static int pop(){
		if (isEmpty()){
		   return -1;
	   } else{
		int top = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return top;
	   }

	   }

	   // Making a push function
	   public static void push(int data){
		stack.add(data);
	   }

	   // Making a peek function
	   public static int peek(){
		if (isEmpty()){
		   return -1;
		} else {
		   return stack.get(stack.size() - 1);
		}
	}

    }
}