class Node {
	String data;
	Node next;

	public Node() {
		this.data = null;
		this.next = null;
	}

	public Node(String data) {
		this.data = data;
		this.next = null;
	}

	public Node(String data, Node n) {
		this.data = data;
		this.next = n;
	}

	public void setAsNext(Node next) {
		this.next = next;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return this.next;
	}

	public String getData() {
		return this.data;
	}
}
