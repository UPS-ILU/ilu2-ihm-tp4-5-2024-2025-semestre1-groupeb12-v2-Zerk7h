package interface_noyau_fonctionnel;

import java.time.LocalDate;

public class InterfaceNoyauFonctionnel {

    public String[] trouverTableDisponible(int jour, int mois, int nombrePersonnes, String time) {
        return new String[]{"Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6"};
    }

    public void recupererDate(LocalDate date){
        LocalDate date1 = date;
        System.out.printf("La date: %d a été selectioné\n", date1);
    }
    
    public void recupererHeure(String heure){
        String heure1 = heure;
        System.out.printf("L'heure: %s a été selectioné\n", heure1);
    }
    
    public void recupererNbPersonne(int nbPersonne){
        int nb = nbPersonne;
        System.out.printf("Le nombre de personne: %d a été selectioné\n", nb);
    }
    
    public void recuperTable(String table){
        String table1 = table;
        System.out.printf("la table: %s a été selectioné\n", table1);
    }
}
