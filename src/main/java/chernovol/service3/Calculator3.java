package chernovol.service3;

public class Calculator3 {
    private PlusService3 plusService3;
    private MinusService3 minusService3;

    public Calculator3(PlusService3 plusService3, MinusService3 minusService3) {
        this.plusService3 = plusService3;
        this.minusService3 = minusService3;
    }

    public double calculate(double a, double b) {
        if (a > b) {
            return minusService3.minus(a, b);
        } else return plusService3.sum(a, b);
    }
}
