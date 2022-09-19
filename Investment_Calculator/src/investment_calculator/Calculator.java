package investment_calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author nellt
 */
public class Calculator extends javax.swing.JFrame {

        public Calculator() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Type_Label = new javax.swing.JLabel();
        Type_jComboBox = new javax.swing.JComboBox<>();
        Item_Label = new javax.swing.JLabel();
        Five_jRadioButton = new javax.swing.JRadioButton();
        Customer_Name_TextField = new javax.swing.JTextField();
        Ten_jRadioButton = new javax.swing.JRadioButton();
        Amount_TextField = new javax.swing.JTextField();
        fifteen_jRadioButton = new javax.swing.JRadioButton();
        Customer_Name_Label = new javax.swing.JLabel();
        Amount_Label = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        File_jMenu = new javax.swing.JMenu();
        Exit_jMenuItem = new javax.swing.JMenuItem();
        Tools_jMenu = new javax.swing.JMenu();
        Calculate_jMenuItem = new javax.swing.JMenuItem();
        Clear_jMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Type_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Type_Label.setText("Select Type:");

        Type_jComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Type_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moderate", "Aggressive" }));

        Item_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Item_Label.setText("Select Item:");

        Five_jRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Five_jRadioButton.setText("5 Years");

        Customer_Name_TextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Ten_jRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Ten_jRadioButton.setText("10 Years");

        Amount_TextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fifteen_jRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fifteen_jRadioButton.setText("15 Years");

        Customer_Name_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Customer_Name_Label.setText("Customer Name:");

        Amount_Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Amount_Label.setText("Enter Amount:");

        File_jMenu.setText("File");

        Exit_jMenuItem.setText("Exit");
        Exit_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_jMenuItemActionPerformed(evt);
            }
        });
        File_jMenu.add(Exit_jMenuItem);

        jMenuBar1.add(File_jMenu);

        Tools_jMenu.setText("Tools");
        Tools_jMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tools_jMenuActionPerformed(evt);
            }
        });

        Calculate_jMenuItem.setText("Calculate");
        Calculate_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_jMenuItemActionPerformed(evt);
            }
        });
        Tools_jMenu.add(Calculate_jMenuItem);

        Clear_jMenuItem.setText("Clear");
        Clear_jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_jMenuItemActionPerformed(evt);
            }
        });
        Tools_jMenu.add(Clear_jMenuItem);

        jMenuBar1.add(Tools_jMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Type_Label)
                    .addComponent(Customer_Name_Label)
                    .addComponent(Item_Label)
                    .addComponent(Amount_Label))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Type_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Customer_Name_TextField)
                    .addComponent(Amount_TextField)
                    .addComponent(Ten_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Five_jRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fifteen_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Customer_Name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Customer_Name_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amount_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Type_Label)
                    .addComponent(Type_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Five_jRadioButton)
                    .addComponent(Item_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ten_jRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fifteen_jRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Calculate_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_jMenuItemActionPerformed
        
       String Name = "", Years ="";;
       double Amount= 0;
       double FinalAmount = 0;
       int Term_5_years = 5;
       int Term_10_years = 10;
       int Term_15_years = 15;
       
       
       Name = Customer_Name_TextField.getText();
       Amount = Double.parseDouble(Amount_TextField.getText());
      
      /** Five Years and Moderate **/
      
      if( Five_jRadioButton.isSelected() & Type_jComboBox.getSelectedIndex()==0){
          
          FinalAmount = Amount*(Math.pow((1+ (0.10/ 1 )), Term_5_years * 1));
          Years = "5";
          
      } 
       
      /** 10 Years and Moderate **/
      
      else if( Ten_jRadioButton.isSelected() & Type_jComboBox.getSelectedIndex()==0){
          
          FinalAmount = Amount*(Math.pow((1+ (0.10/ 1 )), Term_10_years * 1));
          Years = "10";
          
      } 
      
      /** 15 Years and Moderate **/
      
      else if( fifteen_jRadioButton.isSelected() & Type_jComboBox.getSelectedIndex()==0){
          
          FinalAmount = Amount*(Math.pow((1+ (0.10/ 1 )), Term_15_years * 1));
          Years = "15";
          
      } 
      
      /** 5 Years and Aggressive **/
      
      else if( Five_jRadioButton.isSelected() & Type_jComboBox.getSelectedIndex() == 1){
          
          FinalAmount = Amount*(Math.pow((1+(0.15 / 1)), Term_5_years * 1));
          Years = "5";
      }
      
       /** 10 Years and Aggressive **/
      
      else if( Ten_jRadioButton.isSelected() & Type_jComboBox.getSelectedIndex() == 1){
          
          FinalAmount = Amount*(Math.pow((1+(0.15 / 1)), Term_10_years* 1));
          Years = "10";
      }
                    
        /** 15 years and Aggressive**/
       else if (fifteen_jRadioButton.isSelected() & Type_jComboBox.getSelectedIndex()== 1){
           
           FinalAmount = Amount*(Math.pow((1+ (0.15 / 1)),Term_15_years * 1)); 
           Years = "15";
       }
      
        JOptionPane.showMessageDialog(rootPane,"\nCustomer Name: " +
                "Investment Report: "+Name+"\nOriginal Amount: R"+Amount
                +"\n Years Invsted: "+Years+ "\nFinal Amount: R"+String.format("%.2f", FinalAmount));   
    }//GEN-LAST:event_Calculate_jMenuItemActionPerformed

    
    private void Tools_jMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tools_jMenuActionPerformed
        
    }//GEN-LAST:event_Tools_jMenuActionPerformed

    
    /** Clear menu item in the File menu **/
    
    private void Clear_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear_jMenuItemActionPerformed
       
       Customer_Name_TextField.setText("");
       Amount_TextField.setText("");
       
       
    }//GEN-LAST:event_Clear_jMenuItemActionPerformed

    private void Exit_jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_jMenuItemActionPerformed
     
        this.dispose();
    }//GEN-LAST:event_Exit_jMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount_Label;
    private javax.swing.JTextField Amount_TextField;
    private javax.swing.JMenuItem Calculate_jMenuItem;
    private javax.swing.JMenuItem Clear_jMenuItem;
    private javax.swing.JLabel Customer_Name_Label;
    private javax.swing.JTextField Customer_Name_TextField;
    private javax.swing.JMenuItem Exit_jMenuItem;
    private javax.swing.JMenu File_jMenu;
    private javax.swing.JRadioButton Five_jRadioButton;
    private javax.swing.JLabel Item_Label;
    private javax.swing.JRadioButton Ten_jRadioButton;
    private javax.swing.JMenu Tools_jMenu;
    private javax.swing.JLabel Type_Label;
    private javax.swing.JComboBox<String> Type_jComboBox;
    private javax.swing.JRadioButton fifteen_jRadioButton;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
