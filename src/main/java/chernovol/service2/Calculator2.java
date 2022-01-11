package chernovol.service2;

import org.springframework.stereotype.Component;

@Component
public class Calculator2 {
    private PlusService2 plusService2;
    private MinusService2 minusService2;

    public Calculator2() {
        minusService2 = new MinusService2();
        plusService2 = new PlusService2();
    }

    public double calculate(double a, double b) {
        if (a > b) {
            return minusService2.minus(a, b);
        } else return plusService2.sum(a, b);
    }
}
