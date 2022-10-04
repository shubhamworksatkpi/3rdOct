package newassignment;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

	public class Question3_OopsconceptTest {
		
	    @Test
	    public void evaluatesExpression() 
	    {
	        Question3_Oopsconcept n=new Question3_Oopsconcept();
	        Question3_Oopsconcept m=new Question3_Oopsconcept();
	        Question3_Oopsconcept A=new Question3_Oopsconcept();
	        Question3_Oopsconcept B=new Question3_Oopsconcept();
	        String num=n.num("y");
	        String num1=m.string("n");
	        String num2=A.num("y","n");
	        assertEquals("KPI Partners",num);
	        assertEquals("I'm Shubham K.",num1);
	        assertEquals("this is method Overloading",num2);
	        
	        
	         
	    }

	}

