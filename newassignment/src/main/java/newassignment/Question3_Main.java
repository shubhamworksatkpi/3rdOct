package newassignment;

public class Question3_Main {
	
	public static void main(String[] args) {

		Question3_ClassOne a=new Question3_ClassOne();

		a.display();

		Question3_ClassTwo b=new Question3_ClassTwo();

		b.display();

		System.out.println(b.add(8,3));

		System.out.println(b.add(4.8,9.6)); 

		Question3_EncapTest encap = new Question3_EncapTest();

		encap.setName("Shubham");

		System.out.print("Name : " + encap.getName() );

		Question3_TwoWheeler test = new Question3_Activa();

		test.run();

		}
}
