package Week1.home_work1_unitTest;

import Week1.home_work1.JuniorEmployee;
import Week1.home_work1.SeniorEmployee;
import Week1.home_work1.Worker;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SeniorEmployeeTest {

    Worker worker;

    @BeforeTest
    public void init(){
        worker = new SeniorEmployeeStub();
    }

    @Test
    public void testGetPayment() throws Exception {
        AssertJUnit.assertEquals(worker.getPayment(), 5750.0);
    }
}