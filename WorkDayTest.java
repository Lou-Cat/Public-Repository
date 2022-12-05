//************************************************************************
//*     @author     Lou XXX                                                
//*     Date        12/4/2022
//*     Purpose     Outputs information called from employee class and production worker extended class
//************************************************************************
public class WorkDayTest 
{
   public static void main(String[] args) 
   {
      ProductionWorkerExt p1=
      new ProductionWorkerExt("Jack", "123B", "12-Aug-2020", 1, 12);                   // creating object from the productionworker class
      ProductionWorkerExt p2= 
      new ProductionWorkerExt("Rebecca", "345A", "02-Dec-2018", 2, 15.5);              // creating second from the productionworker class
   	
   	System.out.printf("Name of first employee: "+p1.getName());                                     // display name of first employee
      System.out.printf("%nShift of first employee: "+p1.getShift());                                 // display shift of first employee
      System.out.printf("%nHourly pay rate of first employee: $"+p1.getRate()+"%n");                  // display rate of first employee
      System.out.printf("%nName of second employee: "+p2.getName());                                  // display name of second employee
      System.out.printf("%nShift of second employee: "+p2.getShift());                                // display shift of second employee
      System.out.printf("%nHourly pay rate of second employee: $"+p2.getRate());                      // display rate of second employee
   }
}