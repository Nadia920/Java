package javaapplication2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLApplication 
{
 public static void main(String[] args) 
 {
  java.awt.EventQueue.invokeLater(new Runnable() 
  {
   public void run() 
   {
    try
    {
     new ChoosePerson().setVisible(true);
    }
    catch(Exception e){
         Logger.getLogger(InsertTableP.class.getName()).log(Level.SEVERE, null, e);
    }
   }
  });   
 }
}
