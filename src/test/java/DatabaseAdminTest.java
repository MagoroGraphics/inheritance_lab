import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John", "98798GHGD766", 65000);
    }

    @Test
    public void hasName(){
        assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("98798GHGD766", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(65000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10000);
        assertEquals(75000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(650, databaseAdmin.getBonus(), 0.0);
    }

    @Test
    public void canOnlyRaiseSalaryIfPositiveNum(){
        databaseAdmin.raiseSalary(-1000);
        assertEquals(65000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Magda");
        assertEquals("Magda", databaseAdmin.getName());
    }

    @Test
    public void canChangeNameIfNotNull(){
        databaseAdmin.setName(null);
        assertEquals("John", databaseAdmin.getName());
    }
}
