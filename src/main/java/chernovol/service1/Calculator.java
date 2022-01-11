package chernovol.service1;

public class Calculator {
    private PlusService plusService;
    private MinusService minusService;

    public Calculator() {
        minusService = new MinusService();
        plusService = new PlusService();
    }

    public double calculate(double a, double b) {
        if (a > b) {
            return minusService.minus(a, b);
        } else return plusService.sum(a, b);
    }
}
