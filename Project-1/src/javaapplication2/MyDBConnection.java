package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDBConnection
{
 private Connection myConnection;
 
 public MyDBConnection(){}
 
 public void init()
 {
  try
  {
   Class.forName("com.mysql.cj.jdbc.Driver");
   myConnection = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "Nadja_1008");
  }
  catch(ClassNotFoundException | SQLException e)
  {
   System.out.println(e);
  }
 }
 
 public void close(ResultSet rs)
 {
  if(rs != null)
  {
   try
   {
    rs.close();
   }
   catch(Exception e){}
  }
 }
 
 public Connection getMyConnection()
 {
  return myConnection;
 }
 
 public void destroy()
 {
  if(myConnection != null)  
  {
   try
   {
    myConnection.close();
   }
   catch(Exception e){}
  }
 }
}