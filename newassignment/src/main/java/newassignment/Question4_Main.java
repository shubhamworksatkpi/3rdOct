package newassignment;

public class Question4_Main{

	    public static void main(String[] args)
	    {
	    	Question4_Figure f; //Reference Variable of Figure class
	    	
	        f = new Question4_Rectangle(3,4); //Constructor call to subclass Rectangle
	        f.calculateArea(); 
	        f.calculateCircumference();
	        System.out.println("\n" );
	        f = new Question4_Triangle(4,5); //Constructor call to subclass Triangle
	        f.calculateArea(); 
	        f.calculateCircumference();
	        System.out.println("\n" );
	        f = new Question4_Square(3,3); //Constructor call to subclass Square
	        f.calculateArea(); 
	        f.calculateCircumference();
	        System.out.println("\n" );
	        f = new Question4_Circle(8,8); //Constructor call to subclass Circle
	        f.calculateArea(); //c
	        f.calculateCircumference();
	    }


			
		}

