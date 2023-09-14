
import java.sql.SQLException;
import java.util.*;

public class App {
      public static void main(String[] args) throws SQLException{
            
            Scanner sc = new Scanner(System.in);
            
            int id;
            String name, email, password;
            while(true){

                  System.out.println("Enter your choice -------------------- ");
                  System.out.println("1. Create");
                  System.out.println("2. Read");
                  System.out.println("3. Update");
                  System.out.println("4. Delete");
                  int choice = sc.nextInt();
                  if(choice < 1 || choice > 4) break;

                  switch(choice){
                        case 1 :
                              System.out.println("\nEnter ID, NAME, EMAIL, PASSWORD");
                              id = sc.nextInt();
                              sc.nextLine();
                              name = sc.nextLine();
                              email = sc.nextLine();
                              password = sc.nextLine();
                              Employee emp = new Employee(id, name, email, password);
                              EmployeeDoo.createEmployee(emp);
                              System.out.println();
                              break;

                        case 2 : 
                              System.out.println("\nFollowing is your student table data : ------------- ");
                              ArrayList<Employee> arr = EmployeeDoo.readAllEmployee();

                              for(Employee e : arr){
                                    System.out.println(e);
                              }
                              System.out.println();
                              break;

                        case 3 : 
                              System.out.println("\nFor updating enter id and name for which you want to change the name -----");
                              id = sc.nextInt();
                              sc.nextLine();
                              name = sc.nextLine();
                              EmployeeDoo.updateEmployee(id,name);
                              System.out.println();
                              break;

                        case 4 : 
                              System.out.println("\nEnter ID you want to delete : ------------------");
                              id = sc.nextInt();
                              EmployeeDoo.deleteEmployee(id);
                              System.out.println();
                              break;

                  }//end of switch case
            }//end of while loop
      }
}
