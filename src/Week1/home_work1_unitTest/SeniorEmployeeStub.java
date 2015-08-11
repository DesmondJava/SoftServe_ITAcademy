package Week1.home_work1_unitTest;

import Week1.home_work1.Worker;

/**
 * Created by vshevchetc on 11.08.2015.
 */
public class SeniorEmployeeStub implements Worker {
    @Override
    public String getName() {
        return "";
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
