/*
%## Copyright (C) 2008 S.Box
%## 
%## This program is free software; you can redistribute it and/or modify
%## it under the terms of the GNU General Public License as published by
%## the Free Software Foundation; either version 2 of the License, or
%## (at your option) any later version.
%## 
%## This program is distributed in the hope that it will be useful,
%## but WITHOUT ANY WARRANTY; without even the implied warranty of
%## MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
%## GNU General Public License for more details.
%## 
%## You should have received a copy of the GNU General Public License
%## along with this program; if not, write to the Free Software
%## Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA

%## ascent_variables.m

%## Author: S.Box
%## Created: 2010-05-27
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CreateMotorDialog.java
 *
 * Created on 02-Feb-2010, 15:25:59
 */

package Rocket;
import java.util.Vector;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author sb4p07
 */
public class CreateMotorDialog extends javax.swing.JDialog {
    //**class members
    String Name, FileName;
    double Length, Diameter, LMass, DMass;
    Vector<Double> Time = new Vector<Double>();
    Vector<Double> Thrust = new Vector<Double>();
    boolean ReadOk=false;

    /** Creates new form CreateMotorDialog */
    public CreateMotorDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ExcelAdapter myAd = new ExcelAdapter(ThrustTimeTable);//TODO this is to allow copy and paste with excel 
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ThrustTimeTable = new javax.swing.JTable();
        TitleLabel = new javax.swing.JLabel();
        MotorNameLabel = new javax.swing.JLabel();
        MotorNameText = new javax.swing.JTextField();
        MotorLengthLabel = new javax.swing.JLabel();
        MotorLengthText = new javax.swing.JTextField();
        MotorLengthDim = new javax.swing.JLabel();
        MotorDiameterLabel = new javax.swing.JLabel();
        MotorDiamterText = new javax.swing.JTextField();
        MotorDiameterDim = new javax.swing.JLabel();
        MotorLMassLabel = new javax.swing.JLabel();
        MotorLMassText = new javax.swing.JTextField();
        MotorDMassText = new javax.swing.JTextField();
        MotorDMassLabel = new javax.swing.JLabel();
        MotorLMassDim = new javax.swing.JLabel();
        MotorDMassDim = new javax.swing.JLabel();
        TableLabel = new javax.swing.JLabel();
        MotorSaveButton = new javax.swing.JButton();
        MotorCancelButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ThrustTimeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Time (s)", "Thrust (N)"
            }
        ));
        ThrustTimeTable.setColumnSelectionAllowed(true);
        ThrustTimeTable.getTableHeader().setReorderingAllowed(false);
        ThrustTimeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThrustTimeTableMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ThrustTimeTableMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ThrustTimeTableMouseEntered(evt);
            }
        });
        ThrustTimeTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ThrustTimeTableFocusLost(evt);
            }
        });
        ThrustTimeTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ThrustTimeTablePropertyChange(evt);
            }
        });
        ThrustTimeTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ThrustTimeTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(ThrustTimeTable);
        ThrustTimeTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        TitleLabel.setText("Define a new motor");

        MotorNameLabel.setText("Name");

        MotorNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MotorNameTextFocusLost(evt);
            }
        });

        MotorLengthLabel.setText("Length");

        MotorLengthText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MotorLengthTextFocusLost(evt);
            }
        });

        MotorLengthDim.setText("m");

        MotorDiameterLabel.setText("Diameter");

        MotorDiamterText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MotorDiamterTextFocusLost(evt);
            }
        });

        MotorDiameterDim.setText("m");

        MotorLMassLabel.setText("Loaded Mass");

        MotorLMassText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MotorLMassTextFocusLost(evt);
            }
        });

        MotorDMassText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MotorDMassTextFocusLost(evt);
            }
        });

        MotorDMassLabel.setText("Empty Mass");

        MotorLMassDim.setText("kg");

        MotorDMassDim.setText("kg");

        TableLabel.setText("Thrust - time data");

        MotorSaveButton.setText("Save");
        MotorSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MotorSaveButtonMouseReleased(evt);
            }
        });
        MotorSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotorSaveButtonActionPerformed(evt);
            }
        });

        MotorCancelButton.setText("Cancel");
        MotorCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotorCancelButtonActionPerformed(evt);
            }
        });

        jButton1.setText("?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TitleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MotorDiameterLabel)
                            .addComponent(MotorLengthLabel)
                            .addComponent(MotorNameLabel)
                            .addComponent(MotorLMassLabel)
                            .addComponent(MotorDMassLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MotorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(MotorDiamterText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(MotorLengthText, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(MotorLMassText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(MotorDMassText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MotorDMassDim)
                                    .addComponent(MotorLMassDim)
                                    .addComponent(MotorDiameterDim)
                                    .addComponent(MotorLengthDim))))))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(MotorSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MotorCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TableLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitleLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotorNameLabel)
                            .addComponent(MotorNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotorLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotorLengthDim)
                            .addComponent(MotorLengthLabel))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotorDiamterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotorDiameterLabel)
                            .addComponent(MotorDiameterDim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotorLMassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotorLMassLabel)
                            .addComponent(MotorLMassDim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotorDMassText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotorDMassLabel)
                            .addComponent(MotorDMassDim))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MotorSaveButton)
                    .addComponent(MotorCancelButton)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MotorCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotorCancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_MotorCancelButtonActionPerformed

    private void MotorSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotorSaveButtonActionPerformed

        boolean Goer = CheckValidity();
        boolean Tgood = CheckTableData();

        if(Goer == true && Tgood == true)
        {
            
             JFileChooser fc = new JFileChooser();
             ProfilePreLoader PPL = new ProfilePreLoader();
             fc.setCurrentDirectory(PPL.MotorDir);
             int RetVal = fc.showSaveDialog(null);
             if(RetVal == fc.APPROVE_OPTION)
             {
                 FileName = fc.getSelectedFile().getPath();
                 if(FileName != null)
                 {
                    ReadOk = true;
                    this.dispose();
                 }
             }
        }
        else{
            JOptionPane.showMessageDialog(null,("Something is wrong with the data that you entered"));
        }
    }//GEN-LAST:event_MotorSaveButtonActionPerformed

    private void ThrustTimeTableFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ThrustTimeTableFocusLost
        ReadTableData();
    }//GEN-LAST:event_ThrustTimeTableFocusLost

    private void ThrustTimeTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ThrustTimeTablePropertyChange

    }//GEN-LAST:event_ThrustTimeTablePropertyChange

    private void MotorNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MotorNameTextFocusLost
        Name = MotorNameText.getText();
    }//GEN-LAST:event_MotorNameTextFocusLost

    private void MotorLengthTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MotorLengthTextFocusLost
        TestUserTextInput LengthTest = new TestUserTextInput(MotorLengthText);
        Length = LengthTest.TestDouble();
        MotorLengthText = LengthTest.InputField;
    }//GEN-LAST:event_MotorLengthTextFocusLost

    private void MotorDiamterTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MotorDiamterTextFocusLost
        TestUserTextInput DiameterTest = new TestUserTextInput(MotorDiamterText);
        Diameter = DiameterTest.TestDouble();
        MotorDiamterText = DiameterTest.InputField;
    }//GEN-LAST:event_MotorDiamterTextFocusLost

    private void MotorLMassTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MotorLMassTextFocusLost
        TestUserTextInput LMassTest = new TestUserTextInput(MotorLMassText);
        LMass = LMassTest.TestDouble();
        MotorLMassText = LMassTest.InputField;
    }//GEN-LAST:event_MotorLMassTextFocusLost

    private void MotorDMassTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MotorDMassTextFocusLost
        TestUserTextInput DMassTest = new TestUserTextInput(MotorDMassText);
        DMass = DMassTest.TestDouble();
        MotorDMassText = DMassTest.InputField;
    }//GEN-LAST:event_MotorDMassTextFocusLost

    private void MotorSaveButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotorSaveButtonMouseReleased
        // TODO add your handling code her

    }//GEN-LAST:event_MotorSaveButtonMouseReleased

    private void ThrustTimeTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ThrustTimeTableKeyPressed
        ReadTableData();
    }//GEN-LAST:event_ThrustTimeTableKeyPressed

    private void ThrustTimeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThrustTimeTableMouseClicked
        ReadTableData();
    }//GEN-LAST:event_ThrustTimeTableMouseClicked

    private void ThrustTimeTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThrustTimeTableMouseEntered
        ReadTableData();
    }//GEN-LAST:event_ThrustTimeTableMouseEntered

    private void ThrustTimeTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThrustTimeTableMouseExited
        ReadTableData();
    }//GEN-LAST:event_ThrustTimeTableMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tips tDiag = new Tips(null,true);
        tDiag.setTipTxt("Motor Settings \n\n Use this window to specify the parameters of the rocket motor. Loaded Mass and Empty Mass are respectively the mass of the motor before and after burning. Time stamp data should be entered in ascending order starting at 0 and Thrust data should both start and finish with 0.");
        tDiag.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    private boolean ReadTableData()
    {
        TestUserTextInput YUI = new TestUserTextInput(ThrustTimeTable);
        Vector<Vector<Double> > Data = YUI.TestTable();

        if(YUI.Valid)
        {
            Time = Data.elementAt(0);
            Thrust = Data.elementAt(1);
        }

        return(YUI.Valid);
    }
    private boolean CheckValidity(){
    boolean answer;
    Vector<javax.swing.JTextField> FieldsList = new Vector<javax.swing.JTextField>();
    FieldsList.add(MotorDMassText);
    FieldsList.add(MotorDiamterText);
    FieldsList.add(MotorLMassText);
    FieldsList.add(MotorLengthText);

    TestUserTextInput TUI1 = new TestUserTextInput(FieldsList);
    answer = TUI1.TestDoubleList();
    return(answer);
}

    private boolean CheckTableData(){
        boolean ok = ReadTableData();
        if(ok){
            double tref = 0;
            for(double t : Time)
            {
                if(t < tref)
                {
                    ok = false;
                }
                tref=t;
            }

            if(Time.size() != Thrust.size())
            {
                ok = false;
            }

            if(Thrust.get(0) != 0.0)
            {
                Time.insertElementAt(Time.get(0), 0);
                Thrust.insertElementAt(0.0, 0);
            }
            if(!Thrust.lastElement().equals(0.0))
            {
                Time.add(Time.lastElement());
                Thrust.add(0.0);
            }
        }
        return(ok);

    }

    public void FillFields(String n, double l, double d, double lm, double dm, Vector<Double> Ti, Vector<Double> Th)
    {
        Name = n; Length = l; Diameter = d; LMass = lm; DMass = dm;
        Time = Ti; Thrust = Th;

        for (int i = 0; i < Ti.size(); i++)
        {
            ThrustTimeTable.getModel().setValueAt(Ti.get(i), i, 0);
            ThrustTimeTable.getModel().setValueAt(Th.get(i), i, 1);
        }

        MotorNameText.setText(n);
        MotorLengthText.setText(Double.toString(l));
        MotorDiamterText.setText(Double.toString(d));
        MotorLMassText.setText(Double.toString(lm));
        MotorDMassText.setText(Double.toString(dm));

    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateMotorDialog dialog = new CreateMotorDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MotorCancelButton;
    private javax.swing.JLabel MotorDMassDim;
    private javax.swing.JLabel MotorDMassLabel;
    private javax.swing.JTextField MotorDMassText;
    private javax.swing.JLabel MotorDiameterDim;
    private javax.swing.JLabel MotorDiameterLabel;
    private javax.swing.JTextField MotorDiamterText;
    private javax.swing.JLabel MotorLMassDim;
    private javax.swing.JLabel MotorLMassLabel;
    private javax.swing.JTextField MotorLMassText;
    private javax.swing.JLabel MotorLengthDim;
    private javax.swing.JLabel MotorLengthLabel;
    private javax.swing.JTextField MotorLengthText;
    private javax.swing.JLabel MotorNameLabel;
    private javax.swing.JTextField MotorNameText;
    private javax.swing.JButton MotorSaveButton;
    private javax.swing.JLabel TableLabel;
    private javax.swing.JTable ThrustTimeTable;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
