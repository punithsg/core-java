class FastrackWatches{

public static void main(String Time[]){

	Fastrack typeOne = new Fastrack();
	
	typeOne.productID = 1;
	typeOne.type = "Analog";
	typeOne.ageType = "Gents";
	typeOne.colour = "White";
	typeOne.caseType = "Chain";
	
	typeOne.Watches();
	System.out.println("Product ID is" + " " + typeOne.productID);
	System.out.println("Watch type is" + " " + typeOne.type );
	System.out.println("This watch is for" + " " + typeOne.ageType);
	System.out.println("Colour of watch is" + " " + typeOne.colour);
	System.out.println("Case type is" + " " + typeOne.caseType);
	
	System.out.println("----------------------------->>>>");

	Fastrack typeTwo = new Fastrack();
	
	typeTwo.productID = 2;
	typeTwo.type = "Analog";
	typeTwo.ageType = "Ladies";
	typeTwo.colour = "Pink";
	typeTwo.caseType = "Belt";
	
	typeTwo.Watches();
	System.out.println("Product ID is" + " " + typeTwo.productID);
	System.out.println("Watch type is" + " " + typeTwo.type );
	System.out.println("This watch is for" + " " + typeTwo.ageType);
	System.out.println("Colour of watch is" + " " + typeTwo.colour);
	System.out.println("Case type is" + " " + typeTwo.caseType);
	
	System.out.println("----------------------------->>>>");
	
	Fastrack typeThree = new Fastrack();
	
	typeThree.productID = 3;
	typeThree.type = "Analog";
	typeThree.ageType = "Boy";
	typeThree.colour = "Blue";
	typeThree.caseType = "Chain";
	
	typeThree.Watches();
	System.out.println("Product ID is" + " " + typeThree.productID);
	System.out.println("Watch type is" + " " + typeThree.type );
	System.out.println("This watch is for" + " " + typeThree.ageType);
	System.out.println("Colour of watch is" + " " + typeThree.colour);
	System.out.println("Case type is" + " " + typeThree.caseType);
	
	System.out.println("----------------------------->>>>");
	
	Fastrack typeFour = new Fastrack();
	
	typeFour.productID = 4;
	typeFour.type = "Digital";
	typeFour.ageType = "Girl";
	typeFour.colour = "Orange";
	typeFour.caseType = "Belt";
	
	typeFour.Watches();
	System.out.println("Product ID is" + " " + typeFour.productID);
	System.out.println("Watch type is" + " " + typeFour.type );
	System.out.println("This watch is for" + " " + typeFour.ageType);
	System.out.println("Colour of watch is" + " " + typeFour.colour);
	System.out.println("Case type is" + " " + typeFour.caseType);
	
	System.out.println("----------------------------->>>>");
	
	Fastrack typeFive = new Fastrack();
	
	typeFive.productID = 5;
	typeFive.type = "Digital";
	typeFive.ageType = "Kids";
	typeFive.colour = "Red";
	typeFive.caseType = "Belt";
	
	typeFive.Watches();
	System.out.println("Product ID is" + " " + typeFive.productID);
	System.out.println("Watch type is" + " " + typeFive.type );
	System.out.println("This watch is for" + " " + typeFive.ageType);
	System.out.println("Colour of watch is" + " " + typeFive.colour);
	System.out.println("Case type is" + " " + typeFive.caseType);
	
	System.out.println("----------------------------->>>>");
	

}

}