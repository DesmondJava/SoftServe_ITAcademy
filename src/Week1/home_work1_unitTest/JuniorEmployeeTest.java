package Week1.home_work1_unitTest;

import Week1.home_work1.JuniorEmployee;
import Week1.home_work1.Worker;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JuniorEmployeeTest {

    Worker worker;

    @BeforeTest
    public void init(){
        worker = new JuniorEmployee("Helen", 40, 15, 3002);
    }

    @Test
    public void testGetPayment() throws Exception {
        AssertJUnit.assertEquals(worker.getPayment(), 3500.0);
    }
}