
public class Queue {
	static int front, rear;
	static {
		front = rear = -1;
	}
	int[] arr;
	public Queue() {
		this.arr = new int[5];
	}
	public Queue(int size) {
		this.arr = new int[size];
	}
	public void push(int value) {
		if(rear == arr.length-1) {
			System.out.println("Full");
		}else if(front==-1 && rear ==-1) {
			rear++;
			front++;
			arr[rear] = value;
		}else {
			rear++;
			arr[rear] = value;
		}
	}
	public int pop() {
		int value = 0;
		if(front == -1 && rear == -1) {
			System.out.println("Empty");
		}
		else  {
			value = arr[front];
			front++;
			if(rear == front) {
				rear = -1;
				front = -1;
			}
		}
		return value;
	}
	
	public String toString() {
		String str = "";
		for(int i = front +1; i<rear+1; i++) {
			str += arr[i] +" ";
			str += "\n";
		}
		return str;
		
	}
	
}
