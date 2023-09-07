class PatientExecutor{

 public  static void main ( String details[]){
 
 Patient patient =new Patient();
 
 patient.setPatientId(1);
 System.out.println("the patient id is " + patient.getPatientId());
 
 patient.setPatientName("Punith");
 System.out.println("the patient name is " + patient.getPatientName());
 
 patient.setHospitalName("District hospital");
 System.out.println("the Hospital name is " + patient.getHospitalName());
 
 patient.setPatientAddress("Tumkur");
 System.out.println("the patient address is " + patient.getPatientAddress());
 
 patient.setAdmittedDate("01-08-23");
 System.out.println("the patient admitted date is " + patient.getAdmittedDate());
 
 patient.setAge("21 yrs");
 System.out.println("the patient age is " + patient.getAge());
 
patient.setWardNo(5);
 System.out.println("the patient wardno is " + patient.getWardNo());
  

 }
}
