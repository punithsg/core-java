class Factorial {
 
 public static void main(String Punith[]){
	 System.out.println("main started");
 getFact(3);
 getFact(6);
 getFact(4);
 System.out.println("main ended");
 }
 
// methods
 public static void getFact(int factNumber){
	 System.out.println("getFact started");
	int fact=1;
	for( int n=1 ; n<=factNumber  ; n++ ){
			fact= fact * n ;
	}
	
	System.out.println(" The factorial of " + factNumber + " is " + fact );
	System.out.println("getFact ended");
}

}