import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Stuart", "8234YYh090", 70000, "Security");
    }

    @Test
    public void hasName(){
        assertEquals("Stuart", manager.getName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("8234YYh090", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(70000, manager.getSalary(), 0.0);
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(10000);
        assertEquals(80000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasPayBonus(){
        assertEquals(700, manager.getBonus(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("Security", manager.getDeptName());
    }

    @Test
    public void canOnlyRaiseSalaryIfPositiveNum(){
        manager.raiseSalary(-1000);
        assertEquals(70000, manager.getSalary(), 0.0);
    }

    @Test
    public void canChangeName(){
        manager.setName("Claire");
        assertEquals("Claire", manager.getName());
    }

    @Test
    public void canChangeNameIfNotNull(){
        manager.setName(null);
        assertEquals("Stuart", manager.getName());
    }

}
