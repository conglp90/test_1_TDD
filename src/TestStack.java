import static org.junit.Assert.*;

import org.junit.Test;


public class TestStack {

	@Test
	public void testConstructor() {
		MyStack a= new MyStack();
		assertTrue(a.getSize()==0);
	}
	
	@Test
	public void testPush() {
		MyStack a= new MyStack();
		a.push("abc");
		assertTrue(a.getSize()==1);
	}
	
	@Test
	public void testPushWithStackHasKElements() {
		MyStack a= new MyStack();
		a.push("1");
		a.push("2");
		a.push("3");
		int nowSize=a.getSize();
		a.push("4");
		assertTrue(a.getSize()==nowSize+1);
	}
	
	@Test
	public void testTopWithEmptyStack() {
		MyStack a= new MyStack();
		assertTrue(a.top()==null);
	}
	
	@Test
	public void testTopAfterPushWithEmptyStrack() {
		MyStack a= new MyStack();
		a.push("phantu1");
		assertTrue(a.top().equals("phantu1"));
	}
	
	@Test
	public void testPopWithEmptyStrack() {
		Exception popEx= null;
		try {
			MyStack a= new MyStack();
			a.pop();
		} catch ( StackEmptyException e) {
			popEx=e;
		}
		assertTrue(popEx!=null);
	}
	
	@Test
	public void testPopWithStackHasKElements() {
		MyStack a= new MyStack();
		a.push("1");
		a.push("2");
		a.push("3");
		int nowSize=a.getSize();
		a.pop();
		assertTrue(a.getSize()==nowSize-1);
	}
	
	@Test
	public void testPopWithStackHasOneElements() {
		MyStack a= new MyStack();
		a.push("1");
		a.pop();
		assertTrue(a.getSize()==0);
		assertTrue(a.top()==null);
	}
	
	@Test
	public void testTopAndPopWithStackHasKElements() {
		MyStack a= new MyStack();
		a.push("1");
		a.push("1");
		a.push("1");
		a.push("1afd");
		a.push("daag1");
		a.push("ag1");
		assertTrue(a.top().equals(a.pop()));
	}
	
	@Test
	public void testMultiPushAndMultiPop() {
		MyStack a= new MyStack();
		a.push("1");
		a.push("2");
		a.push("3");
		a.push("4");
		assertTrue(a.pop().equals("4"));		
		assertTrue(a.pop().equals("3"));
		assertTrue(a.pop().equals("2"));
		assertTrue(a.pop().equals("1"));
	}
}
