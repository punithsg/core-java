class SensorExecutor{

public static void main(String Sensing[]){

	Sensor typeOne = new Sensor();

	typeOne.sensorID = 1;
	typeOne.sensorName = "UltraSonic Sensor";
	typeOne.property = "Find distance";

	typeOne.sense();
	System.out.println("Sensor ID is" + " " + typeOne.sensorID);
	System.out.println("Sensor Nmae is" + " " + typeOne.sensorName );
	System.out.println("Property of Sensor is" + " " + typeOne.property);

	
	System.out.println("----------------------------->>>>");
	
	Sensor typeTwo = new Sensor();

	typeTwo.sensorID = 2;
	typeTwo.sensorName = "Pressure Sensor";
	typeTwo.property = "Find pressure";

	typeTwo.sense();
	System.out.println("Sensor ID is" + " " + typeTwo.sensorID);
	System.out.println("Sensor Nmae is" + " " + typeTwo.sensorName );
	System.out.println("Property of Sensor is" + " " + typeTwo.property);

	
	System.out.println("----------------------------->>>>");
	
	Sensor typeThree = new Sensor();

	typeThree.sensorID = 3;
	typeThree.sensorName = "Temperature sensor";
	typeThree.property = "Find temperature";

	typeThree.sense();
	System.out.println("Sensor ID is" + " " + typeThree.sensorID);
	System.out.println("Sensor Nmae is" + " " + typeThree.sensorName );
	System.out.println("Property of Sensor is" + " " + typeThree.property);

	
	System.out.println("----------------------------->>>>");
	
	
	Sensor typeFour = new Sensor();

	typeFour.sensorID = 4;
	typeFour.sensorName = "Speed Sensor";
	typeFour.property = "Find Speed";

	typeTwo.sense();
	System.out.println("Sensor ID is" + " " + typeFour.sensorID);
	System.out.println("Sensor Nmae is" + " " + typeFour.sensorName );
	System.out.println("Property of Sensor is" + " " + typeFour.property);

	
	System.out.println("----------------------------->>>>");
	
		
	Sensor typeFive = new Sensor();

	typeFive.sensorID = 5;
	typeFive.sensorName = "Position Sensor";
	typeFive.property = "Find Position";

	typeFive.sense();
	System.out.println("Sensor ID is" + " " + typeFive.sensorID);
	System.out.println("Sensor Nmae is" + " " + typeFive.sensorName );
	System.out.println("Property of Sensor is" + " " + typeFive.property);

	
	System.out.println("----------------------------->>>>");


}
}