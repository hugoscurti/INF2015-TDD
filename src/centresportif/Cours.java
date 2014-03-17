package centresportif;

import java.util.TreeMap;

public class Cours {
    
    protected String nom;
    protected int nbPlacesMax;
    protected TreeMap<String, Membre> membresInscrits;
    
    public Cours(String nom, int nbPlacesMax) {
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
        membresInscrits = new TreeMap<>();
    }    
    
    public void ajouterMembre(Membre membre) {
        membresInscrits.put(membre.obtenirNumeroMembre(), membre);
    }
    
    
    public int obtenirNbPlacesRestantes() {
        return nbPlacesMax - membresInscrits.size();
    }
    
    public double calculerMoyenneAnciennete() {
        int totalAge = 0;
        
        for(Membre m : membresInscrits.values()) {
            totalAge += m.obtenirNbAnneeInscrit();
        }
        
        return totalAge / (double)membresInscrits.size();
    }
    
    public boolean estInscrit(Membre membre) {
        return membresInscrits.containsKey(membre.obtenirNumeroMembre());
    }
}
