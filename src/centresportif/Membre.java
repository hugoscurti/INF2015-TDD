package centresportif;

import java.util.Date;

public class Membre {

    protected String nom;
    protected String prenom;
    protected Date dateInscription;
    
    public Membre(String nom, String prenom, Date dateInscription) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateInscription = dateInscription;
    }

}
