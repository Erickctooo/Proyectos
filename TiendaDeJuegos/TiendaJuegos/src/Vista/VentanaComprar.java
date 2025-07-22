
package Vista;

import Controlador.PlayDAO;
import Controlador.XboxDAO;
import Modelo.Play;
import Modelo.Xbox;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaComprar extends javax.swing.JFrame {
    int total, totalDinero;

    public VentanaComprar() {
        initComponents();
        PanelPlay.setVisible(false);
        PanelXbox.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jRadioPlay = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jRadioXbox = new javax.swing.JRadioButton();
        PanelXbox = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        btnVerXbox = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTXbox = new javax.swing.JTable();
        btnVolverXB = new javax.swing.JButton();
        btnComprarXbox = new javax.swing.JButton();
        PanelPlay = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVerPlay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPlay = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnComprarPlay = new javax.swing.JButton();
        btntotal = new javax.swing.JButton();
        btntotalDinero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioPlay.setText("PlayStation");
        jPanel1.add(jRadioPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 90, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Que tipo de juego desea buscar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jRadioXbox.setText("Xbox");
        jPanel1.add(jRadioXbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 80, 50));

        jLabel4.setText("Ingrese el codigo del juego que desea comprar:");

        btnVerXbox.setText("Ver Juegos");
        btnVerXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerXboxActionPerformed(evt);
            }
        });

        jTXbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Distribuidor", "Precio", "Duracion", "Multijugador", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTXbox);

        btnVolverXB.setText("Volver");
        btnVolverXB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverXBActionPerformed(evt);
            }
        });

        btnComprarXbox.setText("Comprar");
        btnComprarXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarXboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelXboxLayout = new javax.swing.GroupLayout(PanelXbox);
        PanelXbox.setLayout(PanelXboxLayout);
        PanelXboxLayout.setHorizontalGroup(
            PanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelXboxLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolverXB)
                .addGap(199, 199, 199))
            .addGroup(PanelXboxLayout.createSequentialGroup()
                .addGroup(PanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelXboxLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnComprarXbox))
                    .addGroup(PanelXboxLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelXboxLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(btnVerXbox)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PanelXboxLayout.setVerticalGroup(
            PanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXboxLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprarXbox))
                .addGap(51, 51, 51)
                .addComponent(btnVerXbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btnVolverXB)
                .addGap(92, 92, 92))
        );

        jPanel1.add(PanelXbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 510, 450));

        jLabel3.setText("Ingrese el codigo del juego que desea comprar:");

        btnVerPlay.setText("Ver Juegos");
        btnVerPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPlayActionPerformed(evt);
            }
        });

        jTPlay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Distribuidor", "Precio", "Año de lanzamiento", "DLC", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTPlay);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnComprarPlay.setText("Comprar");
        btnComprarPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPlayLayout = new javax.swing.GroupLayout(PanelPlay);
        PanelPlay.setLayout(PanelPlayLayout);
        PanelPlayLayout.setHorizontalGroup(
            PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlayLayout.createSequentialGroup()
                .addGroup(PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlayLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnComprarPlay))
                    .addGroup(PanelPlayLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPlayLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(btnVolver))
                    .addGroup(PanelPlayLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnVerPlay)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PanelPlayLayout.setVerticalGroup(
            PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlayLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprarPlay))
                .addGap(44, 44, 44)
                .addComponent(btnVerPlay)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(89, 89, 89))
        );

        jPanel1.add(PanelPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 510, 450));

        btntotal.setText("Total de juegos comprados");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });
        jPanel1.add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, -1, -1));

        btntotalDinero.setText("Dinero recaudado");
        btntotalDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalDineroActionPerformed(evt);
            }
        });
        jPanel1.add(btntotalDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/FondoF23.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(jRadioPlay.isSelected())
        {
            PanelPlay.setVisible(true);
            txtCodigo.requestFocus();
        }
        if(jRadioXbox.isSelected())
        {
            PanelXbox.setVisible(true);
            txtCod.requestFocus();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnVerXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerXboxActionPerformed
        limpiarTabla1();
        XboxDAO colo=new XboxDAO();
        ArrayList<Xbox> xb=colo.obtenerTodos();

        if(xb.size()>=0)
        {
            ArrayList <Xbox> alu=colo.obtenerTodos();
            if(alu.size()==0)
            JOptionPane.showMessageDialog(this, "No hay Juegos para mostrar");
            else
            {
                DefaultTableModel dtm=(DefaultTableModel)jTXbox.getModel();
                String [][] datos=new String[alu.size()][7];
                for (int i = 0; i < alu.size(); i++) {
                    datos[i][0]=alu.get(i).getCodigo();
                    datos[i][1]=String.valueOf(alu.get(i).getNombrejuego());
                    datos[i][2]=alu.get(i).getNombredistribuidor();
                    datos[i][3]=String.valueOf(alu.get(i).getPreciojuego());
                    datos[i][4]=String.valueOf(alu.get(i).getDuracionjuego());
                    datos[i][5]=String.valueOf(alu.get(i).isMultijugador());
                    datos[i][6]=String.valueOf(alu.get(i).getStock());

                    dtm.addRow(datos[i]);
                }
                jTXbox.setModel(dtm);
            }
        }
    }//GEN-LAST:event_btnVerXboxActionPerformed

    private void btnVerPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPlayActionPerformed
        limpiarTabla();
        PlayDAO colo=new PlayDAO();
        ArrayList<Play> p=colo.obtenerTodos();

        if(p.size()>=0)
        {
            ArrayList <Play> alu=colo.obtenerTodos();
            if(alu.size()==0)
            JOptionPane.showMessageDialog(this, "No hay Juegos para mostrar");
            else
            {
                DefaultTableModel dtm=(DefaultTableModel)jTPlay.getModel();
                String [][] datos=new String[alu.size()][7];
                for (int i = 0; i < alu.size(); i++) {
                    datos[i][0]=alu.get(i).getCodigo();
                    datos[i][1]=String.valueOf(alu.get(i).getNombrejuego());
                    datos[i][2]=alu.get(i).getNombredistribuidor();
                    datos[i][3]=String.valueOf(alu.get(i).getPreciojuego());
                    datos[i][4]=String.valueOf(alu.get(i).getAnnolanzamiento());
                    datos[i][5]=String.valueOf(alu.get(i).isDlc());
                    datos[i][6]=String.valueOf(alu.get(i).getStock());

                    dtm.addRow(datos[i]);
                }
                jTPlay.setModel(dtm);
            }
        }
        }
        public void limpiarTabla()
        {
            DefaultTableModel dtm=(DefaultTableModel)jTPlay.getModel();
            int n=jTPlay.getRowCount()-1;
            for (int i = 0; i <=n; i++) {
                dtm.removeRow(dtm.getRowCount()-1);
            }
        }
        public void limpiarTabla1()
        {
            DefaultTableModel dtm=(DefaultTableModel)jTXbox.getModel();
            int n=jTXbox.getRowCount()-1;
            for (int i = 0; i <=n; i++) {
                dtm.removeRow(dtm.getRowCount()-1);
            }

    }//GEN-LAST:event_btnVerPlayActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolverXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverXBActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverXBActionPerformed

    private void btnComprarPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarPlayActionPerformed
        PlayDAO colo=new PlayDAO();
        Play p=colo.buscarJuegoPlay(txtCodigo.getText());
        int cant=0;
        if(p==null)
            JOptionPane.showMessageDialog(this, "El juego ingresado no existe");
        else
        {
            cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea comprar"));
            if(p.existencia(cant)==true)
            {
                JOptionPane.showMessageDialog(this, "Su total a pagar es de: "+ p.totalApagar(cant));
                total+=cant;
                totalDinero+=p.totalApagar(cant);
                p.setStock(p.getStock()-cant);
                colo.modificarJuegoPlay(p);
            }
            else
                JOptionPane.showMessageDialog(this, "La cantidad que desea comprar es superior al stock del juego");
        }
    }//GEN-LAST:event_btnComprarPlayActionPerformed

    private void btnComprarXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarXboxActionPerformed
        XboxDAO colo=new XboxDAO();
        Xbox xb=colo.buscarJuegoXbox(txtCod.getText());
        int cant=0;
        if(xb==null)
            JOptionPane.showMessageDialog(this, "El juego ingresado no existe");
        else
        {
            cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea comprar"));
            if(xb.existencia(cant)==true)
            {
                JOptionPane.showMessageDialog(this, "Su total a pagar es de: "+ xb.totalApagar(cant));
                total+=cant;
                totalDinero+=xb.totalApagar(cant);
                xb.setStock(xb.getStock()-cant);
                colo.modificarJuegoXbox(xb);
            }
            else
                JOptionPane.showMessageDialog(this, "La cantidad que desea comprar es superior al stock del juego");
        }
    }//GEN-LAST:event_btnComprarXboxActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        JOptionPane.showMessageDialog(this, "El total de juegos vendidos es de: "+ total);
    }//GEN-LAST:event_btntotalActionPerformed

    private void btntotalDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalDineroActionPerformed
        JOptionPane.showMessageDialog(this, "La cantidad de dinero recaudado es de: "+ totalDinero);
    }//GEN-LAST:event_btntotalDineroActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPlay;
    private javax.swing.JPanel PanelXbox;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnComprarPlay;
    private javax.swing.JButton btnComprarXbox;
    private javax.swing.JButton btnVerPlay;
    private javax.swing.JButton btnVerXbox;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverXB;
    private javax.swing.JButton btntotal;
    private javax.swing.JButton btntotalDinero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioPlay;
    private javax.swing.JRadioButton jRadioXbox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTPlay;
    private javax.swing.JTable jTXbox;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
