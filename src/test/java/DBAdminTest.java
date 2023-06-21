import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DBAdminTest {

    DBAdmin DBAdmin;
    @Before
    public void before(){
        DBAdmin = new DBAdmin("Simon", "SS 87 65 23 D", 22000);
    }

    @Test
    public void hasName() {
        assertEquals("Simon", DBAdmin.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("SS 87 65 23 D", DBAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(22000, DBAdmin.getSalary(), 0.0);
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(24000, DBAdmin.raiseSalary(2000), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(220, DBAdmin.payBonus(), 0.0);
    }
}

