/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appgrand_go_kart;
 import capaSimulador.Competidor;
 import capaSimulador.Competencia;
 import capaSimulador.Simulacion;
 import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
        
/**
 *
 * @author araya
 */
public class FrmRegistroCompetidor extends javax.swing.JFrame {
    private Competidor oCompetidor;
    private Competencia oCompetencia;
    private Simulacion oSimulacion;
    /**
     * Creates new form FrmRegistroCompetidor
     */
    public FrmRegistroCompetidor(Simulacion simulacion) {
        this.oSimulacion = simulacion;  
        initComponents();
        cargarCompetidores();
    }
    
    private void cargarCompetidores(){
        if (oSimulacion.getCompetidores().length > 0){ //metodo para generar los competidores y verificar que no han sido creados ya
            txaListaCompetidores.setText("");
            for (Competidor competidor : oSimulacion.getCompetidores()) {
                if (competidor != null){
                    txaListaCompetidores.append(competidor.toString());
                }
            }
            btnRegistrar.setEnabled(!oSimulacion.competidoresRegistrados());
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

        lblRegistrar = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnOrdenarIDAsc = new javax.swing.JButton();
        btnOrdenarIDDesc = new javax.swing.JButton();
        btnOrdenarEdadAsc = new javax.swing.JButton();
        btnOrdenarEdadDesc = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaListaCompetidores = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblRegistrar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblRegistrar.setText("Registrar Competidores");

        btnRegistrar.setBackground(new java.awt.Color(192, 229, 234));
        btnRegistrar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

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

        btnOrdenarIDAsc.setBackground(new java.awt.Color(192, 229, 234));
        btnOrdenarIDAsc.setText("Ordenar por ID ( ⬆ )");
        btnOrdenarIDAsc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarIDAsc.setFocusable(false);
        btnOrdenarIDAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarIDAscActionPerformed(evt);
            }
        });

        btnOrdenarIDDesc.setBackground(new java.awt.Color(192, 229, 234));
        btnOrdenarIDDesc.setText("Ordenar por ID ( ⬇ )");
        btnOrdenarIDDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarIDDesc.setFocusable(false);
        btnOrdenarIDDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarIDDescActionPerformed(evt);
            }
        });

        btnOrdenarEdadAsc.setBackground(new java.awt.Color(192, 229, 234));
        btnOrdenarEdadAsc.setText("Ordenar por edad ( ⬆ )");
        btnOrdenarEdadAsc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarEdadAsc.setFocusable(false);
        btnOrdenarEdadAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarEdadAscActionPerformed(evt);
            }
        });

        btnOrdenarEdadDesc.setBackground(new java.awt.Color(192, 229, 234));
        btnOrdenarEdadDesc.setText("Ordenar por edad ( ⬇ )");
        btnOrdenarEdadDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrdenarEdadDesc.setFocusable(false);
        btnOrdenarEdadDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarEdadDescActionPerformed(evt);
            }
        });

        txaListaCompetidores.setEditable(false);
        txaListaCompetidores.setRows(5);
        txaListaCompetidores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Lista Competidores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 14))); // NOI18N
        txaListaCompetidores.setFocusable(false);
        jScrollPane3.setViewportView(txaListaCompetidores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addComponent(lblRegistrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(616, 616, 616)
                                .addComponent(btnRegistrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnOrdenarIDAsc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOrdenarEdadAsc))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOrdenarEdadDesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOrdenarIDDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrdenarIDAsc)
                            .addComponent(btnOrdenarIDDesc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrdenarEdadAsc)
                            .addComponent(btnOrdenarEdadDesc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnRegistrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnOrdenarIDDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarIDDescActionPerformed
        // TODO add your handling code here:
        int vIndiceMenor;
        try {
            if (!oSimulacion.competidoresRegistrados()) {
                throw new Exception("No se han registrado competidores");
        }
        for (int i = 0; i < oSimulacion.getCompetidores().length; i++) {
            vIndiceMenor = i;
            for (int j = i + 1; j < oSimulacion.getCompetidores().length; j++) {
                if (oSimulacion.getCompetidores()[j].getId() < oSimulacion.getCompetidores()[vIndiceMenor].getId()) {
                    vIndiceMenor = j;
                }
            }
            if (i != vIndiceMenor) {
                Competidor temp = oSimulacion.getCompetidores()[i];
                oSimulacion.getCompetidores()[i] = oSimulacion.getCompetidores()[vIndiceMenor];
                oSimulacion.getCompetidores()[vIndiceMenor] = temp;
            }
        }
        
        txaListaCompetidores.setText(""); // limpiar el TextArea
        for (Competidor competidor : oSimulacion.getCompetidores()) { //Genera la lista de los competidores
            txaListaCompetidores.append(competidor.toString());
         }
        }catch (Exception e){
             JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOrdenarIDDescActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
   
    }//GEN-LAST:event_formWindowOpened

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       if (!oSimulacion.competidoresRegistrados()){
           oSimulacion.registrarCompetidores();
           cargarCompetidores();
       }
    
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnOrdenarIDAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarIDAscActionPerformed
        // TODO add your handling code here:
        
        int vIndiceMenor;
        try {
            if (!oSimulacion.competidoresRegistrados()) {
                throw new Exception("No se han registrado competidores");
            }
                
        for (int i = 0; i < oSimulacion.getCompetidores().length; i++) {
            vIndiceMenor = i;
            for (int j = i + 1; j < oSimulacion.getCompetidores().length; j++) {
                if (oSimulacion.getCompetidores()[j].getId() > oSimulacion.getCompetidores()[vIndiceMenor].getId()) {
                    vIndiceMenor = j;
                }
            }
            if (i != vIndiceMenor) {
                Competidor temp = oSimulacion.getCompetidores()[i];
                oSimulacion.getCompetidores()[i] = oSimulacion.getCompetidores()[vIndiceMenor];
                oSimulacion.getCompetidores()[vIndiceMenor] = temp;
            }
        }
        
        txaListaCompetidores.setText(""); // limpiar el TextArea
        for (Competidor competidor : oSimulacion.getCompetidores()) { //Genera la lista de los competidores
            txaListaCompetidores.append(competidor.toString());
}
        }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }   
    }//GEN-LAST:event_btnOrdenarIDAscActionPerformed

    private void btnOrdenarEdadAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarEdadAscActionPerformed
        // TODO add your handling code here:
        int vIndiceMenor;
        try {
            if (!oSimulacion.competidoresRegistrados()) {
                throw new Exception("No se han registrado competidores");
        }
        for (int i = 0; i < oSimulacion.getCompetidores().length; i++) {
            vIndiceMenor = i;
            for (int j = i + 1; j < oSimulacion.getCompetidores().length; j++) {
                if (oSimulacion.getCompetidores()[j].getEdad() > oSimulacion.getCompetidores()[vIndiceMenor].getEdad()) {
                    vIndiceMenor = j;
                }
            }
            if (i != vIndiceMenor) {
                Competidor temp = oSimulacion.getCompetidores()[i];
                oSimulacion.getCompetidores()[i] = oSimulacion.getCompetidores()[vIndiceMenor];
                oSimulacion.getCompetidores()[vIndiceMenor] = temp;
            }
        }
        
        txaListaCompetidores.setText(""); // limpiar el TextArea
        for (Competidor competidor : oSimulacion.getCompetidores()) { //Genera la lista de los competidores
            txaListaCompetidores.append(competidor.toString());
         }
        }catch (Exception e){
                 JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);  
        }
    }//GEN-LAST:event_btnOrdenarEdadAscActionPerformed

    private void btnOrdenarEdadDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarEdadDescActionPerformed
        // TODO add your handling code here:
        int vIndiceMenor;
        try {
            if (!oSimulacion.competidoresRegistrados()) {
                throw new Exception("No se han registrado competidores");
        }
        for (int i = 0; i < oSimulacion.getCompetidores().length; i++) {
            vIndiceMenor = i;
            for (int j = i + 1; j < oSimulacion.getCompetidores().length; j++) {
                if (oSimulacion.getCompetidores()[j].getEdad() < oSimulacion.getCompetidores()[vIndiceMenor].getEdad()) {
                    vIndiceMenor = j;
                }
            }
            if (i != vIndiceMenor) {
                Competidor temp = oSimulacion.getCompetidores()[i];
                oSimulacion.getCompetidores()[i] = oSimulacion.getCompetidores()[vIndiceMenor];
                oSimulacion.getCompetidores()[vIndiceMenor] = temp;
            }
        }
        
        txaListaCompetidores.setText(""); // limpiar el TextArea
        for (Competidor competidor : oSimulacion.getCompetidores()) { //Genera la lista de los competidores
            txaListaCompetidores.append(competidor.toString());
         }
        }catch (Exception e){
             JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOrdenarEdadDescActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenarEdadAsc;
    private javax.swing.JButton btnOrdenarEdadDesc;
    private javax.swing.JButton btnOrdenarIDAsc;
    private javax.swing.JButton btnOrdenarIDDesc;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JTextArea txaListaCompetidores;
    // End of variables declaration//GEN-END:variables
}
