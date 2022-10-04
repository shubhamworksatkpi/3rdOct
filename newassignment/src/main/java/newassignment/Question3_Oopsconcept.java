package newassignment;

	
	public class Question3_Oopsconcept extends Question3_ParentClass implements Question3_Interface{
		    

		    @Override
		    public String num(String n) {
		        // TODO Auto-generated method stub
		         n="y";
		        return "KPI Partners";
		    }

		    public String string(String m) {
		        // TODO Auto-generated method stub
		         m="n";
		        return "I'm Shubham K.";
		    }
		//overloading 
		    public String num(String A,String B) 
		    {
		        return "this is method Overloading";
		    }
		}


