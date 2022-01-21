package javaapplication2;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertTableP extends javax.swing.JFrame 
{
 private MyDBConnection mdbc;
 private java.sql.Statement stmt;
 private EditDialogP dlg;
         
 public InsertTableP() 
 {
     dlg =  new EditDialogP(this, true);
     try {
         mdbc = new MyDBConnection();
         mdbc.init();
         Connection conn = mdbc.getMyConnection();
         stmt = conn.createStatement();
         //initComponents();
     } catch (/*SQLException ex*/Exception e) {
         //Logger.getLogger(InsertTableP.class.getName()).log(Level.SEVERE, null, ex);
     }
     
     initComponents();
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        SurnameLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        PatronymicLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        SurnameField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        DateField = new javax.swing.JTextField();
        SendButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientTable = new javax.swing.JTable();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        PatronymicField = new javax.swing.JTextField();
        DiagnosisLabel = new javax.swing.JLabel();
        DiagnosisField = new javax.swing.JTextField();
        CommentLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        menu = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        SurnameLabel.setText("Surname");

        NameLabel.setText("NameP");

        PatronymicLabel.setText("Patronymic");

        DateLabel.setText("Date_of_birth");

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        DateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateFieldActionPerformed(evt);
            }
        });

        SendButton.setText("Send");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        ResultSet rs =getResultFromPatient();
        PatientTable.setModel(new TableModelP(rs));
        PatientTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        mdbc.close(rs);
        PatientTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PatientTableMouseClicked(evt);
            }
        });
        PatientTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PatientTableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(PatientTable);
        PatientTable.getAccessibleContext().setAccessibleName("");

        EditButton.setText("Edit");
        EditButton.setEnabled(false);
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.setEnabled(false);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        PatronymicField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatronymicFieldActionPerformed(evt);
            }
        });

        DiagnosisLabel.setText("Diagnosis");

        CommentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CommentLabel.setText("Click the button to send data");

        IDLabel.setText("ID");

        menu.setText("В меню");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CommentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SurnameLabel)
                    .addComponent(NameLabel)
                    .addComponent(PatronymicLabel)
                    .addComponent(DateLabel)
                    .addComponent(DiagnosisLabel)
                    .addComponent(IDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SurnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(NameField))
                        .addComponent(DiagnosisField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatronymicField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NameLabel)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatronymicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatronymicLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateLabel)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiagnosisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiagnosisLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SendButton)
                .addGap(18, 18, 18)
                .addComponent(CommentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu))
                .addGap(71, 71, 71))
        );

        NameLabel.getAccessibleContext().setAccessibleName("Name");

        setSize(new java.awt.Dimension(416, 902));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String quotate(String content)
    {
     return "'" + content + "'";
    }
    
    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
       String ID = IDField.getText();
       String Surname = SurnameField.getText();
       String Name = NameField.getText();
       String Patronymic = PatronymicField.getText();
       String Date = DateField.getText();
       String Diagnosis = DiagnosisField.getText();
       String insertStr = "";
       try
       {
        insertStr = "INSERT INTO patient VALUES ('"
                    + ID + "','"
                    + Surname + "','"
                    + Name + "','"
                    + Patronymic + "','"
                    + Date + "','"
                    + Diagnosis + "')";
                System.out.println(insertStr);
            stmt.executeUpdate(insertStr);
        CommentLabel.setText("1 row inserted");
        getContentPane().removeAll();
        initComponents();
       }
       catch(Exception e)
       {
        CommentLabel.setText("Error occured in inserting data");
       }
    }//GEN-LAST:event_SendButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try 
        {
         mdbc.close(stmt.getResultSet());
         mdbc.destroy();
        } 
        catch (SQLException ex){}
    }//GEN-LAST:event_formWindowClosing

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
            dlg.setID((String)PatientTable.getValueAt(PatientTable.getSelectedRow(), 0));
            dlg.setSurname((String)PatientTable.getValueAt(PatientTable.getSelectedRow(), 1));
            dlg.setName((String)PatientTable.getValueAt(PatientTable.getSelectedRow(), 2));
            dlg.setPatronymic((String)PatientTable.getValueAt(PatientTable.getSelectedRow(), 3));
            dlg.setDate_of_birth((String)PatientTable.getValueAt(PatientTable.getSelectedRow(), 4));
            dlg.setDiagnosis((String)PatientTable.getValueAt(PatientTable.getSelectedRow(), 5));
            dlg.setVisible(true);
            try
            {
              String insertStr = "UPDATE patient SET ID='" + dlg.getID() + "', "
                    + "Surname='" + dlg.getSurname() + "', "
                    + "Name_M='" + dlg.getNameM() + "', "
                    + "Patronymic='" + dlg.getPatronymic() + "', "
                    + "Date_of_birth='" + dlg.getDate_of_birth() + "', "
                    + "Diagnosis='" + dlg.getDiagnosis() + "' "
                    + "WHERE ID ='" + (String) PatientTable.getValueAt(PatientTable.getSelectedRow(), 0)+"'";
            System.out.println(insertStr);
            stmt.executeUpdate(insertStr);
             getContentPane().removeAll();
             initComponents();
            }
            catch(Exception e)
            {
             System.out.println("Error occured in editing data");
            }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        System.out.println("111");
        String CarID = (String) PatientTable.getValueAt(PatientTable.getSelectedRow(), 0);
        System.out.println("222");
        try
        {
            System.out.println("333");
            String insertStr1 = "DELETE FROM patient WHERE ID='" + CarID + "'";
            System.out.println("4444");
            System.out.println(insertStr1);
            int done = stmt.executeUpdate(insertStr1);
            System.out.println("5555");
            System.out.println(insertStr1);
            CommentLabel.setText("1 row deleted");
            getContentPane().removeAll();
            initComponents();
        } catch (Exception e) {
            CommentLabel.setText("Error occured in deleting data");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void PatientTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PatientTableComponentShown
           // TODO add your handling code here:
    }//GEN-LAST:event_PatientTableComponentShown

    private void PatientTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PatientTableMouseClicked
    if(PatientTable.getSelectedRowCount() > 0)
    {
     EditButton.setEnabled(true);
     DeleteButton.setEnabled(true);
    }
    else
    {
     EditButton.setEnabled(false);
     DeleteButton.setEnabled(false);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientTableMouseClicked

    private void PatronymicFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatronymicFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatronymicFieldActionPerformed

    private void DateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateFieldActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ChoosePerson choose = new ChoosePerson();
        choose.setVisible(true);
        choose.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuActionPerformed

    public ResultSet getResultFromPatient()
    {
     ResultSet rs = null;
     try
     {
      rs = stmt.executeQuery("SELECT * FROM patient");
     }
     catch(SQLException e){}
     return rs;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommentLabel;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField DiagnosisField;
    private javax.swing.JLabel DiagnosisLabel;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTable PatientTable;
    private javax.swing.JTextField PatronymicField;
    private javax.swing.JLabel PatronymicLabel;
    private javax.swing.JButton SendButton;
    private javax.swing.JTextField SurnameField;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
