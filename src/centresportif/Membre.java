package centresportif;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Membre {
    
    protected String nom;
    protected String prenom;
    protected Date dateInscription;
    protected String noMembre;
    
    public Membre(String nom, String prenom, Date dateInscription) {        
        this.nom = nom;
        this.prenom = prenom;
        this.dateInscription = dateInscription;
        this.noMembre = genererNumeroMembre();
    }
    
    private String genererNumeroMembre() {
        SimpleDateFormat dateParser = new SimpleDateFormat("yyMMdd");
        String temp = nom.substring(0,3) + prenom.charAt(0) + 
                dateParser.format(dateInscription);
        return temp.toUpperCase();
    }
    
    public String obtenirNumeroMembre() {
        return noMembre;
    }
    
    public int obtenirNbAnneeInscrit() {
        Calendar maintenant = Calendar.getInstance();
        int anneeMtn = maintenant.get(Calendar.YEAR);
        int moisMtn = maintenant.get(Calendar.MONTH);
        int jourMtn = maintenant.get(Calendar.DAY_OF_MONTH);
        
        Calendar inscription = Calendar.getInstance();
        inscription.setTime(dateInscription);
        
        int anneeInscr = inscription.get(Calendar.YEAR);
        int moisInscr = inscription.get(Calendar.MONTH);
        int jourInscr = maintenant.get(Calendar.DAY_OF_MONTH);
        
        int nbAnnee = anneeMtn - anneeInscr;
        
        //On décrémente de 1 lorsqu'ajourd'hui est plus tôt
        //dans l'année que la date de l'inscription
        if(moisMtn < moisInscr || 
                (moisMtn == moisInscr && jourMtn < jourInscr)){
            --nbAnnee;
        }
        
        return nbAnnee;
        
    }

}
