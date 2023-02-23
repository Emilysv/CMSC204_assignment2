import java.util.ArrayList;

//@author Emily Vides
//this class is a data structure for its matching interface

public class MyQueue<T> implements QueueInterface<T>{
	
	int nodes;
	int capacity;
	int size;
	
	private ArrayList<T> data;
	ArrayList<T> copy;

	//default constructor
	public MyQueue()
	{
		ArrayList<T> data= new ArrayList<>();
		this.size=size;
		nodes=0;
		this.capacity=capacity;
	}
	
	//constructor with int parameter
	//@param capacity for the arraylist
	public MyQueue(int capacity)
	{
		data= new ArrayList<>(capacity);
		this.size= capacity;
		nodes=0;
		this.capacity=capacity;
		
	}
	
	//@return true if Queue is empty, false if not
	@Override
	public boolean isEmpty()
	{
		return data.isEmpty();
	}

	//@return true if Queue is full, false if not
	@Override
	public boolean isFull()
	{
		if (data.size()==capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	
	//@return the element at the front of the Queue
	// @throws QueueUnderflowException if queue is empty
	@Override
	public T dequeue() throws QueueUnderflowException {
		
		if(!isEmpty())
		{
			T firstElement= data.get(0);
			data.remove(0);
			return firstElement;
		}
		else 
		{
			throw new QueueUnderflowException ("The Queue is empty");
		}
		
	}

	//@return the number of elements in the Queue
	@Override
	public int size() {
		
		int size= data.size();
		
	
		return size;
	}

	//@param e the element to add to the end of the Queue
	 //@return true if the add was successful
	 //@throws QueueOverflowException if queue is full
	@Override
	public boolean enqueue(T e) throws QueueOverflowException {
		
		if(isFull()==true)
		{
			throw new QueueOverflowException("The Queue is full");
		}
		
		else 
		{
			data.add(e);
			return true;
		}
		
	}

	//@return string representation of the Queue with elements
	public String toString()
	{
		//refrence copy of arraylist
		ArrayList<T> copy= data;
		String str ="";
		
		for (int index= 0; index < copy.size(); index++)
		{
			str = str + copy.get(index).toString();
		}
		
		return str;
	}
	
	// @return string representation of the Queue with elements separated with the delimiter
	@Override
	public String toString(String delimiter) 
	{
		
		ArrayList<T> copy= data;
		String str ="";
		String D = "";
		
		
		for (int index= 0; index < copy.size(); index++)
		{
			
			str = str + D + copy.get(index).toString();
			
			D=delimiter;
			
		}
		return str;
	}

	//@param list elements to be added to the Queue
	 // @throws QueueOverflowException if queue is full
	@Override
	public void fill(ArrayList<T> list) 
	{
		//copy of the list
		ArrayList<T>copy= new ArrayList<>();
		copy.addAll(data);
	}

}
