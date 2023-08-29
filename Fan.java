class Fan {
	static boolean isConnected;
	static int minSpeed;
	static int maxSpeed = 5;
	static int currentSpeed ;
	public static boolean onOroff(){
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("The fan is Turned on...");
		}else if(isConnected == true){
			isConnected = false;
			System.out.println("The fan is Turned off...");
		}
		
		return isConnected;
}
	public static void increaseSpeed(){
	
		if(isConnected == true){
			if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed +1 ;
				System.out.println("The current speed is "+ currentSpeed);
			}
			else{
				System.out.println("Max speed is reached");
				}
		}else{
			System.out.println("Turn on the fan");
	
	}
	public static void decreaseSpeed(){
	
		if(isConnected == true){
			if(currentSpeed > minSpeed){
				currentSpeed = currentSpeed -1 ;
				System.out.println("The current speed is "+ currentSpeed);
			}
			else{
				System.out.println("Min speed is reached");
			
				}
		}else{
			System.out.println("Turn on the fan");
	}
	
	}
	
}