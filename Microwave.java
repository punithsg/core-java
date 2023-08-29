class Microwave {
	static boolean isConnected;
	static int minTemp;
	static int maxTemp = 5;
	static int currentTemp;
	public static boolean onOroff();{
		if(isConnected == false){
			isConnected = true;
			System.out.println("The Microwave is Turned on...");
		}else if(isConnected == true){
			isConnected = false;
			System.out.println("The Microwave is Turned off...");
		}
	return isConnected;
	
	}
 public static void increaseTemp(){
		if(isConnected == true){
			if(currentTemp < maxTemp){
				currentTemp = currentTemp +1 ;
				System.out.println("The current Temperature is "+ currentTemp);
			}
			else{
				System.out.println("Max Temperature is reached");
				}
		}else{
			System.out.println("Turn on the Microwave");
	}
	}
	public static void decreaseTemperature(){
	
		if(isConnected == true){
			if(currentTemp > minTemp){
				currentTemp = currentTemp -1 ;
				System.out.println("The current Temperature is "+ currentTemp);
			}
			else{
				System.out.println("Min Temperature is reached");
			
				}
		}else{
		System.out.println("Turn on the Microwave");
	}
	
	}
}

