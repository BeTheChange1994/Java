// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class ShortPayrollTest 
{
   public static void main( String args[] ) 
   {
      // create subclass objects
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00 );
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee( "Karen", "Price", "222-22-2222", 16.75, 40 );
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee( 
         "Sue", "Jones", "333-33-3333", 10000, .06 );
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee( 
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );

      System.out.println( "Processing employees individually:\n" );
      
      System.out.printf( "%s\n earned: $%,.2f\n\n", 
         salariedEmployee, salariedEmployee.earnings() );
      System.out.printf( "%s\n earned: $%,.2f\n\n",
         hourlyEmployee, hourlyEmployee.earnings() );
      System.out.printf( "%s\n earned: $%,.2f\n\n",
         commissionEmployee, commissionEmployee.earnings() );
      System.out.printf( "%s\n earned: $%,.2f\n\n", 
         basePlusCommissionEmployee, 
         basePlusCommissionEmployee.earnings() );

      // create four-element Employee array
      Employee employees[] = new Employee[4]; 

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee; 
      employees[3] = basePlusCommissionEmployee;

      System.out.println( "Processing employees polymorphically:\n" );
      
      // generically process each element in employees array:
      // appropriate versions of toString() and earnings() will be called each time
      for (int i=0; i<employees.length; i++) 
      {
         System.out.println(employees[i]); // invokes toString

         System.out.printf( 
            "earned $%,.2f\n\n", employees[i].earnings() );
      } 
   } 
}

