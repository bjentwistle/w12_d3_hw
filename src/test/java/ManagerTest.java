import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Ted", "SW 87 65 23 D", 50000, "Payments");
    }

    @Test
    public void hasName() {
        assertEquals("Ted", manager.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("SW 87 65 23 D", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDeptartment(){
        assertEquals("Payments", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(55000, manager.raiseSalary(5000), 0.0);
    }
    @Test
    public void canPayBonus(){
        assertEquals(500, manager.payBonus(), 0.0);
    }

}
