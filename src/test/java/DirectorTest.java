import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Michael", "MM 87 65 23 D", 150000, "Finance", 1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Michael", director.getName());
    }

    @Test
    public void hasNiNumber() {
        assertEquals("MM 87 65 23 D", director.getNiNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(150000, director.getSalary(), 0.0);
    }

    @Test
    public void hasDeptartment() {
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        assertEquals(200000, director.raiseSalary(50000), 0.0);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1500, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget(), 0.0);
    }

}
