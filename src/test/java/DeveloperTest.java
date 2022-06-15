import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Marc", "09809HHG7687", 50000);
    }

    @Test
    public void hasName(){
        assertEquals("Marc", developer.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("09809HHG7687", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, developer.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10000);
        assertEquals(60000, developer.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(500, developer.getBonus(), 0.0);
    }

    @Test
    public void canOnlyRaiseSalaryIfPositiveNum(){
        developer.raiseSalary(-1000);
        assertEquals(50000, developer.getSalary(), 0.0);
    }

    @Test
    public void canChangeName(){
        developer.setName("Anna");
        assertEquals("Anna", developer.getName());
    }

    @Test
    public void canChangeNameIfNotNull(){
        developer.setName(null);
        assertEquals("Marc", developer.getName());
    }


}
