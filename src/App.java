package Practice_CRUD;

import java.util.*;

public class App {
      public static void main(String[] args) {
            System.out.println("Enter your choice -------------------- ");
            System.out.println("1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            int id;
            String name, email, password;
            while(true){

                  if(choice < 1 || choice > 4) break;

                  switch(choice){
                        case 1 :
                              System.out.println("Enter ID, NAME, EMAIL, PASSWORD");
                              id = sc.nextInt();
                              sc.nextLine();
                              name = sc.nextLine();
                              email = sc.nextLine();
                              password = sc.nextLine();
                              Employee emp = new Employee(id, name, email, password);
                              EmployeeDoo.createEmployee(emp);
                              break;

                        case 2 : 
                              break;

                        case 3 : 
                              break;

                        case 4 : 
                              break;

                  }//end of switch case
            }//end of while loop
      }
}
