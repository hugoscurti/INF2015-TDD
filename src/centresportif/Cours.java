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
    
}
