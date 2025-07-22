package Vista;

import Controlador.PlayDAO;
import Controlador.XboxDAO;
import Modelo.Play;
import Modelo.Xbox;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class VentanaIngreso extends javax.swing.JFrame {

    /**
     * Creates new form VentanaIngresar
     */
    public VentanaIngreso() {
        initComponents();
        jPanelIngreso.setVisible(true);
        jPanelPlay.setVisible(false);
        jPanelXbox.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelIngreso = new javax.swing.JPanel();
        jPanelPlay = new javax.swing.JPanel();
        txtPrecio = new javax.swing.JTextField();
        txtAnnoLanzamiento = new javax.swing.JTextField();
        txtDistribuidor = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        rdlcTrue = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        rdlcFalse = new javax.swing.JRadioButton();
        btnGuardarPlay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jPanelXbox = new javax.swing.JPanel();
        txtCod = new javax.swing.JTextField();
        txtNomb = new javax.swing.JTextField();
        txtDist = new javax.swing.JTextField();
        txtPrec = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        rmultTrue = new javax.swing.JRadioButton();
        rmultiFalse = new javax.swing.JRadioButton();
        txtDuracion = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        btnGuardarXbox = new javax.swing.JButton();
        btnAcept = new javax.swing.JButton();
        rPlay = new javax.swing.JRadioButton();
        rXbox = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPlay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("Codigo");

        jLabel21.setText("Nombre juego");

        jLabel22.setText("Distribuidor");

        jLabel23.setText("Precio");

        jLabel24.setText("Año de lanzamiento");

        rdlcTrue.setText("Si");

        jLabel25.setText("¿Tiene DLC?");

        rdlcFalse.setText("No");

        btnGuardarPlay.setText("Guardar");
        btnGuardarPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPlayActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        javax.swing.GroupLayout jPanelPlayLayout = new javax.swing.GroupLayout(jPanelPlay);
        jPanelPlay.setLayout(jPanelPlayLayout);
        jPanelPlayLayout.setHorizontalGroup(
            jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(btnGuardarPlay)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPlayLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtDistribuidor)
                    .addComponent(txtPrecio)
                    .addComponent(txtAnnoLanzamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(txtCodigo)
                    .addGroup(jPanelPlayLayout.createSequentialGroup()
                        .addComponent(rdlcTrue)
                        .addGap(18, 18, 18)
                        .addComponent(rdlcFalse))
                    .addComponent(txtCantidad))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelPlayLayout.setVerticalGroup(
            jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtDistribuidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtAnnoLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(rdlcTrue)
                    .addComponent(rdlcFalse))
                .addGap(18, 18, 18)
                .addGroup(jPanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnGuardarPlay)
                .addGap(26, 26, 26))
        );

        jPanelIngreso.add(jPanelPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 320, 330));

        jPanelXbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecActionPerformed(evt);
            }
        });

        jLabel26.setText("Precio");

        jLabel27.setText("Distribuidor");

        jLabel28.setText("Nombre");

        jLabel29.setText("Codigo");

        rmultTrue.setText("Si");

        rmultiFalse.setText("No");

        jLabel30.setText("Duracion de juego");

        jLabel31.setText("¿Es multijugador?");

        jLabel3.setText("Cantidad");

        btnGuardarXbox.setText("Guardar");
        btnGuardarXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarXboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelXboxLayout = new javax.swing.GroupLayout(jPanelXbox);
        jPanelXbox.setLayout(jPanelXboxLayout);
        jPanelXboxLayout.setHorizontalGroup(
            jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelXboxLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCant)
                    .addGroup(jPanelXboxLayout.createSequentialGroup()
                        .addComponent(rmultTrue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(rmultiFalse))
                    .addComponent(txtCod)
                    .addComponent(txtNomb)
                    .addComponent(txtDist)
                    .addComponent(txtPrec)
                    .addComponent(txtDuracion))
                .addGap(54, 54, 54))
            .addGroup(jPanelXboxLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnGuardarXbox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelXboxLayout.setVerticalGroup(
            jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelXboxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtPrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(rmultTrue)
                    .addComponent(rmultiFalse))
                .addGap(18, 18, 18)
                .addGroup(jPanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarXbox)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanelIngreso.add(jPanelXbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 320, 330));

        btnAcept.setText("Aceptar");
        btnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptActionPerformed(evt);
            }
        });
        jPanelIngreso.add(btnAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        rPlay.setText("Juego de PlayStation");
        rPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPlayActionPerformed(evt);
            }
        });
        jPanelIngreso.add(rPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        rXbox.setText("Juego de Xbox");
        jPanelIngreso.add(rXbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¿Que desea ingresar?");
        jPanelIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        btnSalir.setText("Volver ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanelIngreso.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/FondoPS.png"))); // NOI18N
        jPanelIngreso.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 890, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPlayActionPerformed
        String codigo, nomjue,nomdis;
        int  precio,annoLanzamiento,stock;
        boolean dlc;
        Play pp;
        
        if(rdlcTrue.isSelected())
            dlc=true;
        else
            dlc=false;
        codigo=txtCodigo.getText();
        nomjue=txtNombre.getText();
        nomdis=txtDistribuidor.getText();
        if(IsInteger(txtPrecio.getText()))
        {
            precio=Integer.parseInt(txtPrecio.getText());
            if(IsInteger(txtAnnoLanzamiento.getText()))
            {
                annoLanzamiento=Integer.parseInt(txtAnnoLanzamiento.getText());
                if(IsInteger(txtCantidad.getText()))
                {
                    stock=Integer.parseInt(txtCantidad.getText());
                    pp=new Play(annoLanzamiento, dlc, codigo, nomjue, nomdis, precio, stock);
                    PlayDAO ppD=new PlayDAO();
                    if(ppD.buscarJuegoPlay(codigo)==null)
                    {
                        ppD.ingresarJuegoPlay(pp);
                        JOptionPane.showMessageDialog(this, "Juego de play ingresado");
                        txtCodigo.setText(null);
                        txtNombre.setText(null);
                        txtDistribuidor.setText(null);
                        txtPrecio.setText(null);
                        txtAnnoLanzamiento.setText(null);
                        txtCantidad.setText(null);
                        txtCodigo.requestFocus();
                        jPanelPlay.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Codigo de juego ya existe");
                        txtCodigo.setText(null);
                        txtNombre.setText(null);
                        txtDistribuidor.setText(null);
                        txtPrecio.setText(null);
                        txtAnnoLanzamiento.setText(null);
                        txtCantidad.setText(null);
                        txtCodigo.requestFocus();
                    }  
                }
                else
                {
                    txtCantidad.setText(null);
                    JOptionPane.showMessageDialog(this, "La Cantidad debe ser un entero");
                    txtCantidad.requestFocus();
                }
            }
            else
            {
                txtAnnoLanzamiento.setText(null);
                JOptionPane.showMessageDialog(this, "El año de lanzamiento debe ser un entero");
                txtAnnoLanzamiento.requestFocus();
            }
        }
        else
        {
            txtPrecio.setText(null);
            JOptionPane.showMessageDialog(this, "El precio debe ser un entero");
            txtPrecio.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarPlayActionPerformed

    private void txtPrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecActionPerformed

    private void btnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptActionPerformed
        if(rPlay.isSelected())
        {
            jPanelPlay.setVisible(true);
            txtCodigo.requestFocus();
        }
        if(rXbox.isSelected())
        {
            jPanelXbox.setVisible(true);
            txtCod.requestFocus();
        }
    }//GEN-LAST:event_btnAceptActionPerformed

    private void rPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPlayActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarXboxActionPerformed
        String codigo, nomjue,nomdis;
        int  precio,tiempojue,stock;
        boolean multi;
        Xbox xx;
        
        if(rmultTrue.isSelected())
            multi=true;
        else
            multi=false;
        codigo=txtCod.getText();
        nomjue=txtNomb.getText();
        nomdis=txtDist.getText();
        if(IsInteger(txtPrec.getText()))
        {
            precio=Integer.parseInt(txtPrec.getText());
            if(IsInteger(txtDuracion.getText()))
            {
                tiempojue=Integer.parseInt(txtDuracion.getText());
                if(IsInteger(txtCant.getText()))
                {
                    stock=Integer.parseInt(txtCant.getText());
                    xx=new Xbox(multi, tiempojue, codigo, nomjue, nomdis, precio, stock);
                    XboxDAO xxD=new XboxDAO();
                    if(xxD.buscarJuegoXbox(codigo)==null)
                    {
                        xxD.ingresarJuegoXbox(xx);
                        JOptionPane.showMessageDialog(this, "Juego de Xbox ingresado");
                        txtCod.setText(null);
                        txtNomb.setText(null);
                        txtDist.setText(null);
                        txtPrec.setText(null);
                        txtDuracion.setText(null);
                        txtCant.setText(null);
                        txtCod.requestFocus();
                        jPanelXbox.setVisible(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Codigo de juego ya existe");
                        txtCod.setText(null);
                        txtNomb.setText(null);
                        txtDist.setText(null);
                        txtPrec.setText(null);
                        txtDuracion.setText(null);
                        txtCant.setText(null);
                        txtCod.requestFocus();
                    }  
                }
                else
                {
                    txtCant.setText(null);
                    JOptionPane.showMessageDialog(this, "La Cantidad debe ser un entero");
                    txtCant.requestFocus();
                }
            }
            else
            {
                txtDuracion.setText(null);
                JOptionPane.showMessageDialog(this, "La duracion del juego debe ser un entero");
                txtDuracion.requestFocus();
            }
        }
        else
        {
            txtPrec.setText(null);
            JOptionPane.showMessageDialog(this, "El precio debe ser un entero");
            txtPrec.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarXboxActionPerformed
    public static boolean IsInteger(String text) 
    {
        int v;
        try 
        {
          v=Integer.parseInt(text);
          return true;
        } catch (NumberFormatException ex)
        {
           return false;
        }
    /**
     * @param args the command line arguments
     */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcept;
    private javax.swing.JButton btnGuardarPlay;
    private javax.swing.JButton btnGuardarXbox;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanelIngreso;
    private javax.swing.JPanel jPanelPlay;
    private javax.swing.JPanel jPanelXbox;
    private javax.swing.JRadioButton rPlay;
    private javax.swing.JRadioButton rXbox;
    private javax.swing.JRadioButton rdlcFalse;
    private javax.swing.JRadioButton rdlcTrue;
    private javax.swing.JRadioButton rmultTrue;
    private javax.swing.JRadioButton rmultiFalse;
    private javax.swing.JTextField txtAnnoLanzamiento;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDist;
    private javax.swing.JTextField txtDistribuidor;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrec;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
