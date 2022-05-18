import java.sql.SQLOutput;

public final class Employee {
     final String adharNumber;
      public Employee(String adharnumber){
          this.adharNumber=adharnumber;
      }

 public String getAdharnumber(){
    return adharNumber;
 }
}
   class Immutable{
    public static void main(String[] args){
        Employee e=new Employee("HFDGFH12345");
        String S1=e.getAdharnumber();
        System.out.println("adharNumber=" +S1);

    }
 }
