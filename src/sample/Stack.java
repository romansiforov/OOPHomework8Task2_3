package sample;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Stack<K> implements Iterable<K>{
	private Object[] stack;
	private int capacity;
	private int size;
	
	public Stack(int capacity) {
		this.stack = new Object[capacity];
		this.capacity = capacity;
		this.size = 0;
	}
	
	public Stack() {
		this.stack = new Object[0];
		this.capacity = stack.length;
		this.size = 0;
	}

	public Object[] getStack() {
		return stack;
	}

	public void setStack(Object[] stack) {
		this.stack = stack;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Stack [stack=" + Arrays.toString(stack) + ", capacity=" + capacity + ", size=" + size + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(stack);
		result = prime * result + Objects.hash(capacity, size);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stack other = (Stack) obj;
		return capacity == other.capacity && size == other.size && Arrays.deepEquals(stack, other.stack);
	}
	
	public void push(K obj) {
		if(size < stack.length) {
			stack[size] = obj;
			size++;
		} else {
			int newCapacity = (capacity*3)/2+1;
			stack = Arrays.copyOfRange(stack, 0, newCapacity);
			stack[size] = obj;
			capacity = stack.length;
			size++;
		}
	}
	
	public K pop() {
		if(size != 0) {
			K tmp = (K)stack[size-1];
			stack[size-1] = null;
			size--;
			return tmp;
		}
		else {
			System.out.println("Stack is empty");
			return null;
		}
	}
	
	public K peek() {
		return (K)stack[size-1];
	}

	@Override
	public Iterator iterator() {
		Iterator iterator = Arrays.asList(stack).iterator();
		return iterator;
	}
}
