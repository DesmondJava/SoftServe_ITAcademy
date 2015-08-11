package Week1.home_work1_unitTest;

import Week1.home_work1.Employee;
import Week1.home_work1.Worker;
import org.testng.annotations.Test;

public class JuniorEmployeeStub extends Employee implements Worker {


    public JuniorEmployeeStub() {
        super("Vanya", 44, 15, 789);
    }

    @Override
    public double getPayment() {
        int start = 500;
        int iteration = 200;
        return start + iteration * getSeniority();
    }


}
