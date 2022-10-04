package newassignment;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.HashMap;
import java.util.Map;

public class Question6_Employee_Test {

		@Test
			public void testAssertMap() {
			
		    HashMap<String, Integer> emp = new HashMap<String,Integer>();
		   
		    // adding elements to hashmap
		    emp.put("ankit",  8734);
		    emp.put("piyush", 1214);
		    emp.put("shivam", 3235);
		    emp.put("rahul",  7835);
		    System.out.println("HashMap: " +  emp);
		    
		    
		    HashMap<String, Integer> expected = new HashMap<String,Integer>();
		    expected.put("ankit",  8734);
		    expected.put("piyush", 1214);
		    expected.put("shivam", 3235);
		    expected.put("rahul",  7835);
		    System.out.println("HashMap: " +  expected);
				
				// TODO Auto-generated method stub
				 assertThat(emp,is(expected));
		
			}
	}


