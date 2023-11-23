package oficinadecorreos;

import java.time.LocalDate;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.time.format.DateTimeFormatter;

public class FormularioRecibirCorrespondencia extends javax.swing.JFrame {

    private ControladorCorrespondencia controladorCorrespondencia;
    private TableModel tableModel;
    private ButtonGroup buttonGroup;

    public FormularioRecibirCorrespondencia(ControladorCorrespondencia controladorCorrespondencia, TableModel tableModel) {
        initComponents();
        this.setTitle("Recibir correspondencia");
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Carta", "Telegrama", "Bulto Postal"}));
        panelCarta.setVisible(false);
        panelTelegrama.setVisible(false);
        panelBultoPostal.setVisible(false);
        buttonGroup = new ButtonGroup();

        jRadioButton1.setActionCommand("Urgente");
        jRadioButton2.setActionCommand("Indiferente");
        jRadioButton3.setActionCommand("Medio");

        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        buttonGroup.add(jRadioButton3);

        this.controladorCorrespondencia = controladorCorrespondencia;
        this.tableModel = tableModel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreCorrespondenciaInput = new javax.swing.JTextField();
        nombreRemitenteInput = new javax.swing.JTextField();
        direccionDestinatarioInput = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RecibirCorrespondenciaButton = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelBultoPostal = new javax.swing.JPanel();
        pesoInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        panelTelegrama = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        CantidadPalabrasInput = new javax.swing.JSpinner();
        ImpuestoAplicadoInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        panelCarta = new javax.swing.JPanel();
        FechaDeEnvioInput = new javax.swing.JTextField();
        esDelExteriorInput = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Correspondencia");

        jLabel2.setText("Direccion del Destinatario");

        jLabel3.setText("Nombre Remitente");

        RecibirCorrespondenciaButton.setText("Recibir Correspondencia");
        RecibirCorrespondenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecibirCorrespondenciaButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Peso");

        jRadioButton1.setText("Urgente");

        jRadioButton2.setText("Indiferente");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setText("Medio");

        javax.swing.GroupLayout panelBultoPostalLayout = new javax.swing.GroupLayout(panelBultoPostal);
        panelBultoPostal.setLayout(panelBultoPostalLayout);
        panelBultoPostalLayout.setHorizontalGroup(
            panelBultoPostalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBultoPostalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBultoPostalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBultoPostalLayout.createSequentialGroup()
                        .addComponent(jRadioButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBultoPostalLayout.createSequentialGroup()
                        .addGroup(panelBultoPostalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(pesoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBultoPostalLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBultoPostalLayout.setVerticalGroup(
            panelBultoPostalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBultoPostalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBultoPostalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel5.setText("Cantidad de palabras");

        CantidadPalabrasInput.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel6.setText("Impuesto Aplicado");

        javax.swing.GroupLayout panelTelegramaLayout = new javax.swing.GroupLayout(panelTelegrama);
        panelTelegrama.setLayout(panelTelegramaLayout);
        panelTelegramaLayout.setHorizontalGroup(
            panelTelegramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelegramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTelegramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelegramaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(panelTelegramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CantidadPalabrasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ImpuestoAplicadoInput))
                .addContainerGap())
        );
        panelTelegramaLayout.setVerticalGroup(
            panelTelegramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelegramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTelegramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTelegramaLayout.createSequentialGroup()
                        .addComponent(CantidadPalabrasInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTelegramaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)))
                .addComponent(ImpuestoAplicadoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        esDelExteriorInput.setText("Es del exterior");
        esDelExteriorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esDelExteriorInputActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha de Envio (dd/mm/aaaa)");

        javax.swing.GroupLayout panelCartaLayout = new javax.swing.GroupLayout(panelCarta);
        panelCarta.setLayout(panelCartaLayout);
        panelCartaLayout.setHorizontalGroup(
            panelCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(esDelExteriorInput)
                    .addComponent(FechaDeEnvioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelCartaLayout.setVerticalGroup(
            panelCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FechaDeEnvioInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esDelExteriorInput)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(panelBultoPostal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelTelegrama, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(panelCarta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBultoPostal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(panelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTelegrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTelegrama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBultoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionDestinatarioInput)
                    .addComponent(nombreCorrespondenciaInput)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreRemitenteInput)
                    .addComponent(jLayeredPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(RecibirCorrespondenciaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCorrespondenciaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(direccionDestinatarioInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(nombreRemitenteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(RecibirCorrespondenciaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String tipo = (String) jComboBox1.getSelectedItem();
        if (tipo == "Carta") {
            panelCarta.setVisible(true);
            panelTelegrama.setVisible(false);
            panelBultoPostal.setVisible(false);
        }
        if (tipo == "Telegrama") {
            panelCarta.setVisible(false);
            panelTelegrama.setVisible(true);
            panelBultoPostal.setVisible(false);
        }
        if (tipo == "Bulto Postal") {
            panelCarta.setVisible(false);
            panelTelegrama.setVisible(false);
            panelBultoPostal.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void esDelExteriorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esDelExteriorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_esDelExteriorInputActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void RecibirCorrespondenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecibirCorrespondenciaButtonActionPerformed

        try {
            validarVacios();

            String nombre = nombreCorrespondenciaInput.getText();
            String direccion = direccionDestinatarioInput.getText();
            String nombreRemitente = nombreRemitenteInput.getText();

            String tipoDeCorrespondencia = (String) jComboBox1.getSelectedItem();

            if (tipoDeCorrespondencia.equals("Carta")) {

                LocalDate fechEnvio = LocalDate.parse( FechaDeEnvioInput.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy") );
                boolean esDelExterior = esDelExteriorInput.isSelected();

                controladorCorrespondencia.recibirCorrespondencia(new Carta(fechEnvio, esDelExterior, nombre, direccion, nombreRemitente));
                ((DefaultTableModel) tableModel).addRow(new Object[]{
                    nombre, direccion, nombreRemitente, tipoDeCorrespondencia, fechEnvio, esDelExterior
                });
            }

            if (tipoDeCorrespondencia.equals("Telegrama")) {

                int cantidadDePalabras = CantidadPalabrasInput.getComponentCount();
                double impuestoAplicado = Double.parseDouble(ImpuestoAplicadoInput.getText());

                controladorCorrespondencia.recibirCorrespondencia(new Telegrama(cantidadDePalabras, impuestoAplicado, nombre, direccion, nombreRemitente));
                ((DefaultTableModel) tableModel).addRow(new Object[]{
                    nombre, direccion, nombreRemitente, tipoDeCorrespondencia, null, null, cantidadDePalabras, impuestoAplicado
                });
            }

            if (tipoDeCorrespondencia.equals("Bulto Postal")) {

                double peso = Double.parseDouble(pesoInput.getText());
                String urgencia = buttonGroup.getSelection().getActionCommand();

                Urgencia urgenciaCorrespondencia = urgencia.equals("Urgente") ? Urgencia.URGENTE
                        : urgencia.equals("Medio") ? Urgencia.MEDIO : Urgencia.INDIFERENTE;

                controladorCorrespondencia.recibirCorrespondencia(new BultoPostal(peso, urgenciaCorrespondencia, nombre, direccion, nombreRemitente));

                ((DefaultTableModel) tableModel).addRow(new Object[]{
                    nombre, direccion, nombreRemitente, tipoDeCorrespondencia, null, null, null, null, peso, urgencia});
            }
            limpiarCampos();

        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Campos Invalidos, Revise e intentelo de nuevo", "Error", 0);
        }

    }//GEN-LAST:event_RecibirCorrespondenciaButtonActionPerformed

    void limpiarCampos() {
        nombreCorrespondenciaInput.setText("");
        direccionDestinatarioInput.setText("");
        nombreRemitenteInput.setText("");
        FechaDeEnvioInput.setText("");
        pesoInput.setText("");
        ImpuestoAplicadoInput.setText("");
    }

    void validarVacios() throws Exception {
        if (nombreCorrespondenciaInput.getText().equals("")
                || direccionDestinatarioInput.getText().equals("")
                || nombreRemitenteInput.getText().equals("")) {
            throw new Exception("Campos vacios");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner CantidadPalabrasInput;
    private javax.swing.JTextField FechaDeEnvioInput;
    private javax.swing.JTextField ImpuestoAplicadoInput;
    private javax.swing.JButton RecibirCorrespondenciaButton;
    private javax.swing.JTextField direccionDestinatarioInput;
    private javax.swing.JCheckBox esDelExteriorInput;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField nombreCorrespondenciaInput;
    private javax.swing.JTextField nombreRemitenteInput;
    private javax.swing.JPanel panelBultoPostal;
    private javax.swing.JPanel panelCarta;
    private javax.swing.JPanel panelTelegrama;
    private javax.swing.JTextField pesoInput;
    // End of variables declaration//GEN-END:variables
}
