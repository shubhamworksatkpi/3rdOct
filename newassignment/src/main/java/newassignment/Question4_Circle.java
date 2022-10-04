package newassignment;

public class Question4_Circle extends Question4_Figure{

	Question4_Circle(double radius, double diameter) {
		super(radius, diameter);
		// TODO Auto-generated constructor stub
	}

	void calculateArea() //Defining abstract class into Subclass Triangle
    {
        double area = 3.14*dimension1*dimension1;
        System.out.println("The area of the Circle is: " +area);
    }

	@Override
	void calculateCircumference() {
		// TODO Auto-generated method stub
		 System.out.println("The circumference of the Circle is: " +2*3.14*dimension1);
	}

}
