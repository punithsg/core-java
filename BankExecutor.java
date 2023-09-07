class BankExecutor{
	
	public static void main(String args[]){
		
		Bank bank = new Bank();
		
		bank.setBankId(1);
		bank.setName("Karnataka Bank");
		bank.setBranchName("S S puram");
		bank.setManagerName("Ramesh");
		bank.setIfscCode("KARB0000757");
		bank.setEmail("karnatakabank@gmail.in");
		
		System.out.println("The Bank Id Is:  " + bank.getBankId());
		System.out.println("The Bank Name Is:  " + bank.getName());
		System.out.println("Branch Name Is:  "  + bank.getBranchName());
		System.out.println("Manager Name Is:  " + bank.getManagerName());
		System.out.println("IFSC Code Is:  " + bank.getIfscCode());
		System.out.println("The Bank Email Is: " + bank.getEmail());
	}
	
}
