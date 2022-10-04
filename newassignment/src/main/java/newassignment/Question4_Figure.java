package newassignment;

public abstract class Question4_Figure {
	
	    double dimension1, dimension2;
	 
	    Question4_Figure(double d1, double d2) //Constructor of Class Figure
	    {
	        dimension1 = d1;
	        dimension2 = d2;
	    }
	    abstract void calculateArea(); //Abstract Method
	    abstract void calculateCircumference();

}
