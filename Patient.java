public class Patient{

	private int patientId;
	private String hospitalName;
	private String name;
	private int age;
	private String diseaseName;
	private int wardNo;
	private String admittedDate;
	private String patientAddress;
	
	public void setPatientId(int patientId){
		this.patientId = patientId;
	}
	
	public int getPatientId(){
		return patientId;
	}
	
	public void setHostipalName(){
		this.hospitalName = hospitalName;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setPatientAddress(){
		this.patientAddress = patientAddress;
	}
	
	public String getPatientAddress(){
		return patientAddress;
	}

	
	public void setDiseaseNmame(String diseaseName){
		this.diseaseName = diseaseName;
	}
	
	public String getDiseaseNmame(){
		return diseaseName;
	}
	
	public void SetWardNo(int wardNo){
		this.wardNo = wardNo;
	}
	
	public int getWardNo(){
		return wardNo;
	}
	
	public void setAdmittedDate(){
		this.admittedDate = admittedDate;
	}
	
	public String getAdmittedDate(){
		return admittedDate;
	}


}