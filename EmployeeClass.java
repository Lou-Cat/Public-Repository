//************************************************************************
//*     @author     Lou XXX                                                
//*     Date        12/4/2022
//*     Purpose     a class named Employee that keeps the following information in fields
//*                  Employee name
//*                  Employee number in the format XXX–L, where each X is a digit within 
//*                  the range 0–9 and the L is a letter within the range A–M.
//*                  Hire date
//************************************************************************
public class EmployeeClass 
{
	                                                                                    //private attributes to store name, number and hiring date in string format
   private String name;
   private String employeeNo;
   private String date;
	                                                                                    //parameterized constructor
   public EmployeeClass(String name, String employeeNo, String date) 
   {
      this.name = name;
      this.employeeNo = employeeNo;
      this.date = date;
   }  //ends public EmployeeClass
	                                                                                    //Getter for name
   public String getName() 
   {
      return name;
   }  //ends getName
	                                                                                    //setter for name
   public void setName(String name) 
   {
      this.name = name;
   }  //ends getName
	                                                                                    //getter for employee number
   public String getEmployeeNo() 
   {
      return employeeNo;
   }  //ends setName
	                                                                                    //setter for employee number
   public void setEmployeeNo(String employeeNo) 
   {
      this.employeeNo = employeeNo;
   }  //ends setEmployeeNo
	                                                                                    //getter for date
   public String getDate() 
   {
      return date;
   }  //end getDate
	                                                                                    //setter for date
   public void setDate(String date) 
   {
      this.date = date;
   }  //end setDate
}  //ends class EmployeeClass 