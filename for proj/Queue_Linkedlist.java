public class Queue_Linkedlist {
	Node front;
	Node rear;
	int size;

	public Queue_Linkedlist() {
		this.size = 0;
		this.front = null;
		this.rear = null;

	}

	public boolean isEmpty() {
		return (this.front == null);

	}

	public String getFront() {
		return (front.data);

	}

	public int getSize() {
		return (this.size);
	}

	public void enqueue(String data) {
		Node node = new Node(data);
		if (this.front == null) {
			this.front = node;
			this.rear = node;
			size++;
			return;
		}
		this.rear.next = node;
		this.rear = node;
		size++;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("The Queue is Empty.");
			return;
		}

		Node prev = null;
		prev = this.front;
		this.front = this.front.next;
		prev.next = null;
		size--;

		if (this.front == null) {
			this.rear = null;
		}

	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("The Queue is Empty.");
			return;
		}
		System.out.println(front.data);
	}

	public void display() {
        	if (isEmpty()) {
			System.out.println("The Queue is Empty.");
			return;
		}
		Node temp = front;
        System.out.println("Current Queue: ");
		while (temp.next != null) {
            
			System.out.println(temp.data);
            
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

}
