class ChainExecutor{
public static void main(String Punith[]){

	Chain typeOne = new Chain();

	typeOne.productID = 1;
	typeOne.material = "Gold";
	typeOne.productPrice = 60000;

	typeOne.chainDetails();
	System.out.println("Chain ID is" + " " + typeOne.productID);
	System.out.println("Chain material is" + " " + typeOne.material );
	System.out.println("Price of Chain is" + " " + typeOne.productPrice);

	
	System.out.println("----------------------------->>>>");
	
	Chain typeTwo = new Chain();

	typeTwo.productID = 2;
	typeTwo.material = "Silver";
	typeTwo.productPrice = 1500;

	typeTwo.chainDetails();
	System.out.println("Chain ID is" + " " + typeTwo.productID);
	System.out.println("Chain material is" + " " + typeTwo.material );
	System.out.println("Price of Chain is" + " " + typeTwo.productPrice);

	
	System.out.println("----------------------------->>>>");
	
	Chain typeThree = new Chain();

	typeThree.productID = 3;
	typeThree.material = "Brass";
	typeThree.productPrice = 1000;

	typeThree.chainDetails();
	System.out.println("Chain ID is" + " " + typeThree.productID);
	System.out.println("Chain material is" + " " + typeThree.material );
	System.out.println("Price of Chain is" + " " + typeThree.productPrice);

	
	System.out.println("----------------------------->>>>");
	
	Chain typeFour = new Chain();

	typeFour.productID = 4;
	typeFour.material = "Platinum";
	typeFour.productPrice = 80000;

	typeFour.chainDetails();
	System.out.println("Chain ID is" + " " + typeFour.productID);
	System.out.println("Chain material is" + " " + typeFour.material );
	System.out.println("Price of Chain is" + " " + typeFour.productPrice);

	
	System.out.println("----------------------------->>>>");
	
	Chain typeFive = new Chain();

	typeFive.productID = 5;
	typeFive.material = "Titanium";
	typeFive.productPrice = 2000;

	typeFive.chainDetails();
	System.out.println("Chain ID is" + " " + typeFive.productID);
	System.out.println("Chain material is" + " " + typeFive.material );
	System.out.println("Price of Chain is" + " " + typeFive.productPrice);

	
	System.out.println("----------------------------->>>>");
	


}

}