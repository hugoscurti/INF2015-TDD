package centresportif;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MembreTest {
    private SimpleDateFormat dateParser;
    private Membre membre;
    
    @Before
    public void setUp() {
        dateParser = new SimpleDateFormat("yyyy-MM-dd");
    }
    
    @After
    public void tearDown() {
        dateParser = null;
    }
    
    @Test
    public void testObtenirNumeroMembre() throws ParseException {
        
        membre = new Membre("Scurti", "Hugo", dateParser.parse("2012-03-04"));
        assertEquals("SCUH120304", membre.obtenirNumeroMembre());
    }
    
    @Test
    public void testObtenirNbAnneeInscrit() throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -2);
        cal.add(Calendar.MONTH, -1);
        membre = new Membre("Scurti", "Hugo", cal.getTime());
        assertEquals(2, membre.obtenirNbAnneeInscrit());
    }
    
}