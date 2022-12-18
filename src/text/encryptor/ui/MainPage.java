/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.encryptor.ui;

import javax.swing.JOptionPane;
import text.encryptor.AffineCipher;
import text.encryptor.AutoKey;
import text.encryptor.ui.controls.JTextBox;

/**
 *
 * @author maher
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        affineCipher = new JTextBox(30);
        affineDecryptButton = new text.encryptor.ui.controls.JButtonBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        affineDecryptResult = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        affineMDecrypt = new JTextBox(30);
        jLabel14 = new javax.swing.JLabel();
        affineKDecrypt = new JTextBox(30);
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        affinePlainText = new JTextBox(30);
        jLabel11 = new javax.swing.JLabel();
        affineMEncrypt = new JTextBox(30);
        affineEncryptButton = new text.encryptor.ui.controls.JButtonBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        affineEncryptResult = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        affineKEncrypt = new JTextBox(30);
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        autoKeyCipher = new JTextBox(30);
        jLabel4 = new javax.swing.JLabel();
        autoKeyDecryptKey = new JTextBox(30);
        autoKeyDecryptButton = new text.encryptor.ui.controls.JButtonBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        autoKeyDecryptResult = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        autoKeyPlainText = new JTextBox(30);
        jLabel2 = new javax.swing.JLabel();
        autoKeyEncryptKey = new JTextBox(30);
        autoKeyEncryptButton = new text.encryptor.ui.controls.JButtonBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        autoKeyEncryptResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("Enter cipher text :");

        affineCipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineCipherActionPerformed(evt);
            }
        });

        affineDecryptButton.setText("Decrypt");
        affineDecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineDecryptButtonActionPerformed(evt);
            }
        });

        affineDecryptResult.setEditable(false);
        affineDecryptResult.setColumns(20);
        affineDecryptResult.setRows(5);
        jScrollPane3.setViewportView(affineDecryptResult);

        jLabel13.setText("Enter M :");

        affineMDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineMDecryptActionPerformed(evt);
            }
        });

        jLabel14.setText("Enter K :");

        affineKDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineKDecryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(affineCipher))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(affineDecryptButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(affineMDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(affineKDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(affineCipher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(affineMDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(affineKDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(affineDecryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("decrypt", jPanel10);

        jLabel10.setText("Enter plain text :");

        affinePlainText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affinePlainTextActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter M :");

        affineMEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineMEncryptActionPerformed(evt);
            }
        });

        affineEncryptButton.setText("Encrypt");
        affineEncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineEncryptButtonActionPerformed(evt);
            }
        });

        affineEncryptResult.setEditable(false);
        affineEncryptResult.setColumns(20);
        affineEncryptResult.setRows(5);
        jScrollPane4.setViewportView(affineEncryptResult);

        jLabel12.setText("Enter K :");

        affineKEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affineKEncryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(affineEncryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(affinePlainText)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(affineMEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(affineKEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(affinePlainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(affineKEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(affineMEncrypt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(affineEncryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("encrypt", jPanel12);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("AFFINE CIPHER", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("RSA", jPanel2);

        jLabel3.setText("Enter cipher text :");

        autoKeyCipher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoKeyCipherActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter your key :");

        autoKeyDecryptKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoKeyDecryptKeyActionPerformed(evt);
            }
        });

        autoKeyDecryptButton.setText("Decrypt");
        autoKeyDecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoKeyDecryptButtonActionPerformed(evt);
            }
        });

        autoKeyDecryptResult.setEditable(false);
        autoKeyDecryptResult.setColumns(20);
        autoKeyDecryptResult.setRows(5);
        jScrollPane1.setViewportView(autoKeyDecryptResult);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoKeyDecryptKey, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(autoKeyCipher)))
                    .addComponent(autoKeyDecryptButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(autoKeyCipher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(autoKeyDecryptKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(autoKeyDecryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("decrypt", jPanel5);

        jLabel1.setText("Enter plain text :");

        autoKeyPlainText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoKeyPlainTextActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter your key :");

        autoKeyEncryptKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoKeyEncryptKeyActionPerformed(evt);
            }
        });

        autoKeyEncryptButton.setText("Encrypt");
        autoKeyEncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoKeyEncryptButtonActionPerformed(evt);
            }
        });

        autoKeyEncryptResult.setEditable(false);
        autoKeyEncryptResult.setColumns(20);
        autoKeyEncryptResult.setRows(5);
        jScrollPane2.setViewportView(autoKeyEncryptResult);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(autoKeyEncryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autoKeyEncryptKey, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                            .addComponent(autoKeyPlainText))))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(autoKeyPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(autoKeyEncryptKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(autoKeyEncryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("encrypt", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("AUTOKEY", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autoKeyPlainTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoKeyPlainTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoKeyPlainTextActionPerformed

    private void autoKeyEncryptKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoKeyEncryptKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoKeyEncryptKeyActionPerformed

    private void autoKeyCipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoKeyCipherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoKeyCipherActionPerformed

    private void autoKeyDecryptKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoKeyDecryptKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autoKeyDecryptKeyActionPerformed

    private void autoKeyDecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoKeyDecryptButtonActionPerformed
         String cipher =autoKeyCipher.getText();
         String key = autoKeyDecryptKey.getText();
        if(!cipher.isEmpty()&&!key.isEmpty()){
            autoKeyDecryptResult.setVisible(true);
            String result = AutoKey.decrypt(cipher,key);
            autoKeyDecryptResult.setText(result);
        }else{
            JOptionPane.showMessageDialog(null, "cipher text & key cannot be null");
            autoKeyDecryptResult.setVisible(false);
        }
    }//GEN-LAST:event_autoKeyDecryptButtonActionPerformed

    private void autoKeyEncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoKeyEncryptButtonActionPerformed
        String plainText =autoKeyPlainText.getText();
         String key = autoKeyEncryptKey.getText();
        if(!plainText.isEmpty()&&!key.isEmpty()){
            autoKeyEncryptResult.setVisible(true);
            String result = AutoKey.encrypt(plainText,key);
            autoKeyEncryptResult.setText(result);
        }else{
            JOptionPane.showMessageDialog(null, "plain text & key cannot be null");
            autoKeyEncryptResult.setVisible(false);
        }    }//GEN-LAST:event_autoKeyEncryptButtonActionPerformed

    private void affineCipherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineCipherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_affineCipherActionPerformed

    private void affineDecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineDecryptButtonActionPerformed
        String cipher = affineCipher.getText();
        String m= affineMDecrypt.getText();
        String k = affineKDecrypt.getText();
        if(isNumeric(m)&&isNumeric(k)){
             int M = Integer.parseInt(m);
             int K = Integer.parseInt(k);
             if(cipher.isEmpty()||m.isEmpty()||k.isEmpty()){
                    JOptionPane.showMessageDialog(null, "plain text & K & M cannot be null");
                    affineDecryptResult.setVisible(false);
             }else if(AffineCipher.gcd(26,M)!=1){
                    JOptionPane.showMessageDialog(null, "gcd (N,M) != 1");
                    affineDecryptResult.setVisible(false);
             }else if(!cipher.isEmpty()&&!m.isEmpty()&&!k.isEmpty()){
                  affineDecryptResult.setVisible(true);
                  String result = AffineCipher.decrypt(cipher.toUpperCase(),M,K);
                  affineDecryptResult.setText(result);
             }
        }else{
            JOptionPane.showMessageDialog(null, "K & M must be numeric");
            affineDecryptResult.setVisible(false);
        }
     

    }//GEN-LAST:event_affineDecryptButtonActionPerformed

    private void affinePlainTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affinePlainTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_affinePlainTextActionPerformed

    private void affineMEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineMEncryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_affineMEncryptActionPerformed

    private void affineEncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineEncryptButtonActionPerformed
        String plainText = affinePlainText.getText();
        String m= affineMEncrypt.getText();
        String k = affineKEncrypt.getText();
        if(isNumeric(m)&&isNumeric(k)){
             int M = Integer.parseInt(m);
             int K = Integer.parseInt(k);
             if(plainText.isEmpty()||m.isEmpty()||k.isEmpty()){
                    JOptionPane.showMessageDialog(null, "plain text & K & M cannot be null");
                    affineEncryptResult.setVisible(false);
             }else if(AffineCipher.gcd(26,M)!=1){
                    JOptionPane.showMessageDialog(null, "gcd (N,M) != 1");
                    affineEncryptResult.setVisible(false);
             }else if(!plainText.isEmpty()&&!m.isEmpty()&&!k.isEmpty()){
                  affineEncryptResult.setVisible(true);
                  String result = AffineCipher.encrypt(plainText.toUpperCase().toCharArray(),M,K);
                  affineEncryptResult.setText(result);
             }
        }else{
            JOptionPane.showMessageDialog(null, "K & M must be numeric");
            affineEncryptResult.setVisible(false);
        }
     


    }//GEN-LAST:event_affineEncryptButtonActionPerformed

    
    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
    
    
    private void affineKEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineKEncryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_affineKEncryptActionPerformed

    private void affineMDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineMDecryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_affineMDecryptActionPerformed

    private void affineKDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affineKDecryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_affineKDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField affineCipher;
    private text.encryptor.ui.controls.JButtonBox affineDecryptButton;
    private javax.swing.JTextArea affineDecryptResult;
    private text.encryptor.ui.controls.JButtonBox affineEncryptButton;
    private javax.swing.JTextArea affineEncryptResult;
    private javax.swing.JTextField affineKDecrypt;
    private javax.swing.JTextField affineKEncrypt;
    private javax.swing.JTextField affineMDecrypt;
    private javax.swing.JTextField affineMEncrypt;
    private javax.swing.JTextField affinePlainText;
    private javax.swing.JTextField autoKeyCipher;
    private text.encryptor.ui.controls.JButtonBox autoKeyDecryptButton;
    private javax.swing.JTextField autoKeyDecryptKey;
    private javax.swing.JTextArea autoKeyDecryptResult;
    private text.encryptor.ui.controls.JButtonBox autoKeyEncryptButton;
    private javax.swing.JTextField autoKeyEncryptKey;
    private javax.swing.JTextArea autoKeyEncryptResult;
    private javax.swing.JTextField autoKeyPlainText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
}