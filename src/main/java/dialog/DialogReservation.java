/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private final InterfaceNoyauFonctionnel inf;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        inf.recupererDate(date);
        frameReservation.enableHourSelector();
        frameReservation.enableButtonAnnuler();
    }
    
    
    public void handleTimeSelectedEvent(String time) {
        inf.recupererHeure(time);
        frameReservation.enableNbPersonsPanle();
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        inf.recupererNbPersonne(nbPersons);
        frameReservation.enablePickTablePanel();
        String[] tablesDisponibles = inf.trouverTableDisponible(inf.getJour(), inf.getMois1(), inf.getNb(), inf.getHeure1());
        frameReservation.updateTableList(tablesDisponibles);
    }

    public void handleTableSelectedEvent(String numTable) {
        inf.recuperTable(numTable);
        frameReservation.enableButtonValider();
    }

    public void handleCancelEvent() {
        frameReservation.disableAll();
    }

    public void handleValidationEvent() {
        frameReservation.validation(inf.getTable1(), inf.getHeure1(), inf.getJour(), inf.getMois(), inf.getAnne(), inf.getNb());
        frameReservation.disableAll();
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
