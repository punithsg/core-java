class Television {
	static boolean isConnected;
	static int minVolume;
	static int maxVolume = 5;
	static int currentVolume ;
	public static boolean onOroff(){
	
		if(isConnected == false){
			isConnected = true;
			System.out.println("The speaker is Turned on...");
		}else if(isConnected == true){
			isConnected = false;
			System.out.println("The speaker is Turned off...");
		}
		
		return isConnected;
}
	public static void increaseVolume(){
	
		if(isConnected == true){
			if(currentVolume < maxVolume){
				currentVolume = currentVolume +1 ;
				System.out.println("The current volume is "+ currentVolume);
			}
			else{
				System.out.println("Max volume is reached");
				}
		}else{
			System.out.println("Turn on the speaker");
		}
	
	}
	public static void decreaseVolume(){
	
		if(isConnected == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume -1 ;
				System.out.println("The current volume is "+ currentVolume);
			}
			else{
				System.out.println("Min volume is reached");
			
				}
		}else{
			System.out.println("Turn on the speaker");
		}
	
	}
	
}