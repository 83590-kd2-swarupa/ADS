package linearQ;

public class queue 
{
	private int size,rear,front;
	private int arr[];
	
	queue(int Size)
	{
		rear=front=0;
		size=Size;
		arr=new int[size];
	}
	
	public void push(int element)
	{
		arr[rear]=element;
		rear++;
	}
	
	public void pop()
	{
		front++;
	}
	
	public int peek()
	{
		return arr[front];
	}

	public boolean isfull()
	{
		return rear==size;
	}
	
	public boolean isEmpty()
	{
		return front==rear ;
	}
}
