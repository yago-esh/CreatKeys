package paswords;


import paswords.Paswords;

public class VPassword_Help extends javax.swing.JFrame {

    String pasword;
    int longitud;
    boolean mayusculas;
    String clave;
    int numchar;
    char[] contraseña;
      Paswords pass;
    String lapass;

    /**
     * Creates new form VPassword
     */
    public VPassword_Help() {
        
        initComponents();
//        ocultar();
        setLocationRelativeTo(null);
        this.setSize(500,350);
    }

//    public void ocultar(){
//        jTextField5.hide();
//        jLabel7.hide();
//        jTextField1.setEditable(false); 
//        jTextField3.setEditable(false); 
//        jTextField4.setEditable(false);
//        this.setSize(500, 270);   
//    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAyuda = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Area1 = new javax.swing.JTextArea();
        paneldebotoenes = new javax.swing.JPanel();
        BotonPresentacion = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        Titulo1.setFont(new java.awt.Font("Narkisim", 0, 24)); // NOI18N
        Titulo1.setText("Presentacion");

        Area1.setEditable(false);
        Area1.setBackground(new java.awt.Color(214, 217, 223));
        Area1.setColumns(43);
        Area1.setLineWrap(true);
        Area1.setRows(5);
        Area1.setText("Olvidate de tener una contraseña distinta en cada sitio (Facebook, Correo, Twitter...) y nunca acordarte de cual es, de poner contraseñas fáciles para poder recordarlas y que sea más facil que te la averiguen robandote tus datos. Con CreateKeys solo tendrás que acordarte de una única contraseña (Tu Clave)da igual lo fácil o simple que sea, ya que mediante nuestro porgrama combinamos tu clave con tu contraseña y una serie de variables para darte una nueva contraseña única y dificl de que te la roben.\n");
        Area1.setToolTipText("");
        Area1.setWrapStyleWord(true);
        Area1.setAutoscrolls(false);
        Area1.setBorder(null);
        Area1.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        Area1.setVerifyInputWhenFocusTarget(false);

        BotonPresentacion.setText("Presentación");
        BotonPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPresentacionActionPerformed(evt);
            }
        });

        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneldebotoenesLayout = new javax.swing.GroupLayout(paneldebotoenes);
        paneldebotoenes.setLayout(paneldebotoenesLayout);
        paneldebotoenesLayout.setHorizontalGroup(
            paneldebotoenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldebotoenesLayout.createSequentialGroup()
                .addComponent(BotonPresentacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(BotonVolver)
                .addContainerGap())
        );
        paneldebotoenesLayout.setVerticalGroup(
            paneldebotoenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneldebotoenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(BotonPresentacion)
                .addComponent(BotonVolver))
        );

        javax.swing.GroupLayout PanelAyudaLayout = new javax.swing.GroupLayout(PanelAyuda);
        PanelAyuda.setLayout(PanelAyudaLayout);
        PanelAyudaLayout.setHorizontalGroup(
            PanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAyudaLayout.createSequentialGroup()
                .addGroup(PanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAyudaLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Titulo1))
                    .addGroup(PanelAyudaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Area1)))
                .addContainerGap())
            .addGroup(PanelAyudaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneldebotoenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAyudaLayout.setVerticalGroup(
            PanelAyudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAyudaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Area1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneldebotoenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAyuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPresentacionActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_BotonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPassword_Help().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area1;
    private javax.swing.JButton BotonPresentacion;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPanel PanelAyuda;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JPanel paneldebotoenes;
    // End of variables declaration//GEN-END:variables
}
