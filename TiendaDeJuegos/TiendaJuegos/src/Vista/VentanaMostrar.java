
package Vista;

import Controlador.PlayDAO;
import Controlador.XboxDAO;
import Modelo.Play;
import Modelo.Xbox;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaMostrar extends javax.swing.JFrame {


    public VentanaMostrar() {
        initComponents();
        PanelPlay.setVisible(false);
        PanelXbox.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioPlay = new javax.swing.JRadioButton();
        jRadioXbox = new javax.swing.JRadioButton();
        PanelPlay = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscarPlay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPlay = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnModificarPlay = new javax.swing.JButton();
        btnEliminarPlay = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        PanelXbox = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        btnBuscarXbox = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTXbox = new javax.swing.JTable();
        btnVolverXB = new javax.swing.JButton();
        btnModificarXbox = new javax.swing.JButton();
        btnEliminarXbox = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Que tipo de juego desea buscar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        jRadioPlay.setText("PlayStation");
        jPanel1.add(jRadioPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 90, 50));

        jRadioXbox.setText("Xbox");
        jPanel1.add(jRadioXbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 80, 50));

        jLabel3.setText("Codigo:");

        btnBuscarPlay.setText("Buscar");
        btnBuscarPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPlayActionPerformed(evt);
            }
        });

        jTPlay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        btnModificarPlay.setText("Modificar");
        btnModificarPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPlayActionPerformed(evt);
            }
        });

        btnEliminarPlay.setText("Eliminar");
        btnEliminarPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPlayLayout = new javax.swing.GroupLayout(PanelPlay);
        PanelPlay.setLayout(PanelPlayLayout);
        PanelPlayLayout.setHorizontalGroup(
            PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlayLayout.createSequentialGroup()
                .addGroup(PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPlayLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnVolver))
                    .addGroup(PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(PanelPlayLayout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(btnBuscarPlay)
                            .addGap(46, 46, 46)
                            .addComponent(btnModificarPlay)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarPlay))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPlayLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PanelPlayLayout.setVerticalGroup(
            PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPlayLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPlay)
                    .addComponent(btnModificarPlay)
                    .addComponent(btnEliminarPlay))
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(87, 87, 87))
        );

        jPanel1.add(PanelPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 510, 450));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel4.setText("Codigo:");

        btnBuscarXbox.setText("Buscar");
        btnBuscarXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarXboxActionPerformed(evt);
            }
        });

        jTXbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        btnModificarXbox.setText("Modificar");
        btnModificarXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarXboxActionPerformed(evt);
            }
        });

        btnEliminarXbox.setText("Eliminar");
        btnEliminarXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarXboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelXboxLayout = new javax.swing.GroupLayout(PanelXbox);
        PanelXbox.setLayout(PanelXboxLayout);
        PanelXboxLayout.setHorizontalGroup(
            PanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXboxLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelXboxLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolverXB)
                .addGap(202, 202, 202))
            .addGroup(PanelXboxLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnBuscarXbox)
                .addGap(47, 47, 47)
                .addComponent(btnModificarXbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarXbox)
                .addGap(21, 21, 21))
        );
        PanelXboxLayout.setVerticalGroup(
            PanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelXboxLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelXboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarXbox)
                    .addComponent(btnModificarXbox)
                    .addComponent(btnEliminarXbox))
                .addGap(85, 85, 85)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(btnVolverXB)
                .addGap(87, 87, 87))
        );

        jPanel1.add(PanelXbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 510, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/FondoXbox.jpg"))); // NOI18N
        jLabel1.setText("Que tio de juego desea buscar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPlayActionPerformed
         limpiarTabla();
        PlayDAO colo=new PlayDAO();
        Play p=colo.buscarJuegoPlay(txtCodigo.getText());

        if(p==null)
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
                    datos[i][1]=alu.get(i).getNombrejuego();
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
        else 
        {

            DefaultTableModel dtm=(DefaultTableModel)jTPlay.getModel();
            String [] datos=new String[7];
            datos[0]=p.getCodigo();
            datos[1]=p.getNombrejuego();
            datos[2]=p.getNombredistribuidor();
            datos[3]=String.valueOf(p.getPreciojuego());
            datos[4]=String.valueOf(p.getAnnolanzamiento());
            datos[5]=String.valueOf(p.isDlc());
            datos[6]=String.valueOf(p.getStock());
            
            
            dtm.addRow(datos);
            jTPlay.setModel(dtm);
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
   
    }//GEN-LAST:event_btnBuscarPlayActionPerformed

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

    private void btnBuscarXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarXboxActionPerformed
        limpiarTabla1();
        XboxDAO col=new XboxDAO();
        Xbox xb=col.buscarJuegoXbox(txtCod.getText());

        if(xb==null)
        {
            ArrayList <Xbox> alu=col.obtenerTodos();
            if(alu.size()==0)
            JOptionPane.showMessageDialog(this, "No hay Juegos para mostrar");
            else
            {
                DefaultTableModel dtm=(DefaultTableModel)jTXbox.getModel();
                String [][] datos=new String[alu.size()][7];
                for (int i = 0; i < alu.size(); i++) {
                    datos[i][0]=alu.get(i).getCodigo();
                    datos[i][1]=alu.get(i).getNombrejuego();
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
        else 
        {

            DefaultTableModel dtm=(DefaultTableModel)jTXbox.getModel();
            String [] datos=new String[7];
            datos[0]=xb.getCodigo();
            datos[1]=xb.getNombrejuego();
            datos[2]=xb.getNombredistribuidor();
            datos[3]=String.valueOf(xb.getPreciojuego());
            datos[4]=String.valueOf(xb.getDuracionjuego());
            datos[5]=String.valueOf(xb.isMultijugador());
            datos[6]=String.valueOf(xb.getStock());
            
            
            dtm.addRow(datos);
            jTXbox.setModel(dtm);
        }
    }//GEN-LAST:event_btnBuscarXboxActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolverXBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverXBActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverXBActionPerformed

    private void btnModificarPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPlayActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jTPlay.getModel();
        int fila=jTPlay.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        else
        {
            boolean dlc=Boolean.parseBoolean(String.valueOf(jTPlay.getValueAt(fila, 5)));
            int Stock=Integer.parseInt(String.valueOf(jTPlay.getValueAt(fila, 6)));
            String codigo=String.valueOf(jTPlay.getValueAt(fila, 0));
            String nombrej=String.valueOf(jTPlay.getValueAt(fila, 1));
            String nombred=String.valueOf(jTPlay.getValueAt(fila, 2));
            int precio=Integer.parseInt(String.valueOf(jTPlay.getValueAt(fila, 3)));
            int anno=Integer.parseInt(String.valueOf(jTPlay.getValueAt(fila, 4)));
            
            Play pl=new Play(anno, dlc, codigo, nombrej, nombred, precio, Stock);
            PlayDAO colDAO=new PlayDAO();
            colDAO.modificarJuegoPlay(pl);
            JOptionPane.showMessageDialog(this, "Juego modificado");
        }
    }//GEN-LAST:event_btnModificarPlayActionPerformed

    private void btnEliminarPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPlayActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jTPlay.getModel();
        int fila=jTPlay.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        else
        {
            String codigo=String.valueOf(jTPlay.getValueAt(fila, 0));
            PlayDAO colDAO=new PlayDAO();
            colDAO.eliminarJuegosPlay(codigo);
            JOptionPane.showMessageDialog(this,"Juego Eliminado");
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarPlayActionPerformed

    private void btnEliminarXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarXboxActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jTXbox.getModel();
        int fila=jTXbox.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        else
        {
            String codigo=String.valueOf(jTXbox.getValueAt(fila, 0));
            XboxDAO colDAO=new XboxDAO();
            colDAO.eliminarJuegosXbox(codigo);
            JOptionPane.showMessageDialog(this,"Juego Eliminado");
            dtm.removeRow(fila);
        }
    }//GEN-LAST:event_btnEliminarXboxActionPerformed

    private void btnModificarXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarXboxActionPerformed
        DefaultTableModel dtm=(DefaultTableModel)jTXbox.getModel();
        int fila=jTXbox.getSelectedRow();
        if(fila==-1)
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        else
        {
            boolean multijugador=Boolean.parseBoolean(String.valueOf(jTXbox.getValueAt(fila, 5)));
            int Stock=Integer.parseInt(String.valueOf(jTXbox.getValueAt(fila, 6)));
            String codigo=String.valueOf(jTXbox.getValueAt(fila, 0));
            String nombrej=String.valueOf(jTXbox.getValueAt(fila, 1));
            String nombred=String.valueOf(jTXbox.getValueAt(fila, 2));
            int precio=Integer.parseInt(String.valueOf(jTXbox.getValueAt(fila, 3)));
            int duracion=Integer.parseInt(String.valueOf(jTXbox.getValueAt(fila, 4)));
            
            Xbox xx=new Xbox(multijugador, duracion, codigo, nombrej, nombred, precio, Stock);
            XboxDAO colDAO=new XboxDAO();
            colDAO.modificarJuegoXbox(xx);
            JOptionPane.showMessageDialog(this, "Juego modificado");
        }
    }//GEN-LAST:event_btnModificarXboxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPlay;
    private javax.swing.JPanel PanelXbox;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscarPlay;
    private javax.swing.JButton btnBuscarXbox;
    private javax.swing.JButton btnEliminarPlay;
    private javax.swing.JButton btnEliminarXbox;
    private javax.swing.JButton btnModificarPlay;
    private javax.swing.JButton btnModificarXbox;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnVolverXB;
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
