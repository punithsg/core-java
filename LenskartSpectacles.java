class LenskartSpectacles{

public static void main(String Punith[]){

	Lenskart typeOne = new Lenskart();
	
	typeOne.productID = 1;
	typeOne.glassType = "Positive";
	typeOne.frameColour = "Transparent";
	typeOne.frameShape = "Rectangle";
	typeOne.frameMaterial = "Plastic";
	
	typeOne.Specs();
	System.out.println("Product ID is" + " " + typeOne.productID);
	System.out.println("Glass type is" + " " + typeOne.glassType );
	System.out.println("Frame Colour is" + " " + typeOne.frameColour);
	System.out.println("Frame Shape is" + " " + typeOne.frameShape);
	System.out.println("Frame material is" + " " + typeOne.frameMaterial);
	
	System.out.println("----------------------------->>>>");

	Lenskart typeTwo = new Lenskart();
	
	typeTwo.productID = 2;
	typeTwo.glassType = "Negative";
	typeTwo.frameColour = "White";
	typeTwo.frameShape = "Square";
	typeTwo.frameMaterial = "Wood";
	
	typeTwo.Specs();
	System.out.println("Product ID is" + " " + typeTwo.productID);
	System.out.println("Glass type is" + " " + typeTwo.glassType );
	System.out.println("Frame Colour is" + " " + typeTwo.frameColour);
	System.out.println("Frame Shape is" + " " + typeTwo.frameShape);
	System.out.println("Frame material is" + " " + typeTwo.frameMaterial);
	
	System.out.println("----------------------------->>>>");
	
	Lenskart typeThree = new Lenskart();
	
	typeThree.productID = 1;
	typeThree.glassType = "Positive";
	typeThree.frameColour = "Blue";
	typeThree.frameShape = "Round";
	typeThree.frameMaterial = "Metal";
	
	typeThree.Specs();
	System.out.println("Product ID is" + " " + typeThree.productID);
	System.out.println("Glass type is" + " " + typeThree.glassType );
	System.out.println("Frame Colour is" + " " + typeThree.frameColour);
	System.out.println("Frame Shape is" + " " + typeThree.frameShape);
	System.out.println("Frame material is" + " " + typeThree.frameMaterial);
	
	System.out.println("----------------------------->>>>");
	
	Lenskart typeFour = new Lenskart();
	
	typeFour.productID = 1;
	typeFour.glassType = "Negative";
	typeFour.frameColour = "Red";
	typeFour.frameShape = "Oval";
	typeFour.frameMaterial = "Acetate";
	
	typeFour.Specs();
	System.out.println("Product ID is" + " " + typeFour.productID);
	System.out.println("Glass type is" + " " + typeFour.glassType );
	System.out.println("Frame Colour is" + " " + typeFour.frameColour);
	System.out.println("Frame Shape is" + " " + typeFour.frameShape);
	System.out.println("Frame material is" + " " + typeFour.frameMaterial);
	
	System.out.println("----------------------------->>>>");
	
	Lenskart typeFive = new Lenskart();
	
	typeFive.productID = 1;
	typeFive.glassType = "Positive";
	typeFive.frameColour = "Orange";
	typeFive.frameShape = "Over Sized";
	typeFive.frameMaterial = "Titanium";
	
	typeFive.Specs();
	System.out.println("Product ID is" + " " + typeFive.productID);
	System.out.println("Glass type is" + " " + typeFive.glassType );
	System.out.println("Frame Colour is" + " " + typeFive.frameColour);
	System.out.println("Frame Shape is" + " " + typeFive.frameShape);
	System.out.println("Frame material is" + " " + typeFive.frameMaterial);
	

}

}