/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Options;

import GUI.*;

/**
 *
 * @author User
 */
public class History extends javax.swing.JPanel{

    
    
    
    
    /**
     * Creates new form Welcome
     */
    public History() {
        initComponents();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        HolderName = new javax.swing.JLabel();
        HolderAccNo = new javax.swing.JLabel();
        HolderAmount = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(88, 173, 255));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 244, 244));
        jLabel1.setText("EasyMoneyTrans");

        jLabel3.setBackground(new java.awt.Color(242, 242, 242));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("Next: Proceed...");

        nextButton.setBackground(new java.awt.Color(139, 214, 255));
        nextButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 244, 244));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/Go-Button.png"))); // NOI18N
        nextButton.setText("Go..");
        nextButton.setBorder(null);
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(139, 214, 255));
        exitButton.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 244, 244));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/Exit-Button.png"))); // NOI18N
        exitButton.setText("..Exit");
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        HolderName.setBackground(new java.awt.Color(139, 214, 255));
        HolderName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        HolderName.setForeground(new java.awt.Color(88, 173, 255));
        HolderName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HolderName.setText("HolderName");
        HolderName.setOpaque(true);

        HolderAccNo.setBackground(new java.awt.Color(139, 214, 255));
        HolderAccNo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        HolderAccNo.setForeground(new java.awt.Color(88, 173, 255));
        HolderAccNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HolderAccNo.setText("1000000000000000000");
        HolderAccNo.setOpaque(true);

        HolderAmount.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        HolderAmount.setForeground(new java.awt.Color(52, 144, 233));
        HolderAmount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/assets/rupee-indian-32.png"))); // NOI18N
        HolderAmount.setText("Amount000000");

        jTable2.setBackground(new java.awt.Color(52, 144, 233));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(exitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)
                                .addComponent(nextButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(193, 193, 193)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(HolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HolderAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HolderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(HolderAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(HolderName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(HolderAccNo))))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(nextButton)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        
        
        
        ApplicationManager.application.loadScene(new AccountValidation());
        
    
        
        
        
        System.out.println("welcome button clicked");
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HolderAccNo;
    private javax.swing.JLabel HolderAmount;
    private javax.swing.JLabel HolderName;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
