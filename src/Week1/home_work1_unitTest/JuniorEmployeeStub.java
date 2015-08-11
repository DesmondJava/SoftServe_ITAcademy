package Week1.home_work1_unitTest;

import Week1.home_work1.Worker;
import org.testng.annotations.Test;

public class JuniorEmployeeStub implements Worker {


    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public int getSeniority() {
        return 0;
    }

    @Override
    public double getPayment() {
        return 0;
    }


}
