/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entreprise2017;

/**
 *
 * @author moussa flo
 */
public class Entreprise2017 {
    public abstract class Employe {
    private String matricule;
    private String nom;
    private String prenom;
    private int age;
    private String date;
    public Employe(String matricule,String nom, String prenom, int age, String date){
 this.matricule = matricule;
 this.nom = nom;
 this.prenom = prenom;
 this.age = age;
 this.date = date;
}
public abstract double calcluerSalaire();
public String getTitre(){
    return "L'Employe";
}
public String getNom(){
    return getTitre()+prenom+" "+nom;
}}
 abstract class Commercial extends Employe{
     private double chiffreAffaire;
     public Commercial(String matricule, String nom, String prenom, int age, String date,double chiffreAffaire ){
     super (matricule, nom, prenom, age, date);
     this.chiffreAffaire = chiffreAffaire;
     }
     public double getChiffreAffaire(){
         return chiffreAffaire;
     }
    
 }
class Vendeur extends Commercial{
    private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 100;
    public Vendeur (String matricule, String nom, String prenom, int age, String date,double chiffreAffaire){
        super (matricule, nom, prenom, age, date, chiffreAffaire);
    }
    public double calculerSalaire(){
        return (POURCENT_VENDEUR * getChiffreAffaire())+BONUS_VENDEUR;
    }
    public String getTitre(){
        return "le vendeur";
    }
    class Representant extends Commercial{
        private final static double POURCENT_REPRESENTANT = 0.2;
        private final static int BONUS_REPRESENTANT = 200;
        public Representant(String matricule, String nom, String prenom, int age, String date,double chiffreAffaire){
            super (matricule, nom, prenom, age, date, chiffreAffaire);}
            public double calculerSalaire(){
                return (POURCENT_REPRESENTANT * getChiffreAffaire())+BONUS_REPRESENTANT;     
        }
            public String getTitre(){
                return"Le representant";
            }

        @Override
        public double calcluerSalaire() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public double calcluerSalaire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
