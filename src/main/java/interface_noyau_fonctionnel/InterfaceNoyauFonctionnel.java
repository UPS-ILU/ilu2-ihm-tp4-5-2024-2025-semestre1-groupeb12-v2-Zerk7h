package interface_noyau_fonctionnel;

import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import java.time.LocalDate;

public class InterfaceNoyauFonctionnel {
    
    LocalDate date1;
    String heure1;
    String table1;
    int nb;
    
    public int getJour(){
        return date1.getDayOfMonth();
    }
    
    public int getMois(){
        return date1.getMonthValue();
    }

    public String getHeure1() {
        return heure1;
    }

    public String getTable1() {
        return table1;
    }

    public int getNb() {
        return nb;
    }
    
    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        return new String[]{"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"};
    }

    public void recupererDate(LocalDate date){
        date1 = date;
        System.out.printf("La date: %s a été selectioné\n", date1);
    }
    
    public void recupererHeure(String heure){
        heure1 = heure;
        System.out.printf("L'heure: %s a été selectioné\n", heure1);
    }
    
    public void recupererNbPersonne(int nbPersonne){
        nb = nbPersonne;
        System.out.printf("Le nombre de personne: %d a été selectioné\n", nb);
    }
    
    public void recuperTable(String table){
        table1 = table;
        System.out.printf("la table: %s a été selectioné\n", table1);
    }
    
    
}
