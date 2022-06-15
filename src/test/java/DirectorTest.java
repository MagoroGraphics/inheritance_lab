import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", "4565GVV7654", 120000, "Direction", 25000000);
    }

    @Test
    public void hasName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("4565GVV7654", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(120000, director.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(130000, director.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(240, director.getBonus(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("Direction", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(25000000, director.getBudget(), 0.0);
    }

    @Test
    public void canOnlyRaiseSalaryIfPositiveNum(){
        director.raiseSalary(-1000);
        assertEquals(120000, director.getSalary(), 0.0);
    }
}
