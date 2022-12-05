//************************************************************************
//*     @author     Lou XXX                                                
//*     Date        12/4/2022
//*     Purpose     a class that extends the Employee class that has fields to hold:
//*                  Shift
//*                  Hourly pay rate
//************************************************************************
public class ProductionWorkerExt extends EmployeeClass 
{
	                                                                                                                  //attributes to store shift number and hourly pay rate
   private int shift;
   private double rate;
	                                                                                                                  //parameterized constructor
   public ProductionWorkerExt(String name, String employeeNo, String date, int shift, double rate) 
   {
   	                                                                                                               //calling parent class Employee constructor
      super(name, employeeNo, date);
      this.shift = shift;
      this.rate = rate;
   }  //end public ProductionWorkerExt
	                                                                                                                  //getter for shift
   public int getShift() 
   {
      return shift;
   }  //end getShift
	                                                                                                                  //setter for shift
   public void setShift(int shift) 
   {
      this.shift = shift;
   }  //end setShift
	                                                                                                                  //getter for rate
   public double getRate() 
   {
      return rate;
   }  //end getRate
	                                                                                                                  //setter for rate
   public void setRate(double rate) 
   {
      this.rate = rate;
   }  //end setRate
}  //end class ProductionWorkerExt
