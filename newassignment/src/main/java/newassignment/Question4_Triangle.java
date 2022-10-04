package newassignment;

public class Question4_Triangle extends Question4_Figure{

	Question4_Triangle(double base, double height) //Constructor of class Triangle
	    {
	        super(base, height); //super() to call superclass Figure constructor
	    }
	    void calculateArea() //Defining abstract class into Subclass Triangle
	    {
	        double area = 0.5*dimension1*dimension2;
	        System.out.println("The area of the Triangle is: " +area);
	    }
		@Override
		void calculateCircumference() {
			// TODO Auto-generated method stub
			System.out.println("This method is for the circumference/perimeter of the Triangle");
		}
		
}
