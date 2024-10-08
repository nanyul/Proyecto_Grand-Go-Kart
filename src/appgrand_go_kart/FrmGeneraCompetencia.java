/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appgrand_go_kart;
 import capaSimulador.Competidor;
 import capaSimulador.Competencia;
 import capaSimulador.Simulacion;
 import appgrand_go_kart.FrmRegistroCompetidor;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author araya
 */
public class FrmGeneraCompetencia extends javax.swing.JFrame {
    private Simulacion oSimulacion;
    /**
     * Creates new form FrmGeneraCompetencia
     */
    public FrmGeneraCompetencia(Simulacion simulacion) {
        this.oSimulacion = simulacion;
        initComponents();
        cargarCompetencias();
    }
    
    private void cargarCompetencias(){   
        if (!oSimulacion.competenciasRegistradas()) { //verifica si no se han generado ya las competencias
            oSimulacion.generarCompetencias();
            JOptionPane.showMessageDialog(this, "Se generaron las competencias");
        }
         Set<String> nombresCompetenciasActuales = new HashSet<>(); //el set string sirve para que no se dupliquen las competencias
    for (int i = 0; i < cmbCompetencias.getItemCount(); i++) {
        nombresCompetenciasActuales.add(cmbCompetencias.getItemAt(i));
    }
     
    for (Competencia competencia : oSimulacion.getCompetencias()) {
        if (competencia != null && !nombresCompetenciasActuales.contains(competencia.getNombre())) {
            cmbCompetencias.addItem(competencia.getNombre());
        }      
       
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaGeneral = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaCategoria = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaEquipos = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();
        cmbCompetencias = new javax.swing.JComboBox<>();
        btnSimular = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txaCompetencia = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel1.setText("Competencia en curso :");

        txaGeneral.setEditable(false);
        txaGeneral.setColumns(20);
        txaGeneral.setRows(5);
        txaGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clasificación General", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 14))); // NOI18N
        jScrollPane2.setViewportView(txaGeneral);

        txaCategoria.setEditable(false);
        txaCategoria.setColumns(20);
        txaCategoria.setRows(5);
        txaCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Clasificación Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 14))); // NOI18N
        jScrollPane3.setViewportView(txaCategoria);

        txaEquipos.setEditable(false);
        txaEquipos.setColumns(20);
        txaEquipos.setRows(5);
        txaEquipos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clasificación por Equipos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 14))); // NOI18N
        jScrollPane4.setViewportView(txaEquipos);

        btnVolver.setBackground(new java.awt.Color(192, 229, 234));
        btnVolver.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusable(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        cmbCompetencias.setFocusable(false);
        cmbCompetencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCompetenciasActionPerformed(evt);
            }
        });

        btnSimular.setBackground(new java.awt.Color(192, 229, 234));
        btnSimular.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnSimular.setText("Simular");
        btnSimular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSimular.setFocusable(false);
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        txaCompetencia.setEditable(false);
        txaCompetencia.setColumns(20);
        txaCompetencia.setRows(5);
        txaCompetencia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clasificación Comptetencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 14))); // NOI18N
        jScrollPane5.setViewportView(txaCompetencia);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnSimular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void asignarCompetidoresCompetencias() {
        Competencia[] competencias = oSimulacion.getCompetencias();
        Competidor[] competidores = oSimulacion.getCompetidores(); //obtiene las competencias y los competidores
        
        for (Competencia competencia : competencias) {            //recorre las competencias y asigna los competidores          
                for (Competidor competidor : competidores) {                   
                        competencia.agregarCompetidor(competidor);
                    }
                }                   
        }

private void competenciasFinalizadas(){
    boolean finalizadas = true;
        for (Competencia competencia : oSimulacion.getCompetencias()) {
            if (!competencia.realizada()) {
                finalizadas = false;  
                break;      //verifica si ya todas las competenicas fueron finalizadas
            }
    }
        if (finalizadas) {
            Simulacion simulacion = Simulacion.getInstance();
            FrmGanadores oFrmGanadores = new FrmGanadores(simulacion);
            oFrmGanadores.setLocationRelativeTo(null);
            oFrmGanadores.setVisible(true);     //si todas las competencias fueron simuladas, muestra la ventana de ganadores
    }
}


private Competencia competenciaSeleccionada() {
        String nombreSeleccionado = (String) cmbCompetencias.getSelectedItem();
        for (Competencia competencia : oSimulacion.getCompetencias()) {
            if (competencia != null && competencia.getNombre().equals(nombreSeleccionado)) {  //permite saber que competencia esta seleccionada en el combobox
                return competencia;
            }
        }
        return null;
    }
    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cmbCompetenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCompetenciasActionPerformed
        // TODO add your handling code here:
        Competencia competenciaSeleccionada = competenciaSeleccionada(); 
    if (competenciaSeleccionada != null) {
        if (competenciaSeleccionada != null) {
        if (competenciaSeleccionada.realizada()) {          
            btnSimular.setEnabled(false);
        } else {
           
            btnSimular.setEnabled(true);    //permite que solo se pueda simular una sola vez cada competencia y mostrar los tiempos de esa competencia
        }
    }
} 
        String resultadosCompetencia = oSimulacion.resultadosCompetencia(competenciaSeleccionada);
        
        txaCompetencia.setText(resultadosCompetencia);
    
    }//GEN-LAST:event_cmbCompetenciasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
          cargarCompetencias();      
        btnSimular.setEnabled(true);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        // TODO add your handling code here:
        asignarCompetidoresCompetencias();
        
     try{
           for (int i = 0; i < oSimulacion.getCompetidores().length; i++) {
               if (oSimulacion.getCompetidores()[i] == null) {
                   throw new Exception("No se han registrado competidores");  //try para verificar que hay competidores
               }               
             }
    Competencia competenciaSeleccionada = competenciaSeleccionada();
           btnSimular.setEnabled(false);
       
        competenciaSeleccionada.generarTiempos();
        competenciaSeleccionada.setRealizada(true); //marca como realizada esa competencia
        String resultadosCompetencia = oSimulacion.resultadosCompetencia(competenciaSeleccionada);
        String resultadosGeneral = oSimulacion.resultadosGeneral();
        String resultadosCategoria = oSimulacion.resultadosCategoria();
        String resultadosEquipos = oSimulacion.resultadosEquipos();
    txaCompetencia.setText(resultadosCompetencia);
    txaGeneral.setText(resultadosGeneral);
    txaCategoria.setText(resultadosCategoria);
    txaEquipos.setText(resultadosEquipos);  
    btnSimular.setEnabled(false);
    competenciasFinalizadas(); //llama este para saber cuando todas las competencias han sido realizadas
 
    }//GEN-LAST:event_btnSimularActionPerformed
catch (Exception e){
               JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} 
}


    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCompetencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea txaCategoria;
    private javax.swing.JTextArea txaCompetencia;
    private javax.swing.JTextArea txaEquipos;
    private javax.swing.JTextArea txaGeneral;
    // End of variables declaration//GEN-END:variables
}
