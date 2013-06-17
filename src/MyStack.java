import java.util.ArrayList;


public class MyStack {
	int size=0;
	String top=null;
//	ArrayList<String> elements= new  ArrayList<String>();
	
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	public void push(String strPush) {
		// TODO Auto-generated method stub
		top=strPush;
		size++;
	}

	public String top() {
		if(size==0)
			top=null;
		return top;
	}

	public String pop() {
		if(size==0)
			throw new StackEmptyException();
		size--;
		return top;
	}

}
