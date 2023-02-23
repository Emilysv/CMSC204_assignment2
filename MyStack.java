import java.util.ArrayList;

//@author Emily Vides
//this class is a data structure for its matching interface

public class MyStack<T> implements StackInterface<T> 
{
	private ArrayList<T> data;
	int capacity;
	int size;
	
	
	//default constructor
	public MyStack()
	{
		data= new ArrayList<>();
		this.size=size;
		this.capacity=capacity;	
		}
	
	//constructor with parameter
	//@param capacity for arraylist
	public MyStack (int capacity)
	{
		data= new ArrayList<>(capacity);
		this.size= capacity;
		this.capacity=capacity;
	}

	//@return true if Stack is empty, false if not
	@Override
	public boolean isEmpty() {
		
		if (data.size()==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	//@return true if Stack is full, false if not
	@Override
	public boolean isFull() {
		if (data.size()>=capacity)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	//@return the element at the top of the Stack
	 //@throws StackUnderflowException if stack is empty
	@Override
	public T pop() throws StackUnderflowException {
		if( data.size()>0)
		{
			T elem=data.get(size()-1);
			data.remove(size()-1);
			return elem;
		}
		else 
		{
			throw new StackUnderflowException ("The stack is empty");
		}
	
	}

	//@return the element at the top of the Stack
	 //@throws StackUnderflowException if stack is empty
	@Override
	public T top() throws StackUnderflowException
	{
		if( data.size()>0)
		{
			T elem=data.get(size()-1);
			return elem;
		}
		else 
		{
			throw new StackUnderflowException ();
		}
	}

	//@return the number of elements in the Stack
	@Override
	public int size() {
		
		int size= data.size();
		return size;
		}

	//@param e the element to add to the top of the Stack
	 // @return true if the add was successful, false if not
	 //@throws StackOverflowException if stack is full
	@Override
	public boolean push(T e) throws StackOverflowException {
		if(!(data.size()==capacity))
		{
			data.add(e);
			return true;
		}
		else
		{
			throw new StackOverflowException("The stack is full");
		}
		
	}
	
	//@return an string which represent the Objects in the Stack from bottom to top
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

	//@return string representation of the Stack from bottom to top with elements separated with the delimiter
	@Override
	public String toString(String delimiter) {
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

	
	// @param list elements to be added to the Stack from bottom to top
	 //@throws StackOverflowException if stack gets full
	@Override
	public void fill(ArrayList<T> list) {
		// TODO Auto-generated method stub
		
	}

}
