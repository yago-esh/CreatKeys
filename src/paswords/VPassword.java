package paswords;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class VPassword extends javax.swing.JFrame {

    String pasword;
    int longitud;
    boolean mayusculas;
    String clave;
    int numchar;
    char[] contraseña;
    Paswords pass;
    String lapass;
    int panelx,panely;

    /**
     * Creates new form VPassword
     */
    public VPassword() {
        initAyuda();
        PanelAyuda.hide();
        initComponents();
        ocultar();
        setLocationRelativeTo(null);
        panelx = this.getHeight();
        panely = this.getWidth();
    }

    public void ocultar() {
        jTextField5.hide();
        jLabel7.hide();
        jTextField1.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        this.setSize(500, 270);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));

        jButton3.setText("Ayuda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Narkisim", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenidos a CreateKeys");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Clave:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Número:");

        jTextField4.setText("Escribe aquí el numero de caracteres que quieres...");

        jTextField3.setText("Escribe aquí tu clave de encriptación...");

        jTextField1.setText("Escribe aquí tu contraseña...");

        jCheckBox1.setText("Click si desea mayusculas en su nueva Contraseña");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mayúsculas:");

        jButton2.setText("Limpiar Campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Generar Nueva Contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tu nueva contraseña:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(19)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(jButton2)
        									.addGap(18)
        									.addComponent(jButton1)
        									.addGap(58)
        									.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 11, Short.MAX_VALUE))
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jLabel2)
        										.addComponent(jLabel4)
        										.addComponent(jLabel5)
        										.addComponent(jLabel6))
        									.addGap(49)
        									.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(jCheckBox1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(jTextField1)
        										.addComponent(jTextField3)
        										.addComponent(jTextField4))))
        							.addGap(8))))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(105)
        					.addComponent(jLabel1)))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jCheckBox1))
        			.addGap(10)
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2)
        				.addComponent(jButton1)
        				.addComponent(jButton3))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initAyuda() {
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
        PanelAyudaLayout.setHorizontalGroup(
        	PanelAyudaLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(PanelAyudaLayout.createSequentialGroup()
        			.addGap(158)
        			.addComponent(Titulo1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(150))
        		.addGroup(PanelAyudaLayout.createSequentialGroup()
        			.addGap(52)
        			.addComponent(paneldebotoenes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(76, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, PanelAyudaLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(Area1, GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );
        PanelAyudaLayout.setVerticalGroup(
        	PanelAyudaLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PanelAyudaLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(Titulo1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(Area1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(paneldebotoenes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        PanelAyuda.setLayout(PanelAyudaLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(PanelAyuda, GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(PanelAyuda, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean exception = false;
        pasword = jTextField1.getText();
        clave = jTextField3.getText();
        try {
            numchar = Integer.parseInt(jTextField4.getText());
        } catch (Exception e) {
            exception = true;
            JOptionPane.showMessageDialog(null, "Introduzca un valor correcto en el campo \"Número\"", "Error de Formato", 0);
        }
        if (!exception) {
            this.setSize(500, 330);
            mayusculas = jCheckBox1.isSelected();
            pass = new Paswords(pasword, clave, numchar, mayusculas);
            contraseña = pass.inicializar(pass);
            lapass = String.valueOf(contraseña);
            jTextField5.setText(lapass);
            jLabel7.setVisible(true);
            jTextField5.setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField1.setEditable(true);
        jTextField3.setEditable(true);
        jTextField4.setEditable(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PanelAyuda.setVisible(true);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {  
        this.setSize(500, 270);
        PanelAyuda.setVisible(false);
        jPanel2.setVisible(true);
        
    } 
    
    private void BotonPresentacionActionPerformed(java.awt.event.ActionEvent evt) {                                                  
         Area1.setText("Olvidate de tener una contraseña distinta en cada sitio"
                 + " (Facebook, Correo, \nTwitter...) y nunca acordarte de cual"
                 + " es, de poner contraseñas fáciles para \npoder recordarlas"
                 + " y que sea más facil que te la averiguen robandote tus"
                 + " datos.\nCon CreateKeys solo tendrás que acordarte de una"
                 + " única contraseña (Tu Clave)\nda igual lo fácil o simple"
                 + " que sea, ya que mediante nuestro porgrama \ncombinamos tu"
                 + " clave con tu contraseña y una serie de variables para"
                 + " darte una\nnueva contraseña única y dificl de que te la"
                 + " roben.\n");

    }  
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
                new VPassword().setVisible(true);

            }
        });
    }
    private javax.swing.JTextArea Area1;
    private javax.swing.JButton BotonPresentacion;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JPanel PanelAyuda;
    private javax.swing.JLabel Titulo1;
      private javax.swing.JPanel paneldebotoenes;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
