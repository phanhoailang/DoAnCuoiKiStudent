
package View;

import Cotroller.MenuController;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MenuJFrame extends javax.swing.JFrame {

    public MenuJFrame() {
        setVisible(true);
        initComponents();
        setLocationRelativeTo(null);
        // Action
        ActionListener act = new MenuController(this);
        btDelete.addActionListener(act);
        btFind.addActionListener(act);
        btExit.addActionListener(act);
        btInsert.addActionListener(act);
        btShowAll.addActionListener(act);
        btReset.addActionListener(act);
        btUpdate.addActionListener(act);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        btInsert = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btShowAll = new javax.swing.JButton();
        lBTitle = new javax.swing.JLabel();
        btFind = new javax.swing.JButton();
        lBID = new javax.swing.JLabel();
        lBName = new javax.swing.JLabel();
        lBClass = new javax.swing.JLabel();
        lBSex = new javax.swing.JLabel();
        lBGPA = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfClass = new javax.swing.JTextField();
        tfGPA = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        btReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student management by Hoai Lang");
        setBackground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Class", "Sex", "GPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbStudent);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 335, 728, 160));

        btInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save-icon.png"))); // NOI18N
        btInsert.setText("Insert");
        btInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 293, 106, -1));

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 293, 96, -1));

        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 293, 103, -1));

        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button-Close-icon-16.png"))); // NOI18N
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 293, 96, -1));

        btShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/open-file-icon-16.png"))); // NOI18N
        btShowAll.setText("Show all");
        btShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowAllActionPerformed(evt);
            }
        });
        getContentPane().add(btShowAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 293, -1, -1));

        lBTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lBTitle.setForeground(new java.awt.Color(102, 102, 255));
        lBTitle.setText("STUDENT MANAGEMENT");
        getContentPane().add(lBTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 250, 36));

        btFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon-16.png"))); // NOI18N
        btFind.setText("Find");
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });
        getContentPane().add(btFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 293, 99, -1));

        lBID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBID.setText("Student ID: ");
        getContentPane().add(lBID, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 84, -1, -1));

        lBName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBName.setText("Name:");
        getContentPane().add(lBName, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 119, 73, -1));

        lBClass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBClass.setText("Class:");
        getContentPane().add(lBClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 168, 37, -1));

        lBSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBSex.setText("Sex:");
        getContentPane().add(lBSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 221, 37, -1));

        lBGPA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBGPA.setText("GPA: ");
        getContentPane().add(lBGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 264, 37, -1));

        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });
        getContentPane().add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 83, 407, -1));
        getContentPane().add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 119, 407, -1));
        getContentPane().add(tfClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 167, 407, -1));
        getContentPane().add(tfGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 263, 407, -1));

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");
        getContentPane().add(rdMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 221, -1, -1));

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");
        getContentPane().add(rdFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 221, -1, -1));

        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        getContentPane().add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 149, 100, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 6, 154, 71));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btResetActionPerformed

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_tfIDActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:Delete
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertActionPerformed
        // TODO add your handling code here:Insert
    }//GEN-LAST:event_btInsertActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        // TODO add your handling code here:Update
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        // TODO add your handling code here: Find
    }//GEN-LAST:event_btFindActionPerformed

    private void btShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowAllActionPerformed
        // TODO add your handling code here:Show all
    }//GEN-LAST:event_btShowAllActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        // TODO add your handling code here:Exit
    }//GEN-LAST:event_btExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btShowAll;
    private javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBClass;
    private javax.swing.JLabel lBGPA;
    private javax.swing.JLabel lBID;
    private javax.swing.JLabel lBName;
    private javax.swing.JLabel lBSex;
    private javax.swing.JLabel lBTitle;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField tfClass;
    private javax.swing.JTextField tfGPA;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JRadioButton getRdFemale() {
        return rdFemale;
    }

    public void setRdFemale(JRadioButton rdFemale) {
        this.rdFemale = rdFemale;
    }

    public JRadioButton getRdMale() {
        return rdMale;
    }

    public void setRdMale(JRadioButton rdMale) {
        this.rdMale = rdMale;
    }

    public JTextField getTfClass() {
        return tfClass;
    }

    public void setTfClass(JTextField tfClass) {
        this.tfClass = tfClass;
    }

    public JTextField getTfGPA() {
        return tfGPA;
    }

    public void setTfGPA(JTextField tfGPA) {
        this.tfGPA = tfGPA;
    }

    public JTextField getTfID() {
        return tfID;
    }

    public void setTfID(JTextField tfID) {
        this.tfID = tfID;
    }

    public JTextField getTfName() {
        return tfName;
    }

    public void setTfName(JTextField tfName) {
        this.tfName = tfName;
    }

    public JTable getTbStudent() {
        return tbStudent;
    }

    public void setTbStudent(JTable tbStudent) {
        this.tbStudent = tbStudent;
    }
    
}
