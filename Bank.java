class Bank{

  private int BankId;
  private String name;
  private String branchName;
  private String managerName;
  private String ifscCode;
  private String email;
  
  
  public void setBankId(int BankId){
	  this.BankId=BankId;
  }
  
  public int getBankId(){
	  return BankId;
  }
  
  public void setName(String name){
	  this.name=name;
  }
  
  public String getName(){
	  return name;
  }
 
  public void setBranchName(String branchName){
	  this.branchName=branchName;
  }
  
  public String getBranchName(){
	  return branchName;
  }
  
  public void setManagerName(String managerName){
	  this.managerName=managerName;
  }
  
  public String getManagerName(){
	  return managerName;
  }
  
  public void setIfscCode(String ifscCode){
	  this.ifscCode=ifscCode;
  }
  
  public String getIfscCode(){
	  return ifscCode;
  }
 
public void setEmail(String email){
	 this.email=email;
 }
 
 public String getEmail(){
	 return email;
 }

}