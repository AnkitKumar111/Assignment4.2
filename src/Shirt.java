public class Shirt {
	private double collarSize;  //private member variable
	private double sleeveLength;  //private member variable
	private String material;    //private member variable
	
	//default constructor with no arguments
	Shirt(){
		 collarSize=29;
		 sleeveLength=15;
		 material="silk";
	 }
	
	//parameterized constructor with 3 arguments
	 Shirt(double c,double s, String m){
		 collarSize=c;
		 sleeveLength=s;
		 material=m;
		 m="Cotton"; 
	 }
	 
	 
	 //get and set method for member variable
	 public void setCollarSize(double size)
	 {
		 collarSize = size;
	 }	 
	 
	 public double getCollarSize()
	 {
		 return collarSize;
	 }
	 
	 public void setSleeveLength(double size)
	 {
		 sleeveLength = size;
	 }	 
	 
	 public double getSleeveLength()
	 {
		 return sleeveLength;
	 }
	 
	 public void setMaterial(String m1)
	 {
		 material = m1;
	 }	 
	 
	 public String getMaterial()
	 {
		 return material;
	 }
	 
	 //print method to print
	 void Printf(){
		 System.out.println("Collarsize = "+collarSize+"   "+"SleeveLength = "+sleeveLength+"   "+"Material = "+material);		 
	 }
}
