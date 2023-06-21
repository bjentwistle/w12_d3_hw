import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;
    @Before
    public void before(){
        developer = new Developer("Jane", "JD 87 65 23 D", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Jane", developer.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("JD 87 65 23 D", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(32000, developer.raiseSalary(2000), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(300, developer.payBonus(), 0.0);
    }
}
