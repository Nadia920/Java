package javaapplication2;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertTableD extends javax.swing.JFrame {

    private MyDBConnection mdbc;
    private java.sql.Statement stmt;
    private EditDialogD dlg;

    public InsertTableD() {
        dlg = new EditDialogD(this, true);
        try {
            mdbc = new MyDBConnection();
            mdbc.init();
            Connection conn = mdbc.getMyConnection();
            stmt = conn.createStatement();
        } catch (Exception e) {
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
        CommentLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        PatronymicField = new javax.swing.JTextField();
        PositionLabel = new javax.swing.JLabel();
        SpecLabel = new javax.swing.JLabel();
        SpecField = new javax.swing.JTextField();
        PositionField = new javax.swing.JTextField();
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

        NameLabel.setText("Name");

        PatronymicLabel.setText("Patronymic");

        DateLabel.setText("Date_of_birth");

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        SendButton.setText("Send");
        SendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendButtonActionPerformed(evt);
            }
        });

        CommentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CommentLabel.setText("Click the button to send data");

        ResultSet rs =getResultFromDoctor();
        DoctorTable.setModel(new TableModelD(rs));
        DoctorTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        mdbc.close(rs);
        DoctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorTableMouseClicked(evt);
            }
        });
        DoctorTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                DoctorTableComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(DoctorTable);

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

        PositionLabel.setText("PositionD");

        SpecLabel.setText("Specialization");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(CommentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SurnameLabel)
                    .addComponent(NameLabel)
                    .addComponent(PatronymicLabel)
                    .addComponent(DateLabel)
                    .addComponent(PositionLabel)
                    .addComponent(SpecLabel)
                    .addComponent(IDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SurnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(NameField)
                    .addComponent(DateField)
                    .addComponent(PatronymicField)
                    .addComponent(PositionField)
                    .addComponent(SpecField, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(IDField))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SurnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SurnameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PatronymicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PatronymicLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PositionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpecField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpecLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CommentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(SendButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menu))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(393, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public String quotate(String content) {
        return "'" + content + "'";
    }

    private void SendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendButtonActionPerformed
        String ID = IDLabel.getText();
        String Surname = SurnameField.getText();
        String NameM = NameField.getText();
        String Patronymic = PatronymicField.getText();
        String Date_of_birth = DateField.getText();
        String Position = PositionField.getText();
        String Spec = SpecField.getText();
        String insertStr = "";
        try {
            insertStr = "INSERT INTO doctor VALUES ('"
                    + ID + "','"
                    + Surname + "','"
                    + NameM + "','"
                    + Patronymic + "','"
                    + Date_of_birth + "','"
                    + Position + "','"
                    + Spec + "')";
                System.out.println(insertStr);
            stmt.executeUpdate(insertStr);
          
            CommentLabel.setText("1 row inserted");
            getContentPane().removeAll();
            initComponents();
        } catch (Exception e) {
            CommentLabel.setText("Error occured in inserting data");
        }
    }//GEN-LAST:event_SendButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            mdbc.close(stmt.getResultSet());
            mdbc.destroy();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_formWindowClosing

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        dlg.setID((String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 0));
        dlg.setSurname((String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 1));
        dlg.setName((String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 2));
        dlg.setPatronymic((String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 3));
        dlg.setDate_of_birth((String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 4));
        dlg.setPosition((String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 5));
        dlg.setSpecialization((String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 6));
        dlg.setVisible(true);
        try {
            
            String insertStr = "UPDATE doctor SET ID='" + dlg.getID() + "', "
                    + "Surname='" + dlg.getSurname() + "', "
                    + "Name_M='" + dlg.getNameM() + "', "
                    + "Patronymic='" + dlg.getPatronymic() + "', "
                    + "Date_of_birth='" + dlg.getDate_of_birth() + "', "
                    + "Position_M='" + dlg.getPositionM() + "', "
                    + "Specialization='" + dlg.getSpecialization() + "' "
                    + "WHERE ID ='" + (String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 0)+"'";
            System.out.println(insertStr);
            stmt.executeUpdate(insertStr);
            getContentPane().removeAll();
            initComponents();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String CarID = (String) DoctorTable.getValueAt(DoctorTable.getSelectedRow(), 0);
        String insertStr = "";
        try {
            insertStr = "DELETE FROM doctor WHERE ID=" + CarID;
            int done = stmt.executeUpdate(insertStr);
            CommentLabel.setText("1 row deleted");
            getContentPane().removeAll();
            initComponents();
        } catch (Exception e) {
            CommentLabel.setText("Error occured in deleting data");
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void DoctorTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_DoctorTableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorTableComponentShown

    private void DoctorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorTableMouseClicked
        if (DoctorTable.getSelectedRowCount() > 0) {
            EditButton.setEnabled(true);
            DeleteButton.setEnabled(true);
        } else {
            EditButton.setEnabled(false);
            DeleteButton.setEnabled(false);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorTableMouseClicked

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ChoosePerson choose = new ChoosePerson();
        choose.setVisible(true);
        choose.setLocationRelativeTo(null);
    }//GEN-LAST:event_menuActionPerformed

    public ResultSet getResultFromDoctor() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM doctor");
        } catch (SQLException e) {
        }
        return rs;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CommentLabel;
    private javax.swing.JTextField DateField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable DoctorTable;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField PatronymicField;
    private javax.swing.JLabel PatronymicLabel;
    private javax.swing.JTextField PositionField;
    private javax.swing.JLabel PositionLabel;
    private javax.swing.JButton SendButton;
    private javax.swing.JTextField SpecField;
    private javax.swing.JLabel SpecLabel;
    private javax.swing.JTextField SurnameField;
    private javax.swing.JLabel SurnameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton menu;
    // End of variables declaration//GEN-END:variables
}
