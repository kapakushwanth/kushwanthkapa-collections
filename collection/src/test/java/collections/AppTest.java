package collections;



import junit.framework.Assert;
import junit.framework.TestCase;

public class AppTest extends TestCase {
	//@Test
	public void testIntialList() {
		CustomList<Integer> myList=new CustomList<Integer>();
		Assert.assertEquals(0,myList.size()); 
	}
	//@Test
	public void testGetMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(21);
		int t=myList.get(0);
		Assert.assertEquals(21,t); 
	}
	//@Test
	public void testToStringMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(11);
		myList.add(12);
		myList.add(13);
		Assert.assertEquals("[11,12,13]",myList.toString()); 
	}
	//@Test
	public void testSizeMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(11);
		myList.add(12);
		myList.add(13);
		Assert.assertEquals(3,myList.size());
	}
	
	//@Test
	public void testRemoveMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(11);
		myList.add(12);
		myList.add(13);
		myList.remove(1);
		Assert.assertEquals(2,myList.size());
	}
	
	//@Test
	public void testEnsureCapacityMethod() {
		CustomList<Integer> myList=new CustomList<Integer>();
		myList.add(11);
		myList.add(12);
		myList.add(13);
		myList.add(14);
		myList.add(15);
		myList.add(16);
		myList.add(17);
		myList.add(18);
		myList.add(19);
		myList.add(20);
		myList.add(21);
		myList.add(22);
		int removedVal=myList.remove(1);
		Assert.assertEquals(11,myList.size());
	}
	
	
	//@Test
	public void testRemoveException() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
		  int removedVal=myList.remove(1000);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	
	//@Test
	public void testRemoveExceptionZero() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
	    myList.remove(-13);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	
	//@Test
	public void testGetException() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
	    myList.get(90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	//@Test
	public void testGetExceptionZero() {
		CustomList<Integer> myList=new CustomList<Integer>();
	  boolean thrown = false;

	  try {
	    myList.get(-90);
	  } catch (IndexOutOfBoundsException e) {
	    thrown = true;
	  }

	  assertTrue(thrown);
	}
	
	
}
