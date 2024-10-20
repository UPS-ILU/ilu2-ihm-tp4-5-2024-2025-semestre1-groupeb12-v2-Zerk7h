/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        hourSelector = new javax.swing.JComboBox<>();
        jLabelDateSelector = new javax.swing.JLabel();
        jLabelHourSelector = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        jLabelNumberPersonSelector = new javax.swing.JLabel();
        numberPersonSelector = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        jLabelTableSelector = new javax.swing.JLabel();
        jLabelTableSelectorPNG = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTable = new javax.swing.JList<>();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hourSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12H", "12H30", "13H", "13H30", "14H", "14H30", "20H", "20H30", "21H", "21H30", "22H", "22H30" }));
        hourSelector.setEnabled(false);
        hourSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourSelectorActionPerformed(evt);
            }
        });

        jLabelDateSelector.setText("1. Choisissez la date");

        jLabelHourSelector.setText("2. Choisissez l'heure");
        jLabelHourSelector.setEnabled(false);

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDateSelector)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHourSelector)
                    .addComponent(hourSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateSelector)
                    .addComponent(jLabelHourSelector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelNumberPersonSelector.setText("3. Indiquez le nombre de personnes");
        jLabelNumberPersonSelector.setEnabled(false);

        numberPersonSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        numberPersonSelector.setEnabled(false);
        numberPersonSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberPersonSelectorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumberPersonSelector)
                    .addComponent(numberPersonSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNumberPersonSelector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberPersonSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTableSelector.setText("4. Choisissez votre table");
        jLabelTableSelector.setEnabled(false);

        jLabelTableSelectorPNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N

        jListTable.setEnabled(false);
        jListTable.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTableValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListTable);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelTableSelectorPNG)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                    .addComponent(jLabelTableSelector))
                .addGap(33, 33, 33))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTableSelector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabelTableSelectorPNG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.setEnabled(false);
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jButtonValider.setText("Valider");
        jButtonValider.setEnabled(false);
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonValider)
                .addGap(18, 18, 18)
                .addComponent(jButtonAnnuler)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler)
                    .addComponent(jButtonValider))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void hourSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourSelectorActionPerformed
        System.out.println("presentation.FrameReservation.hourSelectorHourChanged()");
        String hour = (String) hourSelector.getSelectedItem();
        dialog.handleTimeSelectedEvent(hour);
    }//GEN-LAST:event_hourSelectorActionPerformed

    private void numberPersonSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberPersonSelectorActionPerformed
        System.out.println("presentation.FrameReservation.numberPersonSelectorActionPerformed()");
        String person = (String) numberPersonSelector.getSelectedItem();
        int nbPerson = Integer.parseInt(person);
        dialog.handleNumOfPersonsSelectedEvent(nbPerson);
    }//GEN-LAST:event_numberPersonSelectorActionPerformed

    private void jListTableValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTableValueChanged
        if (!evt.getValueIsAdjusting()) {
            System.out.println("presentation.FrameReservation.jListTableValueChanged()");
            String table = (String) jListTable.getSelectedValue();
            dialog.handleTableSelectedEvent(table);
        }
    }//GEN-LAST:event_jListTableValueChanged

    
    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(dateEvent.getNewDate());
    }
    
    
    public void enableHourSelector(){
        jLabelHourSelector.setEnabled(true);
        hourSelector.setEnabled(true);
    }
    
    
    public void enableNbPersonsPanle(){
        jLabelNumberPersonSelector.setEnabled(true);
        numberPersonSelector.setEnabled(true);
    }
    
    public void enablePickTablePanel(){
        jLabelTableSelectorPNG.setEnabled(true);
        jLabelTableSelector.setEnabled(true);
        jListTable.setEnabled(true);
    }
    
    public void enableButtonAnnuler(){
        jButtonAnnuler.setEnabled(true);
    }
    
    public void enableButtonValider(){
        jButtonValider.setEnabled(true);
    }
    
    public void disableAll(){
        String[] tab={};
        
        datePicker.setDate(null);
        hourSelector.setSelectedItem(null);
        
        jButtonAnnuler.setEnabled(false);
        
        jLabelHourSelector.setEnabled(false);
        hourSelector.setEnabled(false);
        
        jLabelTableSelectorPNG.setEnabled(false);
        jLabelTableSelector.setEnabled(false);
        jListTable.setEnabled(false);
        jListTable.setListData(tab);
        jButtonValider.setEnabled(false);

        jLabelNumberPersonSelector.setEnabled(false);
        numberPersonSelector.setEnabled(false);
        
        numberPersonSelector.setSelectedIndex(-1);
    }
    
    public void validation(String table, String heure, LocalDate date, int nbPersonne){
        String message = String.format("La réservation de la %s pour %d personnes a été confirmée pour le %s à %s!", table, nbPersonne, date.toString(), heure);
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void updateTableList(String[] tables) {
        jListTable.setListData(tables);
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> hourSelector;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JLabel jLabelDateSelector;
    private javax.swing.JLabel jLabelHourSelector;
    private javax.swing.JLabel jLabelNumberPersonSelector;
    private javax.swing.JLabel jLabelTableSelector;
    private javax.swing.JLabel jLabelTableSelectorPNG;
    private javax.swing.JList<String> jListTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JComboBox<String> numberPersonSelector;
    private javax.swing.JPanel pickTablePanel;
    // End of variables declaration//GEN-END:variables

}
