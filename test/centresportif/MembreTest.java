package centresportif;

import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MembreTest {
    private SimpleDateFormat dateParser;
    
    @Before
    public void setUp() {
        dateParser = new SimpleDateFormat("yyyy-MM-dd");
    }
    
    @After
    public void tearDown() {
        dateParser = null;
    }
    
}
