/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package gui;

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 @author Rakshilkumar
 */
public class Login1 extends javax.swing.JFrame {

    /**
     * Creates new form Login1
     */
   String ac="",l="";
    public Login1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        in = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        acc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        acid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setForeground(java.awt.Color.black);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");

        user.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        pass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        in.setBackground(new java.awt.Color(0, 0, 0));
        in.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        in.setForeground(new java.awt.Color(255, 255, 255));
        in.setText("Sign In");
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        acc.setBackground(new java.awt.Color(0, 0, 0));
        acc.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        acc.setForeground(new java.awt.Color(255, 255, 255));
        acc.setText("Make new Account");
        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Account ID :");

        acid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        acid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(acid)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(acid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jCheckBox1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("  WELCOME TO NRI BANK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        user.setText("");
        pass.setText("");
        acid.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    private void accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accActionPerformed
dispose();
        Registration r = new Registration();
         r.setVisible(true);
    }//GEN-LAST:event_accActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if(jCheckBox1.isSelected())
       {
           pass.setEchoChar((char)0);
       }
       else
       {
           pass.setEchoChar('*');
       }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
  ac = acid.getText();
 String user1=user.getText();
         String pass1 = pass.getText();
  l="";
//        int i;
//        try {
//            i = new File1().readNoofaccount(ac);
//             String path="E:\\An1\\"+ac+"\\"+(ac.substring(0, 2))+" "+(i+1)+".txt";
//        } catch (IOException ex) {
//            Logger.getLogger(Login1.class.getName()).log(Level.SEVERE, null, ex);
//        }
////        String path="E:\\An1\\"+ac+"\\"+(ac.substring(0, 2))+" "+(i+1)+".txt";
     if(ac.startsWith("CU"))
         l="CURRENT ACCOUNT";
     else if(ac.startsWith("SA"))
         l="SAVING'S ACCOUNT";
     else if(ac.startsWith("FD"))
         l="FD";
     
//File directory = new File("E:\\An1\\"+l); 
//System.out.println("In "+"E:\\An1\\"+l);
//
//       String[] flist = directory.list(); 
//       //System.out.println(flist.length);
//     int flag = 0; 
//     if (flist == null) { 
//            System.out.println("NO ACCOUNT"); 
//       } 
//        else { 
//  
//            // Linear search in the array 
//            for (int i = 0; i < flist.length; i++) { 
//                System.out.println("In Loop");
//                String filename = flist[i]; 
//                System.out.println(filename);
//                if (filename.equalsIgnoreCase(ac+".txt")) { 
//                    
//                    System.out.println(filename + " found"); 
//                    flag = 1; 
//                } 
//            } 
//        }            

File f=new File("E:\\An1\\"+l+"\\"+ac+".txt");
            FileReader fr;
            String d="",q="";
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while((d=br.readLine())!=null)
            {
                if(d.contains("Username : "))
                {
                    System.out.println(d.length());
                    System.out.println(d);
                    if(d.substring(11).equals(user1))
                    {System.out.println(d.substring(11));
                    
                    while((q=br.readLine())!=null)
            {
                if(q.contains("Password : "))
                {
                    System.out.println(q.length());
                    System.out.println(q);
                    if(q.substring(11).equals(pass1))
                    {System.out.println(q.substring(11));
                    JOptionPane.showMessageDialog(null,"Login Successful");
                    user.setText(null);
                    pass.setText(null);
                    acid.setText(null);
                    if(l.equals("CURRENT ACCOUNT"))
                    {
                        dispose();
                        CurrentAccount ca = new CurrentAccount(this);
                        ca.setVisible(true);
                    }
                    else if(l.equals("FD"))
                    {
                        dispose();
                        //FdStartpage p = new FdStartpage();
                        //p.setVisible(true);
                    }
                    else if(l.equals("SAVING'S ACCOUNT"))
                    {
                        dispose();
                        SavingAccount a = new SavingAccount(this);
                        a.setVisible(true);
                    }
                    
                }}
                
                
                
            }
                }}
                else
                {
                    JOptionPane.showMessageDialog(null,"InValid Username or Password");
                    System.exit(0);
                }
            }
        } catch (FileNotFoundException ex) {
          ex.printStackTrace();
        } catch (IOException ex) {
             ex.printStackTrace();
        }
        
        
        
        
       
//         if(user1.equals("Rak") && pass1.equals("123456"))
//        {
//            JOptionPane.showMessageDialog(null,"Login Successful");
//             user.setText(null);
//         pass.setText(null);
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"Invalid Details");
//             user.setText(null);
//         pass.setText(null);
//        }
         
     // TODO add your handling code here:
////     if(ac.substring(0,ac.indexOf(' ')).equals("CU")) {
////         CurrentAccount w = new CurrentAccount();
////         w.setVisible(true);
////         
////     }
////        
////    else {
//}
    }//GEN-LAST:event_inActionPerformed

    private void acidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acidActionPerformed

    
    }//GEN-LAST:event_acidActionPerformed

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
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acc;
    private javax.swing.JTextField acid;
    private javax.swing.JButton in;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}