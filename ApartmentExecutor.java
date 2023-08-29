class ApartmentExecutor{

	public static void main(String building[]){
		// creating copy of a class // OBJECT
		// className variableName = new className(); 
		// refVariable.variableName=value;
		
		
		Apartment apartment = new Apartment();
		
		apartment.apartmentName = "Brigade";
		apartment.apartmentID = 1;
		apartment.location = "Hebbala";
		apartment.noOfFloors = 25;
		apartment.noOfTwoBhkFlats = 6;
		apartment.noOfThreeBhkFlats = 4;
		
		//refVariable.methodname();
		
		apartment.provideAccomodation();
		System.out.println("The name of the apartment is " +" "+ apartment.apartmentName);
		System.out.println("The ID of the apartment is " +" "+ apartment.apartmentID);
		System.out.println("The loaction is " +" "+ apartment.location );
		System.out.println("Toatl floors are " +" "+ apartment.noOfFloors);
		System.out.println("Total number of two BHK flats are " +" "+ apartment.noOfTwoBhkFlats);
		System.out.println("Total number of three BHK flats are " +" "+ apartment.noOfThreeBhkFlats);
		
		System.out.println(" ");
		
		Apartment aptmt = new Apartment();
		
		aptmt.apartmentName = "Prestige";
		aptmt.apartmentID = 2;
		aptmt.location = "RT nagar";
		aptmt.noOfFloors = 30;
		aptmt.noOfTwoBhkFlats = 10;
		aptmt.noOfThreeBhkFlats = 5;
		
		
		apartment.provideAccomodation();
		System.out.println("The name of the apartment is " +" "+ aptmt.apartmentName);
		System.out.println("The ID of the apartment is " +" "+ aptmt.apartmentID);
		System.out.println("The loaction is " +" "+ aptmt.location );
		System.out.println("Toatl floors are " +" "+ aptmt.noOfFloors);
		System.out.println("Total number of two BHK flats are " +" "+ aptmt.noOfTwoBhkFlats);
		System.out.println("Total number of three BHK flats are " +" "+ aptmt.noOfThreeBhkFlats);
		
		System.out.println(" ");
		
		Apartment ApartmentOne = new Apartment();
		
		ApartmentOne.apartmentName = "Prestige";
		ApartmentOne.apartmentID = 3;
		ApartmentOne.location = "Rajajinagar";
		ApartmentOne.noOfFloors = 35;
		ApartmentOne.noOfTwoBhkFlats = 15;
		ApartmentOne.noOfThreeBhkFlats = 10;
		
		
		apartment.provideAccomodation();
		System.out.println("The name of the apartment is " +" "+ ApartmentOne.apartmentName);
		System.out.println("The ID of the apartment is " +" "+ ApartmentOne.apartmentID);
		System.out.println("The loaction is " +" "+ ApartmentOne.location );
		System.out.println("Toatl floors are " +" "+ ApartmentOne.noOfFloors);
		System.out.println("Total number of two BHK flats are " +" "+ ApartmentOne.noOfTwoBhkFlats);
		System.out.println("Total number of three BHK flats are " +" "+ ApartmentOne.noOfThreeBhkFlats);	

		System.out.println(" ");
		
		Apartment ApartmentTwo = new Apartment();
		
		ApartmentTwo.apartmentName = "BlueJay";
		ApartmentTwo.apartmentID = 3;
		ApartmentTwo.location = "Peenya";
		ApartmentTwo.noOfFloors =40;
		ApartmentTwo.noOfTwoBhkFlats = 20;
		ApartmentTwo.noOfThreeBhkFlats = 10;
		
		
		apartment.provideAccomodation();
		System.out.println("The name of the apartment is " +" "+ ApartmentTwo.apartmentName);
		System.out.println("The ID of the apartment is " +" "+ ApartmentTwo.apartmentID);
		System.out.println("The loaction is " +" "+ ApartmentTwo.location );
		System.out.println("Toatl floors are " +" "+ ApartmentTwo.noOfFloors);
		System.out.println("Total number of two BHK flats are " +" "+ ApartmentTwo.noOfTwoBhkFlats);
		System.out.println("Total number of three BHK flats are " +" "+ ApartmentTwo.noOfThreeBhkFlats);	
		
		System.out.println(" ");
		
		Apartment ApartmentThree = new Apartment();
		
		ApartmentThree.apartmentName = "Karle";
		ApartmentThree.apartmentID = 3;
		ApartmentThree.location = "Nagawara";
		ApartmentThree.noOfFloors = 45;
		ApartmentThree.noOfTwoBhkFlats = 5;
		ApartmentThree.noOfThreeBhkFlats = 5;
		
		
		apartment.provideAccomodation();
		System.out.println("The name of the apartment is " +" "+ ApartmentThree.apartmentName);
		System.out.println("The ID of the apartment is " +" "+ ApartmentThree.apartmentID);
		System.out.println("The loaction is " +" "+ ApartmentThree.location );
		System.out.println("Toatl floors are " +" "+ ApartmentThree.noOfFloors);
		System.out.println("Total number of two BHK flats are " +" "+ ApartmentThree.noOfTwoBhkFlats);
		System.out.println("Total number of three BHK flats are " +" "+ ApartmentThree.noOfThreeBhkFlats);	
	}
}

