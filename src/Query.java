public class Query {
      static String insert = "insert into student (id, name, email, password) values (?,?,?,?)";
      static String read = "select * from student";
      static String update = "update student set name = ? where id = ?";
      static String delete = "delete from student where id = ?";
}
