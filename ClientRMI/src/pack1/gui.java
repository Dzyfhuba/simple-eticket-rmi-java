/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author dzyfhuba
 */
public class gui extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public gui() {
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

        title = new javax.swing.JLabel();
        ticket_panel = new javax.swing.JPanel();
        number = new javax.swing.JLabel();
        ticket_title = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();
        jam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        tf_email = new javax.swing.JTextField();
        p_email = new javax.swing.JLabel();
        p_waktu = new javax.swing.JLabel();
        b_cs = new javax.swing.JButton();
        b_teller1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("E Ticket");
        setAlwaysOnTop(true);
        setEnabled(false);
        setMaximumSize(null);
        setMinimumSize(null);
        setSize(new java.awt.Dimension(1440, 1080));
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        title.setText("E-Ticket");
        getContentPane().add(title);
        title.setBounds(580, 0, 190, 80);

        number.setFont(new java.awt.Font("Ubuntu", 0, 240)); // NOI18N
        number.setText("A001");

        ticket_title.setFont(new java.awt.Font("Ubuntu", 0, 72)); // NOI18N
        ticket_title.setText("E-Ticket System, Nih!");

        msg.setText("Silahkan mengantre sesuai dengan nomor yang anda dapatkan.");

        jam.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jam.setText("18.00 - 19.00");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        jLabel1.setText("8 Januari 2022");

        javax.swing.GroupLayout ticket_panelLayout = new javax.swing.GroupLayout(ticket_panel);
        ticket_panel.setLayout(ticket_panelLayout);
        ticket_panelLayout.setHorizontalGroup(
            ticket_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticket_panelLayout.createSequentialGroup()
                .addGroup(ticket_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticket_panelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(number))
                    .addGroup(ticket_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msg))
                    .addGroup(ticket_panelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(ticket_panelLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jam))
                    .addGroup(ticket_panelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(ticket_title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ticket_panelLayout.setVerticalGroup(
            ticket_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticket_panelLayout.createSequentialGroup()
                .addComponent(ticket_title, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(number)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg))
        );

        getContentPane().add(ticket_panel);
        ticket_panel.setBounds(12, 91, 853, 550);

        background.setBackground(new java.awt.Color(200, 200, 200));

        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });

        p_email.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p_email.setText("Email:");

        p_waktu.setFont(new java.awt.Font("Ubuntu", 0, 48)); // NOI18N
        p_waktu.setText("15.35 | 7 September 2022");

        b_cs.setBackground(new java.awt.Color(0, 255, 0));
        b_cs.setText("Ambil Ticket Customer Service");
        b_cs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_csActionPerformed(evt);
            }
        });

        b_teller1.setBackground(new java.awt.Color(255, 0, 0));
        b_teller1.setText("Ambil Ticket Teller");
        b_teller1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_teller1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap(873, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(p_waktu)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_email)
                            .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(b_cs, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(backgroundLayout.createSequentialGroup()
                    .addGap(929, 929, 929)
                    .addComponent(b_teller1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addGap(40, 40, 40)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(p_waktu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p_email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)
                .addComponent(b_cs, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                    .addGap(335, 335, 335)
                    .addComponent(b_teller1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addGap(168, 168, 168)))
        );

        getContentPane().add(background);
        background.setBounds(0, 0, 1440, 653);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void b_csActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_csActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_csActionPerformed

    private void b_teller1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_teller1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_teller1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cs;
    private javax.swing.JButton b_teller1;
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jam;
    private javax.swing.JLabel msg;
    private javax.swing.JLabel number;
    private javax.swing.JLabel p_email;
    private javax.swing.JLabel p_waktu;
    private javax.swing.JTextField tf_email;
    private javax.swing.JPanel ticket_panel;
    private javax.swing.JLabel ticket_title;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
