package sample;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stackInt = new Stack<>();
		
		Integer number = 100;
		
		System.out.println(stackInt.toString());
		stackInt.push(number);
		System.out.println(stackInt.toString());
		stackInt.push(number+1);
		stackInt.push(number+2);
		System.out.println(stackInt.toString());
		System.out.println("Peek method. No element deletion "+stackInt.peek());
		System.out.println(stackInt.toString());
		System.out.println("Pop method. Head element deletion and retrieval "+stackInt.pop());
		System.out.println(stackInt.toString());
		System.out.println();
		
		Stack<String> stackStr = new Stack<>();
		
		String str = "Roman";
		
		stackStr.push(str);
		System.out.println(stackStr.toString());
		stackStr.push(str+"Siforov");
		stackStr.push(str+"Vyacheslavovych");
		
		System.out.println(stackStr.toString());
		System.out.println("Peek method. No element deletion "+stackStr.peek());
		System.out.println(stackStr.toString());
		System.out.println("Pop method. Head element deletion and retrieval "+stackStr.pop());
		System.out.println(stackStr.toString());
		System.out.println();
		
		
		Stack stackObj = new Stack();
		
		Object obj = new Object();
		
		stackObj.push(obj);
		System.out.println(stackObj.toString());
		stackObj.push(obj);
		stackObj.push(obj);
		
		System.out.println(stackObj.toString());
		System.out.println("Peek method. No element deletion "+stackObj.peek());
		System.out.println(stackObj.toString());
		System.out.println("Pop method. Head element deletion and retrieval "+stackObj.pop());
		System.out.println(stackObj.toString());
		System.out.println();
		
		for(Integer intNum : stackInt) {
			System.out.println(intNum);
		}

	}

}
