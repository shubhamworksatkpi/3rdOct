package newassignment;

public class Question4_Rectangle extends Question4_Figure{
	
	
	    Question4_Rectangle(double d1, double d2) {
		super(d1, d2);
		// TODO Auto-generated constructor stub
	}
	    
	    void calculateArea() //Defining abstract class into Subclass Rectangle
	    {
	        System.out.println("The area of the Rectangle is: " +(dimension1*dimension2));
	    }

		@Override
		void calculateCircumference() {
			// TODO Auto-generated method stub
			 System.out.println("The circumference of the Rectangle is: " +2*(dimension1*dimension2));
		}
	
}
