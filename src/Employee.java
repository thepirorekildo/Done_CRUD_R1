
public class Employee {
      int id;
      String name, email, password;

      Employee(int id, String name, String email, String password){
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
      }

      public int getID(){ return id; }
      public String getName() { return name;}
      public String getEmail(){ return email;}
      public String getPassword(){ return password;}

      public String toString(){
            return "Employee [ id : " + id + " , name : " + name + ", email : " + email + ", password : " + password + " ]";
      }
}
