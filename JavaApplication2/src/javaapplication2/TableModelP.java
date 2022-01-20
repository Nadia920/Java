package javaapplication2;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableModelP extends AbstractTableModel
{
 private int colnum=6;
 private int rownum;
 
 private String[] colNames = 
 {
   "ID", "Surname","Name_M","Patronymic","Date_of_birth", "Diagnosis"
 };
 
 private  ArrayList<String[]> ResultSets;
    
 public TableModelP(ResultSet rs) 
 {
  ResultSets=new ArrayList<>();  
  try
  {
   while(rs.next())
   {
    String[] row = 
    {
     rs.getString("ID"), rs.getString("Surname"),
     rs.getString("Name_M"), rs.getString("Patronymic"),
     rs.getString("Date_of_birth"), rs.getString("Diagnosis")
    };
    ResultSets.add(row);
   }   
  }
  catch(Exception e)
  {
   System.out.println("Exception in ТableModelP");
  }
 }
   
 @Override
 public Object getValueAt(int rowindex, int columnindex) 
 {
  String[] row = ResultSets.get(rowindex);
  return row[columnindex];
 }

 @Override
 public int getRowCount() 
 {
  return ResultSets.size();
 }

 @Override
 public int getColumnCount() 
 {
  return colnum;
 }

 @Override
 public String getColumnName(int param)
 {
  return colNames[param];
 }
}