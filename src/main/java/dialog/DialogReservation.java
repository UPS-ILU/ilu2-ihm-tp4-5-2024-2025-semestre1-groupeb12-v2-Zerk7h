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
    private InterfaceNoyauFonctionnel inf;

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
        //inf.recupererDate(date);   a fare debuguer!!!!!!
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
        //faut appeler la methode trouvertabledisponible qui va mettre a jour la jListTable
    }

    public void handleTableSelectedEvent(int numTable) {
        //inf.recuperTable(numTable);
        frameReservation.enableButtonValider();
    }

    public void handleCancelEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void handleValidationEvent() {
        //TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
