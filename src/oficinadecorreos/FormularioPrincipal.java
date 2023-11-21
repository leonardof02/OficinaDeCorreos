/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oficinadecorreos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leodev
 */
public class FormularioPrincipal extends javax.swing.JFrame {
    
    private FormularioRecibirCorrespondencia formularioRecibirCorrespondencia;
    private ControladorCorrespondencia controladorCorrespondencia;

    public FormularioPrincipal() {
        initComponents();
        controladorCorrespondencia = new ControladorCorrespondencia();
        formularioRecibirCorrespondencia = new FormularioRecibirCorrespondencia( controladorCorrespondencia,this.jTable1.getModel() );
    }
    
    public void refrescarTabla() {
        DefaultTableModel tabla = ((DefaultTableModel) jTable1.getModel());
        tabla.setRowCount(0);
        for( Correspondencia c : controladorCorrespondencia.getListaCorrespondencia() ) {
            if( c instanceof Carta) {
                Carta carta = (Carta) c;
                tabla.addRow(new Object[] { carta.getNombre(), carta.getDireccionDestinatario(), carta.getNombreRemitente(), "Carta", carta.getFechaEnvio(), carta.esDelExterior() });
            }
            if( c instanceof Telegrama) {
                Telegrama telegrama = (Telegrama) c;
                tabla.addRow(new Object[] {
                    telegrama.getNombre(), telegrama.getDireccionDestinatario(), telegrama.getNombreRemitente(), "Telegrama", null, null,
                    telegrama.getCantidadPalabras(), telegrama.getImpuestoAplicado()
                });
            }
            if( c instanceof BultoPostal) {
                BultoPostal bulto = (BultoPostal) c;
                tabla.addRow(new Object[] {
                    bulto.getNombre(), bulto.getDireccionDestinatario(), bulto.getNombreRemitente(), "Bulto Postal", null, null,
                    null, null, bulto.getPeso(), bulto.getUrgencia()
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        EntregarCorrespondenciaBtn = new javax.swing.JButton();
        DespacharCorrespondenciaBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RecibirCorrespondenciaBtn = new javax.swing.JButton();
        CalcularGananciasBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oficina de Correos");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion del Destinatario", "Nombre del Remitente", "Tipo de Correspondencia", "Fecha de Envio", "Es del exterior", "Cantidad de Palabras", "Impuesto Aplicado", "Peso", "Urgencia de la Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("SF Pro Display", 0, 36)); // NOI18N
        jLabel2.setText("Correspondencia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        EntregarCorrespondenciaBtn.setBackground(new java.awt.Color(153, 153, 255));
        EntregarCorrespondenciaBtn.setText("ENTREGAR CORRESPONDENCIA");
        EntregarCorrespondenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntregarCorrespondenciaBtnActionPerformed(evt);
            }
        });

        DespacharCorrespondenciaBtn.setBackground(new java.awt.Color(255, 102, 102));
        DespacharCorrespondenciaBtn.setText("DESPACHAR CORRESPONDENCIA");
        DespacharCorrespondenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespacharCorrespondenciaBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("ACCIONES");

        RecibirCorrespondenciaBtn.setBackground(new java.awt.Color(153, 255, 153));
        RecibirCorrespondenciaBtn.setText("RECIBIR CORRESPONDENCIA");
        RecibirCorrespondenciaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecibirCorrespondenciaBtnActionPerformed(evt);
            }
        });

        CalcularGananciasBtn.setBackground(new java.awt.Color(204, 255, 102));
        CalcularGananciasBtn.setText("CALCULAR GANANCIAS TOTALES");
        CalcularGananciasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularGananciasBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DespacharCorrespondenciaBtn)
                                .addGap(18, 18, 18)
                                .addComponent(CalcularGananciasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(RecibirCorrespondenciaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EntregarCorrespondenciaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(575, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecibirCorrespondenciaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntregarCorrespondenciaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DespacharCorrespondenciaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcularGananciasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntregarCorrespondenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntregarCorrespondenciaBtnActionPerformed
        String nombre = JOptionPane.showInputDialog("A quien se le hace la entrega?");
        String direccion = JOptionPane.showInputDialog("Inserte la direccion del destinatario");
        
        int indice = controladorCorrespondencia.entregarCorrespondenciaADestinatario(nombre, direccion);
        
        if( indice == -1 )
            JOptionPane.showMessageDialog(null, "Lo siento no coinciden esos datos con la correspondencia");
        
        ((DefaultTableModel) jTable1.getModel()).removeRow(indice);
        JOptionPane.showMessageDialog(null, "Correspondencia entregada a " + nombre + " en " + direccion);
        
    }//GEN-LAST:event_EntregarCorrespondenciaBtnActionPerformed

    private void RecibirCorrespondenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecibirCorrespondenciaBtnActionPerformed
        formularioRecibirCorrespondencia.setVisible(true);
    }//GEN-LAST:event_RecibirCorrespondenciaBtnActionPerformed

    private void CalcularGananciasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularGananciasBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcularGananciasBtnActionPerformed

    private void DespacharCorrespondenciaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespacharCorrespondenciaBtnActionPerformed
        controladorCorrespondencia.despacharCorrespondencia();
        refrescarTabla();
        JOptionPane.showMessageDialog(null, "Ha sido despachada una correspondencia");
    }//GEN-LAST:event_DespacharCorrespondenciaBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcularGananciasBtn;
    private javax.swing.JButton DespacharCorrespondenciaBtn;
    private javax.swing.JButton EntregarCorrespondenciaBtn;
    private javax.swing.JButton RecibirCorrespondenciaBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
