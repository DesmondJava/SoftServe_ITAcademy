package Week1.home_work1_unitTest;

import Week1.home_work1.JuniorEmployee;
import Week1.home_work1.MyExceptionIlligalArgument;
import Week1.home_work1.SeniorEmployee;
import org.testng.annotations.Test;

/**
 * Created by vshevchetc on 11.08.2015.
 */
public class TestCreateObjectEmployee {

    @Test(expectedExceptions = MyExceptionIlligalArgument.class)
    public void createEmployeeJuniorNegativeParameters1() {
        new JuniorEmployee("Anny", 2, 20, 148);
    }

    @Test(expectedExceptions = MyExceptionIlligalArgument.class)
    public void createEmployeeSeniorNegativeParameters1() {
        new SeniorEmployee("Anny", 2, 20, 148);
    }

    @Test(expectedExceptions = MyExceptionIlligalArgument.class)
    public void createEmployeeJuniorNegativeParameters2() {
        new JuniorEmployee("Anny", 23, 10, 160);
    }

    @Test(expectedExceptions = MyExceptionIlligalArgument.class)
    public void createEmployeeSeniorNegativeParameters2() {
        new SeniorEmployee("Anny", 23, 10, 160);
    }

    @Test
    public void createEmployeeJuniorPositiveParameters() {
        new JuniorEmployee("Anny", 30, 10, 148);
    }

    @Test
    public void createEmployeeSeniorPositiveParameters() {
        new SeniorEmployee("Anny", 30, 10, 148);
    }

}
