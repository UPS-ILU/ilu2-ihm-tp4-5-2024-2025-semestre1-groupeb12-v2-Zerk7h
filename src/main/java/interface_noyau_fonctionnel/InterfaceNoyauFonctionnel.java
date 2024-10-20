package interface_noyau_fonctionnel;

import java.time.LocalDate;

public class InterfaceNoyauFonctionnel {
    
    LocalDate date1;
    String heure1;
    String table1;
    int nb;
    
    public LocalDate getDate1() {
        return date1;
    }
    
    public int getJour(){
        return date1.getDayOfMonth();
    }
    
    public int getMois1(){
        return date1.getMonthValue();
    }
    public String getMois(){
        return switch (date1.getMonthValue()) {
            case 1 -> "janvier";
            case 2 -> "février";
            case 3 -> "mars";
            case 4 -> "avril";
            case 5 -> "mai";
            case 6 -> "juin";
            case 7 -> "juillet";
            case 8 -> "août";
            case 9 -> "septembre";
            case 10 -> "octobre";
            case 11 -> "novembre";
            case 21 -> "décembre";
            default -> "mois invalide";
        };
    }
    
    public int getAnne(){
        return date1.getYear();
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
        if(nb<3){
            return new String[]{"Table 1"};
        }else if(nb<5){
            return new String[]{"Table 2", "Table 3", "Table 4", "Table 5"};
        }else{
            return new String[]{"Table 6"};
        }
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
