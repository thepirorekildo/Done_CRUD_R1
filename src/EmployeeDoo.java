import java.sql.*;
import java.util.ArrayList;
import java.util.*;


public class EmployeeDoo {
      
      public static void createEmployee(Employee emp) throws SQLException{
            Connection conn =  DB.connect();
            String query = Query.insert;
            PreparedStatement s = conn.prepareStatement(query);
            
            s.setInt(1,emp.getID());
            s.setString(2,emp.getName());
            s.setString(3,emp.getEmail());
            s.setString(4,emp.getPassword());

            int n = s.executeUpdate();
            System.out.println(" ############# ------------- ###############");

            System.out.println("Inserted " + n + " row Succesfully");

      }


      public static ArrayList<Employee> readAllEmployee() throws SQLException{
            
            ArrayList<Employee> arr = new ArrayList<>();
            Connection  conn = DB.connect();

            String query = Query.read;
            PreparedStatement s = conn.prepareStatement(query);
            ResultSet res = s.executeQuery();

            while(res.next()){
                  Employee emp = new  Employee(res.getInt(1), res.getString(2), res.getString(3), res.getString(4));
                  arr.add(emp);
            }
            System.out.println(" ############# ------------- ###############");

            return arr;
      }


      public static void updateEmployee(int id, String name) throws SQLException{
            Connection  conn = DB.connect();
            String query = Query.update;
            // 1 - name , 2- id
            PreparedStatement s = conn.prepareStatement(query);
            s.setString(1, name);
            s.setInt(2,id);
            int n = s.executeUpdate();
            System.out.println(" ############# ------------- ###############");

            System.out.println(n + " row updated Succesfully");
      }


      public static void deleteEmployee(int id) throws SQLException{
            Connection  conn = DB.connect();
            String query = Query.delete;
            PreparedStatement s = conn.prepareStatement(query);
            s.setInt(1, id);
            int n = s.executeUpdate();
            System.out.println(" ############# ------------- ###############");

            System.out.println(n + " row deleted Succesfully");
      }


}
