package anudip_day_13lab;

import java.sql.*;
/***
 * @author Shubham Kumar
 */
//class for establish connection with DB
class Conn{
    Connection conn=null;
    String url="jdbc:mysql://localhost:3306/employess";
    String user="root";
    String password="shubham@123";
    Conn(){
        try { 
            conn=DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    public Connection getConnection(){
        
        return conn;
    }
}
//class for Table creation on DB
class DBOperation{
    Connection conn=new Conn().getConnection();
    //This method will create table in DB
    public void createTable(){
        String queary="create table if not exists Emp(eid INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(100) NOT NULL,address VARCHAR(255) NOT NULL,salary INT NOT NULL)";
        try{
            Statement statement=conn.createStatement();
            statement.execute(queary);
            System.out.println("Table Create successfully");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void insertData(){
       try{
           String q1="insert into emp value(0,'Shubham','Greater Noids',25000)";
           String q2="insert into emp value(0,'Rahul','Greater Noids',25000)";
           String q3="insert into emp value(0,'Roshan','Greater Noids',25000)";
           Statement statement=conn.createStatement();
           statement.execute(q1);
           statement.execute(q2);
           statement.execute(q3);
       }catch(SQLException e){
           System.out.println(e);
       }
    }
    //this table will be show data from table
    public void showDetails(){
        try {
            PreparedStatement ps=conn.prepareStatement("select * from emp");
            ResultSet rs=ps.executeQuery();
            System.out.println("E ID\tE Name\t\tE Address\tE Salary");
            while(rs.next()){
                System.out.println(rs.getInt("eid")+"\t"+rs.getString("name")+"\t\t"+rs.getString("address")+"\t"+rs.getInt("salary"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
public class Anudip_Day_13Lab {
    public static void main(String[] args) {
        //Operation's over the DBOperation 
        DBOperation db=new DBOperation();
        db.createTable();
        db.insertData();
        db.showDetails();
    }  
}
