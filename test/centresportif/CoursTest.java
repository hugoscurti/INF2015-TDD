package centresportif;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoursTest {
    private SimpleDateFormat dateParser;
    private Membre membre;
    private Cours cours;
    
    @Before
    public void setUp() {
        dateParser = new SimpleDateFormat("yyyy-MM-dd");
        cours = new Cours("Yoga", 30);
    }
    
    @After
    public void tearDown() {
        dateParser = null;
        cours = null;
    }

    @Test
    public void testAjouterMembre() throws ParseException{
        membre = new Membre("Scurti", "Hugo", dateParser.parse("2012-03-04"));
        cours.ajouterMembre(membre);
        assertEquals(1, cours.membresInscrits.size());
    }
    
    @Test
    public void testCalculerNbPlacesRestantes() throws ParseException {
        membre = new Membre("Scurti", "Hugo", dateParser.parse("2012-03-04"));
        cours.ajouterMembre(membre);
        assertEquals(29, cours.obtenirNbPlacesRestantes());
    }
    
    @Test
    public void testCalculerMoyenneAnciennete() throws ParseException {
        membre = new Membre("Scurti", "Hugo", dateParser.parse("2012-03-04"));  //2
        Membre membre2 = new Membre("Beaulieau", "Roger", dateParser.parse("2008-01-01")); //6
        Membre membre3 = new Membre("Bleau", "Joe", dateParser.parse("2014-01-01")); //0
        Membre membre4 = new Membre("Turcotte", "Anie", dateParser.parse("2013-02-03")); //1
        
        cours.ajouterMembre(membre);
        cours.ajouterMembre(membre2);
        cours.ajouterMembre(membre3);
        cours.ajouterMembre(membre4);
        
        assertEquals(2.25, cours.calculerMoyenneAnciennete(), 0);        
        
    }
    
    @Test
    public void testEstInscrit() throws ParseException {
        membre = new Membre("Scurti", "Hugo", dateParser.parse("2012-01-21"));
        
        assertFalse(cours.estInscrit(membre));
        cours.ajouterMembre(membre);
        assertTrue(cours.estInscrit(membre));
        
    }
    
}
