public class TestShirt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating object and initializing constructor
		Shirt testShirt1= new Shirt();
		Shirt testShirt2= new Shirt(13,28,"cotton");
		Shirt testShirt3= new Shirt(17,32,"sock");
		
		//printing value
		testShirt1.Printf();
		testShirt2.Printf();
		testShirt3.Printf(); 
		
		}
}
