package newassignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

	public class Question4_ConcreteTest {
		
	    @Test
	    
	    public void evaluatesExpression() 
	    {
	        Question4_Concrete1 actor1=new Question4_Concrete1();
	        Question4_Concrete1 movie1=new Question4_Concrete1();
	        Question4_Concrete2 actor2=new Question4_Concrete2();
	        Question4_Concrete2 movie2=new Question4_Concrete2();
	        Question4_Concrete3 actor3=new Question4_Concrete3();
	        Question4_Concrete3 movie3=new Question4_Concrete3();
	        Question4_Concrete4 actor4=new Question4_Concrete4();
	        
	        
	        Question4_Concrete4 movie4=new Question4_Concrete4();
	        
	        String n=actor1.actor();
	        String m=movie1.movie();
	        String n2=actor2.actor();
	        String m2=movie2.movie();
	        String n3=actor3.actor();
	        String m3=movie3.movie();
	        String n4=actor4.actor();
	        String m4=movie4.movie();
	        assertEquals("Shahrukh Khan",n);
	        assertEquals("Don",m);
	        assertEquals("Salman Khan",n2);
	        assertEquals("Ek Tha Tiger",m2);
	        assertEquals("Ajay Devgn",n3);
	        assertEquals("Runway 34",m3);
	        assertEquals("Prabhas",n4);
	        assertEquals("Bahubali",m4);
	    }

	}

