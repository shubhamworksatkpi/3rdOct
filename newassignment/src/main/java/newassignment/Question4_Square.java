package newassignment;

public class Question4_Square extends Question4_Figure{


	Question4_Square(double side1, double side2) {
		super(side1, side2);
		// TODO Auto-generated constructor stub
	}

	void calculateArea() //Defining abstract class into Subclass Triangle
    {
        double area = dimension1*dimension1;
        System.out.println("The area of the Square is: " +area);
    }

	@Override
	void calculateCircumference() {
		// TODO Auto-generated method stub
		 System.out.println("The circumference of the Square is: " +4*(dimension1));
	}


}
